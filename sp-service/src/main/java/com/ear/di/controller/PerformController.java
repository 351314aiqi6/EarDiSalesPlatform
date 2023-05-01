package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.KOLInfoMapper;
import com.ear.di.dao.KOLPerformInfoMapper;
import com.ear.di.dao.UserApplyPerformMapper;
import com.ear.di.dao.UserInfoMapper;
import com.ear.di.entity.*;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@CrossOrigin
@RequestMapping("/perform")
public class PerformController {
    /**
     * 初始状态
     */
    public final static String INIT = "00";

    /**
     * 处理中状态
     */
    public final static String PROCESSING = "01";

    /**
     * 处理结束
     */
    public final static String END = "02";

    /**
     * 处理结束
     */
    public final static String CANCEL = "03";


    /**
     * 有效状态
     */
    public final static String EFFECTIVE = "00";

    private final UserInfoMapper userInfoMapper = SpringUtil.getBean(UserInfoMapper.class);

    private final KOLController kolController = SpringUtil.getBean(KOLController.class);

    private final KOLInfoMapper kolInfoMapper = SpringUtil.getBean(KOLInfoMapper.class);

    private final UserApplyPerformMapper userApplyPerformMapper = SpringUtil.getBean(UserApplyPerformMapper.class);

    private final KOLPerformInfoMapper kolPerformInfoMapper = SpringUtil.getBean(KOLPerformInfoMapper.class);

    @ResponseBody
    @RequestMapping(value = "/apply", method = {RequestMethod.GET, RequestMethod.POST})
    public Result apply(@RequestParam(name = "kolKey") String kolKey,
                        @RequestParam(name = "performPlatform") String performPlatform,
                        @RequestParam(name = "performTitle") String performTitle,
                        @RequestParam(name = "performGoodsIntroduce") String performGoodsIntroduce,
                        @RequestParam(name = "performUrl") String performUrl,
                        @RequestParam(name = "performEndDttm") String performEndDttm,
                        @RequestParam(name = "performStartDttm") String performStartDttm,
                        @RequestParam(name = "applyMaxNumber", required = false) String applyMaxNumber) {
        KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(kolKey));
        if (kolInfo == null) {
            return Result.error(null, RespCode.KOL_NOT_EXIST);
        } else {
            Long currentDttm = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
            if (currentDttm > Long.parseLong(performStartDttm)) {
                return Result.error(null, RespCode.PERFORM_START_DTTM_ILLEGAL);
            }
            KOLPerformInfo performInfo = new KOLPerformInfo();
            performInfo.setKolId(String.valueOf(kolInfo.getId()));
            performInfo.setApplyNumber(0);
            performInfo.setPerformTitle(performTitle);
            performInfo.setPerformUrl(performUrl);
            performInfo.setPerformPlatform(performPlatform);
            performInfo.setPerforId(String.valueOf(System.currentTimeMillis()));
            performInfo.setPerformStartDttm(Long.parseLong(performStartDttm));
            performInfo.setPerformEndDttm(Long.parseLong(performEndDttm));
            performInfo.setPerformGoodsIntroduce(performGoodsIntroduce);
            performInfo.setPerformStatus(INIT);
            if(StringUtils.isNotBlank(applyMaxNumber)){
                performInfo.setApplyMaxNumber(Integer.parseInt(applyMaxNumber));
            }else{
                performInfo.setApplyMaxNumber(100);
            }
            // 预直播+1
            kolInfo.setPrePerformNumber(kolInfo.getPrePerformNumber() + 1);
            kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
            return Result.judgeResult(kolPerformInfoMapper.insertSelective(performInfo) == 1, performInfo, RespCode.USER_OR_PASSWORD_ERROR);
        }
    }

    /**
     * 直播取消
     *
     * @param id 直播ID
     * @return 直播取消结果
     */
    @ResponseBody
    @RequestMapping(value = "/cancel", method = {RequestMethod.GET, RequestMethod.POST})
    public Result cancel(@RequestParam(name = "id") String id,
                         @RequestParam(name = "kolId") String kolId) {
        KOLPerformInfo performInfo = new KOLPerformInfo();
        performInfo.setId(Long.parseLong(id));
        performInfo.setPerformStatus(CANCEL);
        KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(kolId));
        // 未播次数-1
        kolInfo.setPrePerformNumber(kolInfo.getPrePerformNumber() - 1);
        kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
        return Result.judgeResult(kolPerformInfoMapper.updateByPrimaryKeySelective(performInfo) == 1, null, RespCode.PERFORM_CANCEL_ERROR);
    }

    /**
     * 直播取消
     *
     * @param id 直播ID
     * @return 直播取消结果
     */
    @ResponseBody
    @RequestMapping(value = "/start", method = {RequestMethod.GET, RequestMethod.POST})
    public Result start(@RequestParam(name = "id") String id) {
        KOLPerformInfo performInfo = new KOLPerformInfo();
        performInfo.setId(Long.parseLong(id));
        performInfo.setPerformStatus(PROCESSING);
        return Result.judgeResult(kolPerformInfoMapper.updateByPrimaryKeySelective(performInfo) == 1, null, RespCode.PERFORM_CANCEL_ERROR);
    }

    /**
     * 直播结束
     *
     * @param id 直播ID
     * @return 直播取消结果
     */
    @ResponseBody
    @RequestMapping(value = "/end", method = {RequestMethod.GET, RequestMethod.POST})
    public Result end(@RequestParam(name = "id") String id,
                      @RequestParam(name = "kolId") String kolId) {
        KOLPerformInfo performInfo = new KOLPerformInfo();
        performInfo.setId(Long.parseLong(id));
        performInfo.setPerformStatus(END);
        KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(kolId));
        // 已播次数+1
        kolInfo.setPerformNumber(kolInfo.getPerformNumber() + 1);
        // 未播次数-1
        kolInfo.setPrePerformNumber(kolInfo.getPrePerformNumber() - 1);
        kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
        return Result.judgeResult(kolPerformInfoMapper.updateByPrimaryKeySelective(performInfo) == 1, null, RespCode.PERFORM_CANCEL_ERROR);
    }

    /**
     * 直播取消
     *
     * @param id 直播ID
     * @return 直播取消结果
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    public Result delete(@RequestParam(name = "id") String id) {
        return Result.judgeResult(kolPerformInfoMapper.deleteByPrimaryKey(Long.parseLong(id)) == 1, null, RespCode.PERFORM_CANCEL_ERROR);
    }

    @ResponseBody
    @RequestMapping(value = "/cancelAll", method = {RequestMethod.GET, RequestMethod.POST})
    public Result cancelAll(@RequestParam(name = "userId") String userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(userId));
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        KOLInfoExample example = new KOLInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<KOLInfo> kolInfos = kolInfoMapper.selectByExample(example);
        if (kolInfos.isEmpty()) {
            return Result.success(Collections.EMPTY_LIST);
        } else {
            KOLInfo kolInfo = kolInfos.get(0);
            KOLPerformInfoExample kolPerformInfoExample = new KOLPerformInfoExample();
            kolPerformInfoExample.createCriteria().andKolIdEqualTo(String.valueOf(kolInfo.getId())).andPerformStatusEqualTo(INIT);
            KOLPerformInfo performInfo = new KOLPerformInfo();
            performInfo.setPerformStatus(CANCEL);
            // 未播次数-1
            kolInfo.setPrePerformNumber(kolInfo.getPrePerformNumber() - kolPerformInfoMapper.updateByExampleSelective(performInfo, kolPerformInfoExample));
            kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
            return Result.success(null);
        }
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
                        @RequestParam(name = "performPlatform", required = false) String performPlatform,
                        @RequestParam(name = "kolKey", required = false) String kolId,
                        @RequestParam(name = "pageSize", required = false) String pageSize,
                        @RequestParam(name = "pageIndex", required = false) String pageIndex) {
        if (StringUtils.isBlank(pageSize)) {
            pageSize = "5";
        }
        if (StringUtils.isBlank(pageIndex)) {
            pageIndex = "1";
        }
        // 修改直播已经结束的数据
        Long currentDttm = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        KOLPerformInfoExample example1 = new KOLPerformInfoExample();
        KOLPerformInfoExample.Criteria criteria1 = example1.createCriteria();
        if (StringUtils.isNotBlank(performId)) {
            criteria1.andPerforIdEqualTo(performId);
        }
        if (StringUtils.isNotBlank(kolId)) {
            criteria1.andKolIdEqualTo(kolId);
        }
        if (StringUtils.isNotBlank(performPlatform)) {
            criteria1.andPerformPlatformEqualTo(performPlatform);
        }
        criteria1.andPerformEndDttmLessThan(currentDttm);
        KOLPerformInfo performInfo = new KOLPerformInfo();
        performInfo.setPerformStatus(END);
        kolPerformInfoMapper.updateByExampleSelective(performInfo, example1);

        // 修改直播中的数据
        KOLPerformInfoExample example2 = new KOLPerformInfoExample();
        KOLPerformInfoExample.Criteria criteria2 = example2.createCriteria();
        if (StringUtils.isNotBlank(performId)) {
            criteria2.andPerforIdEqualTo(performId);
        }
        if (StringUtils.isNotBlank(kolId)) {
            criteria2.andKolIdEqualTo(kolId);
        }
        if (StringUtils.isNotBlank(performPlatform)) {
            criteria2.andPerformPlatformEqualTo(performPlatform);
        }
        criteria2.andPerformStartDttmLessThan(currentDttm);
        performInfo = new KOLPerformInfo();
        performInfo.setPerformStatus(PROCESSING);
        kolPerformInfoMapper.updateByExampleSelective(performInfo, example2);

        // 查询数据
        KOLPerformInfoExample example3 = new KOLPerformInfoExample();
        KOLPerformInfoExample.Criteria criteria3 = example3.createCriteria();
        if (StringUtils.isNotBlank(performId)) {
            criteria3.andPerforIdEqualTo(performId);
        }
        if (StringUtils.isNotBlank(kolId)) {
            criteria3.andKolIdEqualTo(kolId);
        }
        if (StringUtils.isNotBlank(performPlatform)) {
            criteria3.andPerformPlatformEqualTo(performPlatform);
        }
        List<String> statusList = new ArrayList<>();
        statusList.add(INIT);
        statusList.add(PROCESSING);
        criteria3.andPerformStatusIn(statusList);
        List<KOLPerformInfo> kolPerformInfos = kolPerformInfoMapper.selectByExample(example3);
        Map<String, Object> dataMap = new HashMap<>();
        int end = Integer.parseInt(pageIndex) * Integer.parseInt(pageSize);
        int start = (Integer.parseInt(pageIndex) - 1) * Integer.parseInt(pageSize);
        if (end > kolPerformInfos.size()) {
            end = kolPerformInfos.size();
        }
        dataMap.put("performList", kolPerformInfos.subList(start, end));
        dataMap.put("totalSize", kolPerformInfos.size());
        return Result.success(dataMap);
    }

    @ResponseBody
    @RequestMapping(value = "/preBook", method = {RequestMethod.GET, RequestMethod.POST})
    public Result preBook(@RequestParam(name = "performKey") String performKey,
                          @RequestParam(name = "userId") String userId,
                          @RequestParam(name = "kolKey") String kolKey) {
        Map<String, Object> dataMap = new HashMap<>();
        KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(kolKey));
        if (kolInfo == null) {
            return Result.error(null, RespCode.KOL_NOT_EXIST);
        }
        UserApplyPerformExample example = new UserApplyPerformExample();
        example.createCriteria().andPerformIdEqualTo(performKey).andUserIdEqualTo(userId);
        List<UserApplyPerform> userApplyPerforms = userApplyPerformMapper.selectByExample(example);
        dataMap.put("bookKol", kolInfo);
        dataMap.put("bookFlag", !userApplyPerforms.isEmpty());
        return Result.success(dataMap);
    }

    @ResponseBody
    @RequestMapping(value = "/performBook", method = {RequestMethod.GET, RequestMethod.POST})
    public Result performBook(@RequestParam(name = "userId") String userId,
                              @RequestParam(name = "performKey") String performKey) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(userId));
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        KOLPerformInfo performInfo = kolPerformInfoMapper.selectByPrimaryKey(Long.parseLong(performKey));
        if (performInfo == null) {
            return Result.error(null, RespCode.PERFORM_NOT_EXIST);
        }
        UserApplyPerform userApplyPerform = new UserApplyPerform();
        userApplyPerform.setUserId(userId);
        userApplyPerform.setPerformId(performKey);
        userApplyPerform.setApplyStatus(EFFECTIVE);
        userApplyPerform.setApplyId(String.valueOf(System.currentTimeMillis()));
        KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(performInfo.getKolId()));
        // 观众人数+1
        kolInfo.setPerformViewerNumber(kolInfo.getPerformViewerNumber() + 1);
        performInfo.setApplyNumber(performInfo.getApplyNumber() + 1);
        if(performInfo.getApplyNumber() > performInfo.getApplyMaxNumber()){
            return Result.error(null, RespCode.BOOK_OVER);
        }
        kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
        kolPerformInfoMapper.updateByPrimaryKeySelective(performInfo);
        return Result.judgeResult(userApplyPerformMapper.insertSelective(userApplyPerform) == 1, userApplyPerform, RespCode.PERFORM_APPLY_ERROR);
    }

    @ResponseBody
    @RequestMapping(value = "/queryByUserId", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryByUserId(@RequestParam(name = "userId") String userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(userId));
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        KOLInfoExample example = new KOLInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<KOLInfo> kolInfos = kolInfoMapper.selectByExample(example);
        if (kolInfos.isEmpty()) {
            return Result.success(Collections.EMPTY_LIST);
        } else {
            KOLInfo kolInfo = kolInfos.get(0);
            List<String> statusList = new ArrayList<>();
            statusList.add(INIT);
            statusList.add(PROCESSING);
            KOLPerformInfoExample kolPerformInfoExample = new KOLPerformInfoExample();
            kolPerformInfoExample.createCriteria().andKolIdEqualTo(String.valueOf(kolInfo.getId())).andPerformStatusIn(statusList);
            Map<String,Object> dataMap = new HashMap<>();
            dataMap.put("kolInfo",kolInfo);
            dataMap.put("performList",kolPerformInfoMapper.selectByExample(kolPerformInfoExample));
            return Result.success(dataMap);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/queryRecover", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryRecover(@RequestParam(name = "userId") String userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(userId));
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        KOLInfoExample example = new KOLInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<KOLInfo> kolInfos = kolInfoMapper.selectByExample(example);
        if (kolInfos.isEmpty()) {
            return Result.success(Collections.EMPTY_LIST);
        } else {
            KOLInfo kolInfo = kolInfos.get(0);
            List<String> statusList = new ArrayList<>();
            statusList.add(END);
            statusList.add(CANCEL);
            KOLPerformInfoExample kolPerformInfoExample = new KOLPerformInfoExample();
            kolPerformInfoExample.createCriteria().andKolIdEqualTo(String.valueOf(kolInfo.getId())).andPerformStatusIn(statusList);
            return Result.success(kolPerformInfoMapper.selectByExample(kolPerformInfoExample));
        }
    }

    @ResponseBody
    @RequestMapping(value = "/deleteAll", method = {RequestMethod.GET, RequestMethod.POST})
    public Result deleteAll(@RequestParam(name = "userId") String userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(userId));
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        KOLInfoExample example = new KOLInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<KOLInfo> kolInfos = kolInfoMapper.selectByExample(example);
        if (kolInfos.isEmpty()) {
            return Result.success(Collections.EMPTY_LIST);
        } else {
            KOLInfo kolInfo = kolInfos.get(0);
            List<String> statusList = new ArrayList<>();
            statusList.add(CANCEL);
            statusList.add(END);
            KOLPerformInfoExample kolPerformInfoExample = new KOLPerformInfoExample();
            kolPerformInfoExample.createCriteria().andKolIdEqualTo(String.valueOf(kolInfo.getId())).andPerformStatusIn(statusList);
            return Result.success(kolPerformInfoMapper.deleteByExample(kolPerformInfoExample));
        }
    }

    @ResponseBody
    @RequestMapping(value = "/queryBook", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryBook(@RequestParam(name = "userId") String userId) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        UserApplyPerformExample example = new UserApplyPerformExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserApplyPerform> userApplyPerforms = userApplyPerformMapper.selectByExample(example);
        for (UserApplyPerform userApplyPerform : userApplyPerforms) {
            String performId = userApplyPerform.getPerformId();
            KOLPerformInfo performInfo = kolPerformInfoMapper.selectByPrimaryKey(Long.parseLong(performId));
            if (performInfo == null) continue;
            String kolId = performInfo.getKolId();
            KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(kolId));
            if (kolInfo == null) continue;
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("kolInfo", kolInfo);
            dataMap.put("perform", performInfo);
            dataMap.put("book", userApplyPerform);
            dataList.add(dataMap);
        }
        return Result.success(dataList);
    }

    @ResponseBody
    @RequestMapping(value = "/bookCancel", method = {RequestMethod.GET, RequestMethod.POST})
    public Result bookCancel(@RequestParam(name = "id") String id,
                             @RequestParam(name = "kolKey") String kolKey,
                             @RequestParam(name = "performKey") String performKey) {
        KOLInfo kolInfo = kolInfoMapper.selectByPrimaryKey(Long.parseLong(kolKey));
        // 观众人数 - 1
        kolInfo.setPerformViewerNumber(kolInfo.getPerformViewerNumber() - 1);
        kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
        KOLPerformInfo performInfo = kolPerformInfoMapper.selectByPrimaryKey(Long.parseLong(performKey));
        performInfo.setApplyNumber(performInfo.getApplyNumber() - 1);
        kolPerformInfoMapper.updateByPrimaryKeySelective(performInfo);
        return Result.success(userApplyPerformMapper.deleteByPrimaryKey(Long.parseLong(id)));
    }

    @ResponseBody
    @RequestMapping(value = "/bookCancelAll", method = {RequestMethod.GET, RequestMethod.POST})
    @Transactional
    public Result bookCancelAll(@RequestParam(name = "userId") String userId) {
        UserApplyPerformExample example = new UserApplyPerformExample();
        example.createCriteria().andUserIdEqualTo(userId);
        Map<String, Integer> kolUserInfoMap = new HashMap<>();
        List<UserApplyPerform> userApplyPerforms = userApplyPerformMapper.selectByExample(example);
        for (UserApplyPerform userApplyPerform : userApplyPerforms) {
            if (kolUserInfoMap.get(userApplyPerform.getUserId()) == null) {
                kolUserInfoMap.put(userApplyPerform.getUserId(), 1);
            } else {
                kolUserInfoMap.put(userApplyPerform.getUserId(), kolUserInfoMap.get(userApplyPerform.getUserId()) + 1);
            }
            KOLPerformInfo performInfo = kolPerformInfoMapper.selectByPrimaryKey(Long.parseLong(userApplyPerform.getPerformId()));
            if (performInfo != null) {
                performInfo.setApplyNumber(performInfo.getApplyNumber() - 1);
                kolPerformInfoMapper.updateByPrimaryKeySelective(performInfo);
            }
        }
        for (String key : kolUserInfoMap.keySet()) {
            KOLInfoExample kolInfoExample = new KOLInfoExample();
            kolInfoExample.createCriteria().andUserIdEqualTo(key);
            List<KOLInfo> kolInfos = kolInfoMapper.selectByExample(kolInfoExample);
            for (KOLInfo kolInfo : kolInfos) {
                kolInfo.setPerformViewerNumber(kolInfo.getPerformViewerNumber() - kolUserInfoMap.get(key));
                kolInfoMapper.updateByPrimaryKeySelective(kolInfo);
            }
        }
        return Result.success(userApplyPerformMapper.deleteByExample(example));
    }

}
