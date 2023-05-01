package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.QuotationSheetMapper;
import com.ear.di.entity.KOLInfo;
import com.ear.di.entity.QuotationSheet;
import com.ear.di.entity.QuotationSheetExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;


@Controller
@CrossOrigin
@RequestMapping("/quotation")
public class QuotationController {
    private final QuotationSheetMapper quotationSheetMapper = SpringUtil.getBean(QuotationSheetMapper.class);


    /**
     * 查询农产品行情
     *
     * @param goodsName 商品名称
     * @return 行情信息
     */


    @ResponseBody
    @RequestMapping(value = "/selquoList",method = {RequestMethod.GET,RequestMethod.POST})
    public Result queryQuotaionList(
            @RequestParam(name = "goodsName")String goodsName
    ){
        QuotationSheetExample example = new QuotationSheetExample();
        QuotationSheetExample.Criteria criteria = example.createCriteria();
//        List<QuotationSheet> quotationSheets = quotationSheetMapper.selectByExample(example);
//        if (quotationSheets.isEmpty()){
//            return Result.success(null);
//        }
//        return Result.success(quotationSheets.get(0));
        if (StringUtils.isNotBlank(goodsName)){
            criteria.andGoodsNameEqualTo(goodsName);
        }
        return Result.success(quotationSheetMapper.selectByExample(example));
    }
}
