package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.MerchantInfoMapper;
import com.ear.di.entity.MerchantInfo;
import com.ear.di.entity.MerchantInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("/merchant")
public class MerchantController {
    /**
     * 激活状态
     */
    public final static String ACTIVE = "00";

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final MerchantInfoMapper merchantInfoMapper = SpringUtil.getBean(MerchantInfoMapper.class);

    private final ChnlAgentController chnlAgentController = SpringUtil.getBean(ChnlAgentController.class);

    /**
     * 商户注册
     *
     * @param merchantName     商户名称
     * @param chnlAgentId      商户所属渠道商
     * @param merchantPrivatId 商户证件号码
     * @param merchantAdress   商户地址
     * @param merchantPhone    商户手机号
     * @param merchantEmail    商户邮箱
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public Result register(@RequestParam(name = "merchantName") String merchantName,
                           @RequestParam(name = "chnlAgentId") String chnlAgentId,
                           @RequestParam(name = "userId") String userId,
                           @RequestParam(name = "merchantPrivatId") String merchantPrivatId,
                           @RequestParam(name = "merchantAdress") String merchantAdress,
                           @RequestParam(name = "merchantPhone") String merchantPhone,
                           @RequestParam(name = "merchantEmail") String merchantEmail) {
        MerchantInfoExample example = new MerchantInfoExample();
        MerchantInfoExample.Criteria criteria = example.createCriteria();
        criteria.andMerchantPrivatIdEqualTo(merchantPrivatId).andChnlAgentIdEqualTo(chnlAgentId);
        if (merchantInfoMapper.countByExample(example) > 0) {
            return Result.error(null, RespCode.MERCHANT_IS_ALREADY_EXIST);
        } else if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else if (chnlAgentController.queryChnlAgentList(null, chnlAgentId, null, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.CHNL_AGENT_NOT_EXIST);
        } else {
            MerchantInfo merchantInfo = new MerchantInfo();
            merchantInfo.setUserId(userId);
            merchantInfo.setMerchantId(String.valueOf(System.currentTimeMillis()));
            merchantInfo.setMerchantAdress(merchantAdress);
            merchantInfo.setMerchantEmail(merchantEmail);
            merchantInfo.setMerchantName(merchantName);
            merchantInfo.setMerchantPhone(merchantPhone);
            merchantInfo.setChnlAgentId(chnlAgentId);
            merchantInfo.setMerchantStatus(ACTIVE);
            merchantInfo.setMerchantPrivatId(merchantPrivatId);
            return Result.judgeResult(merchantInfoMapper.insertSelective(merchantInfo) == 1, merchantInfo, RespCode.MERCHANT_REGISTER_ERROR);
        }
    }

    /**
     * 商户信息修改
     *
     * @param merchantId      商户ID
     * @param merchantAddress 商户地址
     * @param merchantPhone   商户手机号
     * @param merchantEmail   商户邮箱
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "merchantId") String merchantId,
                         @RequestParam(name = "merchantName", required = false) String merchantName,
                         @RequestParam(name = "merchantAddress", required = false) String merchantAddress,
                         @RequestParam(name = "merchantPhone", required = false) String merchantPhone,
                         @RequestParam(name = "merchantEmail", required = false) String merchantEmail) {
        if (this.query(null, null, merchantId, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.MERCHANT_IS_NOT_EXIST);
        } else {
            MerchantInfoExample example = new MerchantInfoExample();
            example.createCriteria().andMerchantIdEqualTo(merchantId);
            MerchantInfo merchantInfo = new MerchantInfo();
            merchantInfo.setMerchantName(merchantName);
            merchantInfo.setMerchantAdress(merchantAddress);
            merchantInfo.setMerchantEmail(merchantEmail);
            merchantInfo.setMerchantPhone(merchantPhone);
            return Result.judgeResult(merchantInfoMapper.updateByExampleSelective(merchantInfo, example) == 1, merchantInfo, RespCode.MERCHANT_UPDATE_ERROR);
        }
    }

    /**
     * 商户信息查询
     *
     * @param merchantId        商户ID
     * @param chnlAgentId       商户所属渠道商
     * @param merchantPrivateId 商户证件号码
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "chnlAgentId", required = false) String chnlAgentId,
                        @RequestParam(name = "userId", required = false) String userId,
                        @RequestParam(name = "merchantPrivateId", required = false) String merchantPrivateId,
                        @RequestParam(name = "merchantId", required = false) String merchantId,
                        @RequestParam(name = "pageSize", required = false) String pageSize,
                        @RequestParam(name = "pageIndex", required = false) String pageIndex,
                        @RequestParam(name = "merchantStatus", required = false) String merchantStatus) {
        if (StringUtils.isBlank(pageSize)) {
            pageSize = "5";
        }
        if (StringUtils.isBlank(pageIndex)) {
            pageIndex = "1";
        }
        MerchantInfoExample example = new MerchantInfoExample();
        MerchantInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(userId)) {
            criteria.andUserIdEqualTo(userId);
        }
        if (StringUtils.isNotBlank(chnlAgentId)) {
            criteria.andChnlAgentIdEqualTo(chnlAgentId);
        }
        if (StringUtils.isNotBlank(merchantPrivateId)) {
            criteria.andMerchantPrivatIdEqualTo(merchantPrivateId);
        }
        if (StringUtils.isNotBlank(merchantId)) {
            criteria.andMerchantIdEqualTo(merchantId);
        }
        if (StringUtils.isNotBlank(merchantStatus)) {
            criteria.andMerchantStatusEqualTo(merchantStatus);
        }
        List<MerchantInfo> merchantInfos = merchantInfoMapper.selectByExample(example);
        Map<String, Object> dataMap = new HashMap<>();
        int end = Integer.parseInt(pageIndex) * Integer.parseInt(pageSize);
        int start = (Integer.parseInt(pageIndex) - 1) * Integer.parseInt(pageSize);
        if (end > merchantInfos.size()) {
            end = merchantInfos.size();
        }
        dataMap.put("merList", merchantInfos.subList(start, end));
        dataMap.put("totalSize", merchantInfos.size());
        return Result.success(dataMap);
    }

    /**
     * 商户信息查询
     *
     * @param merchantId        商户ID
     * @param chnlAgentId       商户所属渠道商
     * @param merchantPrivateId 商户证件号码
     * @return 交易结果
     */
    public Result query(String chnlAgentId, String merchantPrivateId, String merchantId, String merchantStatus) {
        return this.query(chnlAgentId, null, merchantPrivateId, merchantId, null, null, merchantStatus);
    }

    /**
     * 商户信息删除
     *
     * @param id 商户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    public Result delete(@RequestParam(name = "id") String id) {
        return Result.judgeResult(merchantInfoMapper.deleteByPrimaryKey(Long.parseLong(id)) == 1, null, RespCode.MERCHANT_UPDATE_ERROR);
    }

}
