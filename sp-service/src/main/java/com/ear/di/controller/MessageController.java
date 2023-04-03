package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import com.ear.di.dao.UserMessageMapper;
import com.ear.di.entity.UserMessage;
import com.ear.di.entity.UserMessageExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/message")
public class MessageController {
    /**
     * 未读状态
     */
    public final static String NOT_READ = "00";

    /**
     * 已读状态
     */
    public final static String READED = "01";

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final UserMessageMapper userMessageMapper = SpringUtil.getBean(UserMessageMapper.class);

    /**
     * 发送信息
     *
     * @param messageContent 信息内容
     * @param sendUserId     发送用户ID
     * @param receiveUserId  接收用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/send", method = {RequestMethod.GET, RequestMethod.POST})
    private Result send(@RequestParam(name = "messageContent") String messageContent,
                        @RequestParam(name = "sendUserId") String sendUserId,
                        @RequestParam(name = "receiveUserId") String receiveUserId) {
        if (userController.getUser(null, sendUserId).dataIsNummOrEmpty()
                || userController.getUser(null, receiveUserId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            UserMessage userMessage = new UserMessage();
            userMessage.setSendUserId(sendUserId);
            userMessage.setRecvUserId(receiveUserId);
            userMessage.setMessageContent(messageContent);
            userMessage.setMessageStatus(NOT_READ);
            userMessage.setMessageId(String.valueOf(System.currentTimeMillis()));
            return Result.judgeResult(userMessageMapper.insertSelective(userMessage) == 1, userMessage, RespCode.MESSAGE_SEND_ERROR);
        }
    }

    /**
     * 信息读取
     *
     * @param messageId 信息ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/read", method = {RequestMethod.GET, RequestMethod.POST})
    private Result read(@RequestParam(name = "messageId") String messageId) {
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andMessageIdEqualTo(messageId);
        UserMessage userMessage = new UserMessage();
        userMessage.setMessageStatus(READED);
        userMessageMapper.updateByExampleSelective(userMessage, example);
        return Result.success(userMessage);
    }

    /**
     * 查询已经发送的信息
     *
     * @param userId 用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/querySend", method = {RequestMethod.GET, RequestMethod.POST})
    private Result querySend(@RequestParam(name = "userId") String userId) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andSendUserIdEqualTo(userId);
        return Result.success(userMessageMapper.selectByExample(example));
    }

    /**
     * 查询接收信息
     *
     * @param userId 用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryReceive", method = {RequestMethod.GET, RequestMethod.POST})
    private Result queryReceive(@RequestParam(name = "userId") String userId) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andRecvUserIdEqualTo(userId);
        return Result.success(userMessageMapper.selectByExample(example));
    }

    /**
     * 信息删除
     *
     * @param messageId 信息ID
     * @return 删除结果
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    private Result delete(@RequestParam(name = "messageId") String messageId) {
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andMessageIdEqualTo(messageId);
        return Result.success(userMessageMapper.deleteByExample(example));
    }
}
