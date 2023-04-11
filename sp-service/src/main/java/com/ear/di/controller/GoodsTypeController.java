package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.GoodsInfoMapper;
import com.ear.di.dao.GoodsTypeMapper;
import com.ear.di.entity.GoodsInfo;
import com.ear.di.entity.GoodsInfoExample;
import com.ear.di.entity.GoodsType;
import com.ear.di.entity.GoodsTypeExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("/goodsType")
public class GoodsTypeController {
    private final GoodsTypeMapper goodsTypeMapper = SpringUtil.getBean(GoodsTypeMapper.class);

    /**
     * 商品信息查询
     *
     * @param goodsTypeId 商品类型编号
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "goodsTypeId", required = false) String goodsTypeId) {
        GoodsTypeExample example = new GoodsTypeExample();
        if (StringUtils.isNotBlank(goodsTypeId)) {
            example.createCriteria().andGoodsTypeIdEqualTo(goodsTypeId);
        }
        return Result.success(goodsTypeMapper.selectByExample(example));
    }

    /**
     * 商品信息查询
     *
     * @param goodsTypeId 商品类型编号
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/addGoods", method = {RequestMethod.GET, RequestMethod.POST})
    public Result addGoods(@RequestParam(name = "goodsTypeId") String goodsTypeId,
                           @RequestParam(name = "goodsNumber") Long goodsNumber) {
        GoodsTypeExample example = new GoodsTypeExample();
        example.createCriteria().andGoodsTypeIdEqualTo(goodsTypeId);
        GoodsType goodsType = goodsTypeMapper.selectByExample(example).get(0);
        goodsType.setGoddsTypeNumber(goodsType.getGoddsTypeNumber() + goodsNumber);
        return Result.success(goodsTypeMapper.updateByPrimaryKeySelective(goodsType));
    }

}
