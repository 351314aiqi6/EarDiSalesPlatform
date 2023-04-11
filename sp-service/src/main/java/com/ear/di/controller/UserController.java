package com.ear.di.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.*;
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

    private final UserLoginInfoMapper userLoginInfoMapper = SpringUtil.getBean(UserLoginInfoMapper.class);


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
            GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
            goodsInfoExample.createCriteria().andChnlUserIdEqualTo(String.valueOf(userId));
            dataMap.put("goodsNum", goodsInfoMapper.countByExample(goodsInfoExample));

            // 统计渠道商的数
            ChnlAgentInfoExample chnlAgentInfoExample = new ChnlAgentInfoExample();
            chnlAgentInfoExample.createCriteria().andUserIdEqualTo(String.valueOf(userId));
            dataMap.put("chnlNum", chnlAgentInfoMapper.countByExample(chnlAgentInfoExample));
            Result result = SpringUtil.getBean(MessageController.class).queryReceive(String.valueOf(userId));
            List<UserMessage> messageInfos = (List<UserMessage>) ((HashMap<String, Object>) result.getResult()).get("noReadList");
            List<Map<String, Object>> messageMapList = new ArrayList<>(messageInfos.size());
            messageInfos.forEach(messageInfo -> {
                Map<String, Object> stringObjectMap = BeanUtil.beanToMap(messageInfo);
                stringObjectMap.put("status", !messageInfo.getMessageStatus().equals("00"));
                messageMapList.add(stringObjectMap);
            });
            dataMap.put("messageList", messageMapList);
            dataMap.put("userInfo", userInfo);
            dataMap.put("messageNum", messageInfos.size());
            UserLoginInfoExample loginInfoExample = new UserLoginInfoExample();
            loginInfoExample.createCriteria().andUserIdEqualTo(String.valueOf(userInfo.getId()));
            dataMap.put("loginNum", userLoginInfoMapper.countByExample(loginInfoExample));
            if (userInfo.getUserLastLoginId() != null) {
                // 最后一次登录信息
                dataMap.put("lastLoginInfo", userLoginInfoMapper.selectByPrimaryKey(userInfo.getUserLastLoginId()));
            }
            UserLoginInfo userLoginInfo = new UserLoginInfo();
            userLoginInfo.setUserId(String.valueOf(userInfo.getId()));
            userLoginInfo.setLoginDttm(new Date());
            userLoginInfo.setLoginIpAddress("");
            userLoginInfo.setLoginIpAddress("");
            Random random = new Random();
            String[] ipArray = new String[]{"10.33.43.133", "32.44.56.77", "43.44.43.127", "53.44.43.127"};
            userLoginInfo.setLoginIpAddress(ipArray[random.nextInt(3)]);
            String[] addressArray = new String[]{"广东省深圳市", "湖南省长沙市", "陕西省西安市", "北京市朝阳区"};
            userLoginInfo.setLoginAddressDesc(addressArray[random.nextInt(3)]);
            userLoginInfoMapper.insertSelective(userLoginInfo);
            userInfo.setUserLastLoginId(userLoginInfo.getId());
            userInfoMapper.updateByPrimaryKeySelective(userInfo);
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
                           @RequestParam(name = "userAddress") String userAddress,
                           @RequestParam(name = "userAdditional", required = false) String userAdditional) {
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
            userInfo.setUserAdditional(userAdditional);
            userInfo.setCreateTime(new Date());
            userInfo.setUpdateTime(new Date());
            return Result.judgeResult(userInfoMapper.insertSelective(userInfo) == 1,
                    userInfo, RespCode.USER_REGISTER_ERROR);
        }
    }

    /**
     * 注册接口
     *
     * @param userId          用户名
     * @param userPassword    用户密码
     * @param userNewPassword 用户新密码
     * @param userEmail       用户邮箱
     * @param userMobilePhone 用户手机号
     * @param userAddress     用户地址
     * @param userAdditional  用户介绍信息
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "userId") String userId,
                         @RequestParam(name = "userPassword", required = false) String userPassword,
                         @RequestParam(name = "userNewPassword", required = false) String userNewPassword,
                         @RequestParam(name = "userEmail", required = false) String userEmail,
                         @RequestParam(name = "userMobilePhone", required = false) String userMobilePhone,
                         @RequestParam(name = "userAddress", required = false) String userAddress,
                         @RequestParam(name = "userAdditional", required = false) String userAdditional) {
        Result userResult = this.getUser(null, userId);
        if (userResult.dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            UserInfo userInfo = ((List<UserInfo>) userResult.getResult()).get(0);
            if (StringUtils.isNotBlank(userNewPassword)) {
                if (!userInfo.getUserPassword().equals(userPassword)) {
                    return Result.error(null, RespCode.PASSWORD_IS_ERROR);
                } else {
                    userInfo.setUserPassword(userNewPassword);
                }
            }
            userInfo.setUserEmail(userEmail);
            userInfo.setUserMobilePhone(userMobilePhone);
            userInfo.setUserAddress(userAddress);
            userInfo.setUserAdditional(userAdditional);
            userInfo.setUpdateTime(new Date());
            return Result.judgeResult(userInfoMapper.updateByPrimaryKeySelective(userInfo) == 1,
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

    /**
     * 获取全量用户信息
     *
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query() {
        List<Map<String, Object>> userList = new ArrayList<>();
        List<UserInfo> userInfos = userInfoMapper.selectByExample(new UserInfoExample());
        for (UserInfo userInfo : userInfos) {
            Map<String, Object> userMap = new HashMap<>();
            userMap.put("id", userInfo.getId());
            userMap.put("userRealName", userInfo.getUserRealName());
            userMap.put("userEmail", userInfo.getUserEmail());
        }
        return Result.success(userInfoMapper.selectByExample(new UserInfoExample()));
    }

    /**
     * 获取全量用户信息
     *
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryOne", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryOne(@RequestParam(name = "recvUserId") String recvUserId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(Long.parseLong(recvUserId));
        Map<String, Object> userMap = new HashMap<>();
        if (userInfo == null) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        userMap.put("id", userInfo.getId());
        userMap.put("userRealName", userInfo.getUserRealName());
        userMap.put("userEmail", userInfo.getUserEmail());
        return Result.success(userMap);
    }
}
