package com.ear.di.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.ChnlAgentInfoMapper;
import com.ear.di.dao.GoodsInfoMapper;
import com.ear.di.dao.MerchantInfoMapper;
import com.ear.di.dao.UserInfoMapper;
import com.ear.di.entity.*;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private final UserInfoMapper userInfoMapper = SpringUtil.getBean(UserInfoMapper.class);

    private final GoodsInfoMapper goodsInfoMapper = SpringUtil.getBean(GoodsInfoMapper.class);

    private final MerchantInfoMapper merchantInfoMapper = SpringUtil.getBean(MerchantInfoMapper.class);

    private final ChnlAgentInfoMapper chnlAgentInfoMapper = SpringUtil.getBean(ChnlAgentInfoMapper.class);


    /**
     * 登录接口
     *
     * @param userLoginName 用户名
     * @param userPassword  用户密码
     * @return 登录结果
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public Result login(@RequestParam(name = "userLoginName", required = false) String userLoginName,
                        @RequestParam(name = "userPassword", required = false) String userPassword) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserLoginNameEqualTo(userLoginName).andUserPasswordEqualTo(userPassword);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (userInfos.isEmpty()) {
            return Result.error(null, RespCode.USER_OR_PASSWORD_ERROR);
        } else {
            Map<String, Object> dataMap = new HashMap<>();
            UserInfo userInfo = userInfos.get(0);
            Long userId = userInfo.getId();
            // 查询商户数
            MerchantInfoExample merchantInfoExample = new MerchantInfoExample();
            merchantInfoExample.createCriteria().andUserIdEqualTo(String.valueOf(userId));
            List<MerchantInfo> merchantInfos = merchantInfoMapper.selectByExample(merchantInfoExample);
            dataMap.put("merchantNum", merchantInfos.size());
            // 查询商品数
            for (MerchantInfo merchantInfo : merchantInfos) {
                GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
                goodsInfoExample.createCriteria().andMerchantIdEqualTo(merchantInfo.getMerchantId());
                dataMap.put("goodsNum", goodsInfoMapper.countByExample(goodsInfoExample));
            }
            // 统计渠道商的数
            ChnlAgentInfoExample chnlAgentInfoExample = new ChnlAgentInfoExample();
            chnlAgentInfoExample.createCriteria().andUserIdEqualTo(String.valueOf(userId));
            dataMap.put("chnlNum", chnlAgentInfoMapper.countByExample(chnlAgentInfoExample));
            Result result = SpringUtil.getBean(MessageController.class).queryReceive(String.valueOf(userId));
            List<UserMessage> messageInfos = (List<UserMessage>) result.getResult();
            List<Map<String, Object>> messageMapList = new ArrayList<>(messageInfos.size());
            messageInfos.forEach(messageInfo -> {
                Map<String, Object> stringObjectMap = BeanUtil.beanToMap(messageInfo);
                stringObjectMap.put("status", !messageInfo.getMessageStatus().equals("00"));
                messageMapList.add(stringObjectMap);
            });
            dataMap.put("messageList", messageMapList);
            dataMap.put("messageNum", messageInfos.size());
            return Result.success(dataMap);
        }
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
        if (!this.getUser(userLoginName, null).dataIsNummOrEmpty()) {
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
                         @RequestParam(name = "userPassword", required = false) String userPassword,
                         @RequestParam(name = "userEmail", required = false) String userEmail,
                         @RequestParam(name = "userMobilePhone", required = false) String userMobilePhone,
                         @RequestParam(name = "userAddress", required = false) String userAddress) {
        if (this.getUser(userLoginName, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            UserInfoExample example = new UserInfoExample();
            example.createCriteria().andUserLoginNameEqualTo(userLoginName);
            UserInfo userInfo = new UserInfo();
            if (StringUtils.isNotBlank(userPassword)) {
                userInfo.setUserPassword(userPassword);
            }
            if (StringUtils.isNotBlank(userEmail)) {
                userInfo.setUserEmail(userEmail);
            }
            if (StringUtils.isNotBlank(userMobilePhone)) {
                userInfo.setUserMobilePhone(userMobilePhone);
            }
            if (StringUtils.isNotBlank(userAddress)) {
                userInfo.setUserAddress(userAddress);
            }
            return Result.judgeResult(userInfoMapper.updateByExampleSelective(userInfo, example) == 1,
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
    public Result getUser(@RequestParam(name = "userLoginName", required = false) String userLoginName,
                          @RequestParam(name = "userId", required = false) String userId) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(userLoginName)) {
            criteria.andUserLoginNameEqualTo(userLoginName);
        }
        if (StringUtils.isNotBlank(userId)) {
            criteria.andIdEqualTo(Long.parseLong(userId));
        }
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        return Result.success(userInfos);
    }
}
