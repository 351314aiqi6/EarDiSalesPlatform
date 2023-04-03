package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.GoodsInfoMapper;
import com.ear.di.entity.GoodsInfo;
import com.ear.di.entity.GoodsInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 激活状态
     */
    public final static String ACTIVE = "00";

    private final GoodsInfoMapper goodsInfoMapper = SpringUtil.getBean(GoodsInfoMapper.class);

    private final MerchantController merchantController = SpringUtil.getBean(MerchantController.class);

    /**
     * 商品信息添加
     *
     * @param merchantId 商户ID
     * @param goodsDesc  商品描述
     * @param goodsImage 商品图片链接
     * @param goodsName  商品名称
     * @param goodsPrice 商品价格
     * @param goodsStock 商品库存
     * @param goodsType  商品类型
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public Result add(@RequestParam(name = "merchantId") String merchantId,
                      @RequestParam(name = "goodsDesc") String goodsDesc,
                      @RequestParam(name = "goodsImage") String goodsImage,
                      @RequestParam(name = "goodsName") String goodsName,
                      @RequestParam(name = "goodsPrice") String goodsPrice,
                      @RequestParam(name = "goodsStock") String goodsStock,
                      @RequestParam(name = "goodsType") String goodsType) {

        if (merchantController.query(null, null, merchantId, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.MERCHANT_IS_NOT_EXIST);
        } else {
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setGoodsDesc(goodsDesc);
            goodsInfo.setGoodsImage(goodsImage);
            goodsInfo.setGoodsName(goodsName);
            goodsInfo.setGoodsStatus(ACTIVE);
            goodsInfo.setGoodsType(goodsType);
            goodsInfo.setMerchantId(merchantId);
            goodsInfo.setGoodsPrice(new BigDecimal(goodsPrice));
            goodsInfo.setGoodsStock(Integer.parseInt(goodsStock));
            goodsInfo.setGoodsId(String.valueOf(System.currentTimeMillis()));
            return Result.judgeResult(goodsInfoMapper.insertSelective(goodsInfo) == 1, goodsInfo, RespCode.ADD_GOODS_ERROR);
        }
    }

    /**
     * 商品信息修改
     *
     * @param goodsId    商品ID
     * @param goodsDesc  商品描述
     * @param goodsImage 商品图片链接
     * @param goodsName  商品名称
     * @param goodsPrice 商品价格
     * @param goodsStock 商品库存
     * @param goodsType  商品类型
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "goodsId") String goodsId,
                         @RequestParam(name = "goodsDesc", required = false) String goodsDesc,
                         @RequestParam(name = "goodsImage", required = false) String goodsImage,
                         @RequestParam(name = "goodsName", required = false) String goodsName,
                         @RequestParam(name = "goodsPrice", required = false) String goodsPrice,
                         @RequestParam(name = "goodsStock", required = false) String goodsStock,
                         @RequestParam(name = "goodsType", required = false) String goodsType,
                         @RequestParam(name = "goodsStatus", required = false) String goodsStatus) {

        if (this.query(null, goodsId, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.GOODS_IS_NOT_EXIST);
        } else {
            GoodsInfoExample example = new GoodsInfoExample();
            example.createCriteria().andGoodsIdEqualTo(goodsId);
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setGoodsDesc(goodsDesc);
            goodsInfo.setGoodsImage(goodsImage);
            goodsInfo.setGoodsName(goodsName);
            goodsInfo.setGoodsStatus(goodsStatus);
            goodsInfo.setGoodsType(goodsType);
            if (goodsPrice != null) {
                goodsInfo.setGoodsPrice(new BigDecimal(goodsPrice));
            }
            if (goodsStock != null) {
                goodsInfo.setGoodsStock(Integer.parseInt(goodsStock));
            }
            return Result.judgeResult(goodsInfoMapper.updateByExampleSelective(goodsInfo, example) == 1, goodsInfo, RespCode.MERCHANT_UPDATE_ERROR);
        }
    }

    /**
     * 商品信息查询
     *
     * @param merchantId  商户ID
     * @param goodsId     商品ID
     * @param goodsStatus 商品状态
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "merchantId", required = false) String merchantId,
                        @RequestParam(name = "goodsId", required = false) String goodsId,
                        @RequestParam(name = "goodsStatus", required = false) String goodsStatus) {

        if (merchantController.query(null, null, merchantId, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.MERCHANT_IS_NOT_EXIST);
        } else {
            GoodsInfoExample example = new GoodsInfoExample();
            GoodsInfoExample.Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(merchantId)) {
                criteria.andMerchantIdEqualTo(merchantId);
            }
            if (StringUtils.isNotBlank(goodsId)) {
                criteria.andGoodsIdEqualTo(goodsId);
            }
            if (StringUtils.isNotBlank(goodsStatus)) {
                criteria.andGoodsStatusEqualTo(goodsStatus);
            }
            return Result.success(goodsInfoMapper.selectByExample(example));
        }
    }
}
