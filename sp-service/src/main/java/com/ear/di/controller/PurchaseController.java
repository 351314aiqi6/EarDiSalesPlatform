package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import com.ear.di.dao.GoodsInfoMapper;
import com.ear.di.dao.PurchaseInfoMapper;
import com.ear.di.dao.UserInfoMapper;
import com.ear.di.entity.*;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("/purchase")
public class PurchaseController {
    /**
     * 初始化
     */
    public final static String INIT = "00";

    /**
     * 已确认
     */
    public final static String CONFIRM = "01";

    /**
     * 已支付
     */
    public final static String PAYED = "02";

    /**
     * 已发货
     */
    public final static String SEND = "03";

    /**
     * 已收货
     */
    public final static String RECEIVE = "04";

    /**
     * 已取消
     */
    public final static String CANCEL = "99";

    /**
     * 申诉中
     */
    public final static String APPEAL = "05";


    private final UserInfoMapper userInfoMapper = SpringUtil.getBean(UserInfoMapper.class);

    private final GoodsInfoMapper goodsInfoMapper = SpringUtil.getBean(GoodsInfoMapper.class);

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final GoodsController goodsController = SpringUtil.getBean(GoodsController.class);

    private final PurchaseInfoMapper purchaseInfoMapper = SpringUtil.getBean(PurchaseInfoMapper.class);

    /**
     * 采购单申请
     *
     * @param goodsId            商品ID
     * @param purchaseUserId     用户ID
     * @param purchaseNumber     采购数
     * @param purchaseAdditional 采购备注信息
     * @param receiveAddress     采购地址
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/apply", method = {RequestMethod.GET, RequestMethod.POST})
    public Result apply(@RequestParam(name = "goodsId") String goodsId,
                        @RequestParam(name = "purchaseUserId") String purchaseUserId,
                        @RequestParam(name = "purchaseNumber") String purchaseNumber,
                        @RequestParam(name = "purchaseAdditional") String purchaseAdditional,
                        @RequestParam(name = "receiveAddress") String receiveAddress,
                        @RequestParam(name = "receiveName") String receiveName,
                        @RequestParam(name = "receivePhone") String receivePhone) {

        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(Long.parseLong(goodsId));
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(purchaseUserId));
        if (goodsInfo == null) {
            return Result.error(null, RespCode.GOODS_IS_NOT_EXIST);
        }
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        if (goodsInfo.getGoodsStock() < Integer.parseInt(purchaseNumber)) {
            return Result.error(null, RespCode.GOODS_STOCK_NOT_ENOUGH);
        }
        PurchaseInfo purchaseInfo = new PurchaseInfo();
        // 采购单ID
        purchaseInfo.setPurchaseId(String.valueOf(System.currentTimeMillis()));
        purchaseInfo.setPurchaseNumber(Integer.parseInt(purchaseNumber));
        purchaseInfo.setPurchaseUserId(purchaseUserId);
        purchaseInfo.setPayeeUserId(goodsInfo.getChnlUserId());
        purchaseInfo.setReceiveName(receiveName);
        purchaseInfo.setReceivePhone(receivePhone);
        purchaseInfo.setReceiveAddress(receiveAddress);
        purchaseInfo.setPurchaseStatus(INIT);
        purchaseInfo.setPurchaseAdditional(purchaseAdditional);
        purchaseInfo.setGoodsId(goodsId);
        purchaseInfo.setTotalPrice(goodsInfo.getGoodsPrice().multiply(new BigDecimal(purchaseInfo.getPurchaseNumber())));
        goodsInfo.setGoodsStock(goodsInfo.getGoodsStock() - purchaseInfo.getPurchaseNumber());
        // 修改库存
        return Result.judgeResult(goodsInfoMapper.updateByPrimaryKeySelective(goodsInfo) == 1
                && purchaseInfoMapper.insertSelective(purchaseInfo) == 1, purchaseInfo, RespCode.PURCHASE_APPLY_ERROR);
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
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(userId));
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            List<String> illegalStatus = new ArrayList<>();
            illegalStatus.add(RECEIVE);
            illegalStatus.add(APPEAL);
            illegalStatus.add(CANCEL);
            Map<String, Object> dataMap = new HashMap<>();
            PurchaseInfoExample example = new PurchaseInfoExample();
            example.createCriteria().andPurchaseUserIdEqualTo(userId).andPurchaseStatusNotIn(illegalStatus);
            dataMap.put("payerPurchaseList", purchaseInfoMapper.selectByExample(example));
            example.clear();
            example.createCriteria().andPayeeUserIdEqualTo(userId).andPurchaseStatusNotIn(illegalStatus);
            dataMap.put("payeePurchaseList", purchaseInfoMapper.selectByExample(example));
            example.clear();

            List<String> statusList = new ArrayList<>();
            statusList.add(RECEIVE);
            statusList.add(CANCEL);
            example.createCriteria().andPurchaseUserIdEqualTo(userId).andPurchaseStatusIn(statusList);
            List<PurchaseInfo> purchaseInfos1 = purchaseInfoMapper.selectByExample(example);
            example.clear();
            example.createCriteria().andPayeeUserIdEqualTo(userId).andPurchaseStatusIn(statusList);
            List<PurchaseInfo> purchaseInfos2 = purchaseInfoMapper.selectByExample(example);
            purchaseInfos1.addAll(purchaseInfos2);
            dataMap.put("closePurchaseList", purchaseInfos1);

            example.clear();
            example.createCriteria().andPurchaseUserIdEqualTo(userId).andPurchaseStatusEqualTo(APPEAL);
            List<PurchaseInfo> appealPurchaseList = purchaseInfoMapper.selectByExample(example);
            example.clear();
            example.createCriteria().andPayeeUserIdEqualTo(userId).andPurchaseStatusEqualTo(APPEAL);
            purchaseInfos2 = purchaseInfoMapper.selectByExample(example);
            appealPurchaseList.addAll(purchaseInfos2);
            dataMap.put("appealPurchaseList", appealPurchaseList);
            return Result.success(dataMap);
        }
    }

    /**
     * 采购单处理
     *
     * @param id             采购单序号
     * @param purchaseStatus 采购单状态
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/handle", method = {RequestMethod.GET, RequestMethod.POST})
    public Result handle(@RequestParam(name = "id") String id,
                         @RequestParam(name = "purchaseStatus") String purchaseStatus) {
        PurchaseInfo purchaseInfo = new PurchaseInfo();
        purchaseInfo.setId(Long.parseLong(id));
        purchaseInfo.setPurchaseStatus(purchaseStatus);
        return Result.judgeResult(purchaseInfoMapper
                .updateByPrimaryKeySelective(purchaseInfo) == 1, null, RespCode.PERFORM_APPLY_ERROR);
    }
}
