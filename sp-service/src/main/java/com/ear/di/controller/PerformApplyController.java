package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.UserApplyPerformMapper;
import com.ear.di.entity.UserApplyPerform;
import com.ear.di.entity.UserApplyPerformExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 直播预约
 */
@Controller
@CrossOrigin
@RequestMapping("/performApply")
public class PerformApplyController {
    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final PerformController performController = SpringUtil.getBean(PerformController.class);

    private final UserApplyPerformMapper userApplyPerformMapper = SpringUtil.getBean(UserApplyPerformMapper.class);

    /**
     * 有效状态
     */
    public final static String EFFECTIVE = "00";

    /**
     * 过期状态
     */
    public final static String EXPIRE = "01";

    @ResponseBody
    @RequestMapping(value = "/apply", method = {RequestMethod.GET, RequestMethod.POST})
    public Result apply(@RequestParam(name = "userId") String userId,
                        @RequestParam(name = "performId") String performId) {
//        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
//            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
//        } else if (performController.query(performId, null).dataIsNummOrEmpty()) {
//            return Result.error(null, RespCode.PERFORM_NOT_EXIST);
//        } else {
//            UserApplyPerform userApplyPerform = new UserApplyPerform();
//            userApplyPerform.setUserId(userId);
//            userApplyPerform.setPerformId(performId);
//            userApplyPerform.setApplyStatus(EFFECTIVE);
//            userApplyPerform.setApplyId(String.valueOf(System.currentTimeMillis()));
//            return Result.judgeResult(userApplyPerformMapper.insertSelective(userApplyPerform) == 1, userApplyPerform, RespCode.PERFORM_APPLY_ERROR);
//        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/cancel", method = {RequestMethod.GET, RequestMethod.POST})
    public Result cancel(@RequestParam(name = "applyId") String applyId) {
        UserApplyPerformExample example = new UserApplyPerformExample();
        example.createCriteria().andApplyIdEqualTo(applyId);
        return Result.judgeResult(userApplyPerformMapper.deleteByExample(example) == 1, null, RespCode.PERFORM_CANCEL_ERROR);
    }

    @ResponseBody
    @RequestMapping(value = "/start", method = {RequestMethod.GET, RequestMethod.POST})
    public Result start(@RequestParam(name = "performId") String performId) {
        UserApplyPerformExample example = new UserApplyPerformExample();
        example.createCriteria().andPerformIdEqualTo(performId);
        UserApplyPerform userApplyPerform = new UserApplyPerform();
        userApplyPerform.setApplyStatus(EXPIRE);
        return Result.success(userApplyPerformMapper.updateByExampleSelective(userApplyPerform, example));
    }

    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "applyId", required = false) String applyId,
                        @RequestParam(name = "userId", required = false) String userId,
                        @RequestParam(name = "performId", required = false) String performId) {
        UserApplyPerformExample example = new UserApplyPerformExample();
        UserApplyPerformExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(applyId)) {
            criteria.andApplyIdEqualTo(applyId);
        }
        if (StringUtils.isNotBlank(userId)) {
            criteria.andUserIdEqualTo(userId);
        }
        if (StringUtils.isNotBlank(performId)) {
            criteria.andPerformIdEqualTo(performId);
        }
        return Result.success(userApplyPerformMapper.selectByExample(example));
    }
}
