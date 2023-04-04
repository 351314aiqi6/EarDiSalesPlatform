package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.KOLPerformInfoMapper;
import com.ear.di.entity.KOLInfo;
import com.ear.di.entity.KOLPerformInfo;
import com.ear.di.entity.KOLPerformInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/perform")
public class PerformController {
    private final KOLController kolController = SpringUtil.getBean(KOLController.class);

    private final KOLPerformInfoMapper kolPerformInfoMapper = SpringUtil.getBean(KOLPerformInfoMapper.class);

    /**
     * 直播申请
     *
     * @param userId                用户ID
     * @param performUrl            直播URL
     * @param performStartDttm      直播开始时间
     * @param performEndDttm        直播接受时间
     * @param performGoodsIntroduce 直播商品介绍
     * @param merchantId            商户ID
     * @return 直播申请结果
     */
    @ResponseBody
    @RequestMapping(value = "/apply", method = {RequestMethod.GET, RequestMethod.POST})
    public Result apply(@RequestParam(name = "userId") String userId,
                        @RequestParam(name = "performUrl") String performUrl,
                        @RequestParam(name = "performStartDttm") String performStartDttm,
                        @RequestParam(name = "performEndDttm") String performEndDttm,
                        @RequestParam(name = "performGoodsIntroduce") String performGoodsIntroduce,
                        @RequestParam(name = "merchantId") String merchantId) {
        Result query = kolController.query(userId);
        if (query.dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.KOL_NOT_EXIST);
        } else {
            KOLInfo kolInfo = ((List<KOLInfo>) query.getResult()).get(0);
            KOLPerformInfo performInfo = new KOLPerformInfo();
            performInfo.setKolId(kolInfo.getKolId());
            performInfo.setApplyNumber(0);
            performInfo.setPerformUrl(performUrl);
            performInfo.setPerforId(String.valueOf(System.currentTimeMillis()));
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                performInfo.setPerformStartDttm(sdf.parse(performStartDttm));
                performInfo.setPerformEndDttm(sdf.parse(performEndDttm));
            } catch (ParseException e) {
                e.printStackTrace();
                return Result.error(null, RespCode.DATE_FORMATE_ERROR);
            }
            performInfo.setPerformGoodsIntroduce(performGoodsIntroduce);
            performInfo.setMerchantId(merchantId);
            return Result.judgeResult(kolPerformInfoMapper.insertSelective(performInfo) == 1, performInfo, RespCode.USER_OR_PASSWORD_ERROR);
        }
    }

    /**
     * 直播取消
     *
     * @param performId 直播ID
     * @return 直播取消结果
     */
    @ResponseBody
    @RequestMapping(value = "/cancel", method = {RequestMethod.GET, RequestMethod.POST})
    public Result cancel(@RequestParam(name = "performId") String performId) {
        KOLPerformInfoExample example = new KOLPerformInfoExample();
        example.createCriteria().andPerforIdEqualTo(performId);
        return Result.judgeResult(kolPerformInfoMapper.deleteByExample(example) == 1, null, RespCode.PERFORM_CANCEL_ERROR);
    }

    /**
     * 直播查询
     *
     * @param performId 直播ID
     * @return 直播取消结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "performId", required = false) String performId,
                        @RequestParam(name = "kolId", required = false) String kolId) {
        KOLPerformInfoExample example = new KOLPerformInfoExample();
        KOLPerformInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(performId)) {
            criteria.andPerforIdEqualTo(performId);
        }
        if (StringUtils.isNotBlank(kolId)) {
            criteria.andKolIdEqualTo(kolId);
        }
        return Result.success(kolPerformInfoMapper.selectByExample(example));
    }
}
