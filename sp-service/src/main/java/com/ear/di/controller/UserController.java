package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.UserInfoMapper;
import com.ear.di.entity.UserInfo;
import com.ear.di.entity.UserInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserInfoMapper userInfoMapper = SpringUtil.getBean(UserInfoMapper.class);

    /**
     * 登录接口
     *
     * @param userLoginName 用户名
     * @param userPassword  用户密码
     * @return 登录结果
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public Result login(@RequestParam(name = "userLoginName") String userLoginName,
                        @RequestParam(name = "userPassword") String userPassword) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserLoginNameEqualTo(userLoginName).andUserPasswordEqualTo(userPassword);
        return Result.judgeResult(userInfoMapper.selectByExample(example).size() == 1,
                null, RespCode.USER_OR_PASSWORD_ERROR);
    }

    /**
     * 注册接口
     *
     * @param userLoginName   用户名
     * @param userPassword    用户密码
     * @param userRole        用户角色
     * @param userIdNo        证件号码
     * @param userIdType      证件类型
     * @param userRealName    用户真实姓名
     * @param userEmail       用户邮箱
     * @param userMobilePhone 用户手机号
     * @param userAddress     用户地址
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public Result register(@RequestParam(name = "userLoginName") String userLoginName,
                           @RequestParam(name = "userPassword") String userPassword,
                           @RequestParam(name = "userRole") String userRole,
                           @RequestParam(name = "userIdNo") String userIdNo,
                           @RequestParam(name = "userIdType") String userIdType,
                           @RequestParam(name = "userRealName") String userRealName,
                           @RequestParam(name = "userEmail") String userEmail,
                           @RequestParam(name = "userMobilePhone") String userMobilePhone,
                           @RequestParam(name = "userAddress") String userAddress) {
        if (!this.getUser(userLoginName).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.LOGIN_USER_NAME_IS_EXIST);
        } else {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserLoginName(userLoginName);
            userInfo.setUserPassword(userPassword);
            userInfo.setUserRole(userRole);
            userInfo.setUserIdNo(userIdNo);
            userInfo.setUserIdType(userIdType);
            userInfo.setUserRealName(userRealName);
            userInfo.setUserEmail(userEmail);
            userInfo.setUserMobilePhone(userMobilePhone);
            userInfo.setUserAddress(userAddress);
            userInfo.setCreateTime(new Date());
            userInfo.setUpdateTime(new Date());
            return Result.judgeResult(userInfoMapper.insertSelective(userInfo) == 1,
                    userInfo, RespCode.USER_REGISTER_ERROR);
        }
    }

    /**
     * 注册接口
     *
     * @param userLoginName   用户名
     * @param userPassword    用户密码
     * @param userEmail       用户邮箱
     * @param userMobilePhone 用户手机号
     * @param userAddress     用户地址
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "userLoginName") String userLoginName,
                           @RequestParam(name = "userPassword",required = false) String userPassword,
                           @RequestParam(name = "userEmail",required = false) String userEmail,
                           @RequestParam(name = "userMobilePhone",required = false) String userMobilePhone,
                           @RequestParam(name = "userAddress",required = false) String userAddress) {
        if (this.getUser(userLoginName).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            UserInfoExample example = new UserInfoExample();
            example.createCriteria().andUserLoginNameEqualTo(userLoginName);
            UserInfo userInfo = new UserInfo();
            if(StringUtils.isNotBlank(userPassword)){
                userInfo.setUserPassword(userPassword);
            }
            if(StringUtils.isNotBlank(userEmail)){
                userInfo.setUserEmail(userEmail);
            }
            if(StringUtils.isNotBlank(userMobilePhone)){
                userInfo.setUserMobilePhone(userMobilePhone);
            }
            if(StringUtils.isNotBlank(userAddress)){
                userInfo.setUserAddress(userAddress);
            }
            return Result.judgeResult(userInfoMapper.updateByExampleSelective(userInfo,example) == 1,
                    userInfo, RespCode.UPDATE_USER_ERROR);
        }
    }

    /**
     * 获取用户信息
     *
     * @param userLoginName 用户名称
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/getUser", method = {RequestMethod.GET, RequestMethod.POST})
    public Result getUser(@RequestParam(name = "userLoginName") String userLoginName) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserLoginNameEqualTo(userLoginName);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        return Result.success(userInfos);
    }
}
