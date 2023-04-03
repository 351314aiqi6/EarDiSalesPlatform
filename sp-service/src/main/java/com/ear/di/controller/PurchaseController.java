package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import com.ear.di.dao.PurchaseInfoMapper;
import com.ear.di.entity.GoodsInfo;
import com.ear.di.entity.PurchaseInfo;
import com.ear.di.entity.PurchaseInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {
    /**
     * 激活状态
     */
    public final static String ACTIVE = "00";

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final GoodsController goodsController = SpringUtil.getBean(GoodsController.class);

    private final PurchaseInfoMapper purchaseInfoMapper = SpringUtil.getBean(PurchaseInfoMapper.class);

    /**
     * 采购单申请
     *
     * @param goodsId            商品ID
     * @param userId             用户ID
     * @param purchaseNumber     采购数
     * @param purchaseAdditional 采购备注信息
     * @param receiveAddress     采购地址
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/apply", method = {RequestMethod.GET, RequestMethod.POST})
    public Result apply(@RequestParam(name = "goodsId") String goodsId,
                        @RequestParam(name = "userId") String userId,
                        @RequestParam(name = "purchaseNumber") String purchaseNumber,
                        @RequestParam(name = "purchaseAdditional") String purchaseAdditional,
                        @RequestParam(name = "receiveAddress") String receiveAddress) {
        Result goods = goodsController.query(null, goodsId, GoodsController.ACTIVE);
        if (goods.dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.GOODS_IS_NOT_EXIST);
        } else if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            GoodsInfo goodsInfo = ((List<GoodsInfo>) goods.getData()).get(0);
            if (goodsInfo.getGoodsStock() < Integer.parseInt(purchaseNumber)) {
                return Result.error(null, RespCode.GOODS_STOCK_NOT_ENOUGH);
            } else {
                PurchaseInfo purchaseInfo = new PurchaseInfo();
                // 采购单ID
                purchaseInfo.setPurchaseId(String.valueOf(System.currentTimeMillis()));
                purchaseInfo.setPurchaseNumber(Integer.parseInt(purchaseNumber));
                purchaseInfo.setPurchaseUserId(userId);
                purchaseInfo.setPurchaseStatus(ACTIVE);
                purchaseInfo.setPurchaseAdditional(purchaseAdditional);
                purchaseInfo.setGoodsId(goodsId);
                purchaseInfo.setReceiveAddress(receiveAddress);
                purchaseInfo.setTotalPrice(goodsInfo.getGoodsPrice().multiply(new BigDecimal(purchaseInfo.getPurchaseNumber())));
                // 修改库存
                return Result.judgeResult(goodsController.update(goodsInfo.getGoodsId(), null, null, null, null,
                        String.valueOf(goodsInfo.getGoodsStock() - purchaseInfo.getPurchaseNumber()), null, null).isSuccess()
                        && purchaseInfoMapper.insertSelective(purchaseInfo) == 1, purchaseInfo, RespCode.PURCHASE_APPLY_ERROR);
            }
        }
    }

    /**
     * 采购单查询
     *
     * @param userId 用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "userId") String userId) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            PurchaseInfoExample example = new PurchaseInfoExample();
            example.createCriteria().andPurchaseUserIdEqualTo(userId);
            return Result.success(purchaseInfoMapper.selectByExample(example));
        }
    }
}
