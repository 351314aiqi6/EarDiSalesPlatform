package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.ChnlAgentInfoMapper;
import com.ear.di.entity.ChnlAgentInfo;
import com.ear.di.entity.ChnlAgentInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("/chnl")
public class ChnlAgentController {

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final ChnlAgentInfoMapper chnlAgentInfoMapper = SpringUtil.getBean(ChnlAgentInfoMapper.class);

    /**
     * 添加渠道商
     *
     * @param chnlAgentName        渠道商名称
     * @param chnlAgentEmail       渠道商Email
     * @param chnlAgentAddress     渠道商地址
     * @param chnlAgentMobilePhone 渠道商手机号码
     * @return 执行结果
     */
    @ResponseBody
    @RequestMapping(value = "/addChnl", method = {RequestMethod.GET, RequestMethod.POST})
    public Result addChnl(@RequestParam(name = "userId") String userId,
                          @RequestParam(name = "chnlAgentName") String chnlAgentName,
                          @RequestParam(name = "chnlAgentEmail") String chnlAgentEmail,
                          @RequestParam(name = "chnlAgentAddress") String chnlAgentAddress,
                          @RequestParam(name = "chnlAgentMobilePhone") String chnlAgentMobilePhone) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            ChnlAgentInfo chnlAgentInfo = new ChnlAgentInfo();
            chnlAgentInfo.setUserId(userId);
            chnlAgentInfo.setChnlAgentName(chnlAgentName);
            chnlAgentInfo.setChnlAgentEmail(chnlAgentEmail);
            chnlAgentInfo.setChnlAgentAddress(chnlAgentAddress);
            chnlAgentInfo.setChnlAgentMobilePhone(chnlAgentMobilePhone);
            chnlAgentInfo.setChnlAgentId(String.valueOf(System.currentTimeMillis()));
            return Result.judgeResult(chnlAgentInfoMapper.insertSelective(chnlAgentInfo) == 1,
                    chnlAgentInfo, RespCode.ADD_CHNL_INFO_ERROR);
        }
    }

    /**
     * 渠道商信息修改
     *
     * @param chnlAgentId          渠道商ID
     * @param chnlAgentName        渠道商名称
     * @param chnlAgentEmail       渠道商Email
     * @param chnlAgentAddress     渠道商地址
     * @param chnlAgentMobilePhone 渠道商手机号码
     * @return 执行结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "chnlAgentId") String chnlAgentId,
                         @RequestParam(name = "chnlAgentName", required = false) String chnlAgentName,
                         @RequestParam(name = "chnlAgentEmail", required = false) String chnlAgentEmail,
                         @RequestParam(name = "chnlAgentAddress", required = false) String chnlAgentAddress,
                         @RequestParam(name = "chnlAgentMobilePhone", required = false) String chnlAgentMobilePhone) {
        if (this.queryChnlAgentList(null, chnlAgentId, null, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.CHNL_AGENT_NOT_EXIST);
        } else {
            ChnlAgentInfoExample example = new ChnlAgentInfoExample();
            example.createCriteria().andChnlAgentIdEqualTo(chnlAgentId);
            ChnlAgentInfo chnlAgentInfo = new ChnlAgentInfo();
            chnlAgentInfo.setChnlAgentName(chnlAgentName);
            chnlAgentInfo.setChnlAgentEmail(chnlAgentEmail);
            chnlAgentInfo.setChnlAgentAddress(chnlAgentAddress);
            chnlAgentInfo.setChnlAgentMobilePhone(chnlAgentMobilePhone);
            return Result.judgeResult(chnlAgentInfoMapper.updateByExampleSelective(chnlAgentInfo, example) == 1,
                    chnlAgentInfo, RespCode.ADD_CHNL_INFO_ERROR);

        }
    }

    /**
     * 渠道商列表查询
     *
     * @param endCreateDate   结束时间
     * @param startCreateDate 开始时间
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryChnlAgentList", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryChnlAgentList(
            @RequestParam(name = "userId", required = false) String userId,
            @RequestParam(name = "chnlAgentId", required = false) String chnlAgentId,
            @RequestParam(name = "endCreateDate", required = false) String endCreateDate,
            @RequestParam(name = "startCreateDate", required = false) String startCreateDate) {
        ChnlAgentInfoExample example = new ChnlAgentInfoExample();
        ChnlAgentInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(chnlAgentId)) {
            criteria.andChnlAgentIdEqualTo(chnlAgentId);
        }
        if (StringUtils.isNotBlank(userId)) {
            criteria.andUserIdEqualTo(userId);
        }
        try {
            if (StringUtils.isNotBlank(endCreateDate) && StringUtils.isNotBlank(startCreateDate)) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                criteria.andCreateTimeBetween(sdf.parse(startCreateDate), sdf.parse(endCreateDate));
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return Result.error(null, RespCode.DATE_FORMATE_ERROR);
        }
        return Result.success(chnlAgentInfoMapper.selectByExample(example));
    }

    /**
     * 删除渠道商
     *
     * @param chnlAgentId 渠道商编号
     * @return 执行结果
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    public Result delete(@RequestParam(name = "chnlAgentId") String chnlAgentId) {
        ChnlAgentInfoExample example = new ChnlAgentInfoExample();
        example.createCriteria().andChnlAgentIdEqualTo(chnlAgentId);
        return Result.judgeResult(chnlAgentInfoMapper.deleteByExample(example) == 1,
                null, RespCode.ADD_CHNL_INFO_ERROR);
    }

    /**
     * 渠道商列表查询
     *
     * @param endCreateDate   结束时间
     * @param startCreateDate 开始时间
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(
            @RequestParam(name = "userId", required = false) String userId,
            @RequestParam(name = "chnlAgentId", required = false) String chnlAgentId,
            @RequestParam(name = "endCreateDate", required = false) String endCreateDate,
            @RequestParam(name = "startCreateDate", required = false) String startCreateDate,
            @RequestParam(name = "pageSize", required = false) String pageSize,
            @RequestParam(name = "pageIndex", required = false) String pageIndex) {
        if (StringUtils.isBlank(pageSize)) {
            pageSize = "5";
        }
        if (StringUtils.isBlank(pageIndex)) {
            pageIndex = "1";
        }
        ChnlAgentInfoExample example = new ChnlAgentInfoExample();
        ChnlAgentInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(chnlAgentId)) {
            criteria.andChnlAgentIdEqualTo(chnlAgentId);
        }
        if (StringUtils.isNotBlank(userId)) {
            criteria.andUserIdEqualTo(userId);
        }
        try {
            if (StringUtils.isNotBlank(endCreateDate) && StringUtils.isNotBlank(startCreateDate)) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                criteria.andCreateTimeBetween(sdf.parse(startCreateDate), sdf.parse(endCreateDate));
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return Result.error(null, RespCode.DATE_FORMATE_ERROR);
        }
        List<ChnlAgentInfo> chnlAgentInfos = chnlAgentInfoMapper.selectByExample(example);
        Map<String, Object> dataMap = new HashMap<>();
        int end = Integer.parseInt(pageIndex) * Integer.parseInt(pageSize);
        int start = (Integer.parseInt(pageIndex) - 1) * Integer.parseInt(pageSize);
        if (end > chnlAgentInfos.size()) {
            end = chnlAgentInfos.size();
        }
        dataMap.put("chnlList", chnlAgentInfos.subList(start, end));
        dataMap.put("totalSize", chnlAgentInfos.size());
        return Result.success(dataMap);
    }
}
