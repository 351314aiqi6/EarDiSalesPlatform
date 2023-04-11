package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import com.ear.di.dao.UserMessageMapper;
import com.ear.di.entity.UserMessage;
import com.ear.di.entity.UserMessageExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
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

    /**
     * 已读状态
     */
    public final static String DELETE = "02";

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final UserMessageMapper userMessageMapper = SpringUtil.getBean(UserMessageMapper.class);

    /**
     * 发送信息
     *
     * @param messageContent 信息内容
     * @param sendUserId     发送用户ID
     * @param recvUserId     接收用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/send", method = {RequestMethod.GET, RequestMethod.POST})
    public Result send(@RequestParam(name = "messageContent") String messageContent,
                       @RequestParam(name = "sendUserId") String sendUserId,
                       @RequestParam(name = "recvUserId") String recvUserId,
                       @RequestParam(name = "messageTitle") String messageTitle) {
        if (userController.getUser(null, sendUserId).dataIsNummOrEmpty()
                || userController.getUser(null, recvUserId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else {
            UserMessage userMessage = new UserMessage();
            userMessage.setSendUserId(sendUserId);
            userMessage.setRecvUserId(recvUserId);
            userMessage.setMessageTitle(messageTitle);
            userMessage.setMessageContent(messageContent);
            userMessage.setMessageStatus(NOT_READ);
            userMessage.setMessageId(String.valueOf(System.currentTimeMillis()));
            return Result.judgeResult(userMessageMapper.insertSelective(userMessage) == 1, userMessage, RespCode.MESSAGE_SEND_ERROR);
        }
    }

    /**
     * 信息读取
     *
     * @param id 信息ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/read", method = {RequestMethod.GET, RequestMethod.POST})
    public Result read(@RequestParam(name = "id") String id) {
        UserMessage userMessage = new UserMessage();
        userMessage.setMessageStatus(READED);
        userMessage.setId(Long.parseLong(id));
        userMessageMapper.updateByPrimaryKeySelective(userMessage);
        return Result.success(userMessage);
    }

    /**
     * 信息读取
     *
     * @param userId 用户信息
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/readAll", method = {RequestMethod.GET, RequestMethod.POST})
    public Result readAll(@RequestParam(name = "userId") String userId) {
        UserMessageExample messageExample = new UserMessageExample();
        messageExample.createCriteria().andRecvUserIdEqualTo(userId).andMessageStatusEqualTo(NOT_READ);
        UserMessage userMessage = new UserMessage();
        userMessage.setMessageStatus(READED);
        return Result.success(userMessageMapper.updateByExampleSelective(userMessage, messageExample));
    }

    /**
     * 查询已经发送的信息
     *
     * @param userId 用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/querySend", method = {RequestMethod.GET, RequestMethod.POST})
    public Result querySend(@RequestParam(name = "userId") String userId) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        Map<String, Object> dataMap = new HashMap<>();
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andSendUserIdEqualTo(userId).andMessageStatusEqualTo(NOT_READ);
        dataMap.put("noReadList", userMessageMapper.selectByExample(example));
        example.clear();
        example.createCriteria().andSendUserIdEqualTo(userId).andMessageStatusEqualTo(READED);
        dataMap.put("readedList", userMessageMapper.selectByExample(example));
        return Result.success(dataMap);
    }

    /**
     * 查询接收信息
     *
     * @param userId 用户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryReceive", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryReceive(@RequestParam(name = "userId") String userId) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        }
        Map<String, Object> dataMap = new HashMap<>();
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andRecvUserIdEqualTo(userId).andMessageStatusEqualTo(NOT_READ);
        dataMap.put("noReadList", userMessageMapper.selectByExample(example));
        example.clear();
        example.createCriteria().andRecvUserIdEqualTo(userId).andMessageStatusEqualTo(READED);
        dataMap.put("readedList", userMessageMapper.selectByExample(example));
        example.clear();
        example.createCriteria().andRecvUserIdEqualTo(userId).andMessageStatusEqualTo(DELETE);
        dataMap.put("retrieveList", userMessageMapper.selectByExample(example));
        return Result.success(dataMap);
    }

    /**
     * 信息读取
     *
     * @param id 信息ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    public Result delete(@RequestParam(name = "id") String id) {
        UserMessage userMessage = new UserMessage();
        userMessage.setMessageStatus(DELETE);
        userMessage.setId(Long.parseLong(id));
        userMessageMapper.updateByPrimaryKeySelective(userMessage);
        return Result.success(userMessage);
    }

    /**
     * 信息读取
     *
     * @param userId 用户信息
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAll", method = {RequestMethod.GET, RequestMethod.POST})
    public Result deleteAll(@RequestParam(name = "userId") String userId) {
        UserMessageExample messageExample = new UserMessageExample();
        messageExample.createCriteria().andRecvUserIdEqualTo(userId).andMessageStatusEqualTo(READED);
        UserMessage userMessage = new UserMessage();
        userMessage.setMessageStatus(DELETE);
        return Result.success(userMessageMapper.updateByExampleSelective(userMessage, messageExample));
    }

    /**
     * 信息清理
     *
     * @param id 信息ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/retrieve", method = {RequestMethod.GET, RequestMethod.POST})
    public Result retrieve(@RequestParam(name = "id") String id) {
        return Result.judgeResult(userMessageMapper.deleteByPrimaryKey(Long.parseLong(id)) == 1,
                null, RespCode.MERCHANT_UPDATE_ERROR);
    }

    /**
     * 信息全部清理
     *
     * @param userId 信息ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/retrieveAll", method = {RequestMethod.GET, RequestMethod.POST})
    public Result retrieveAll(@RequestParam(name = "userId") String userId) {
        UserMessageExample messageExample = new UserMessageExample();
        messageExample.createCriteria().andRecvUserIdEqualTo(userId).andMessageStatusEqualTo(DELETE);
        return Result.success(userMessageMapper.deleteByExample(messageExample));
    }


    /**
     * 查询已经发送的信息
     *
     * @param id 信息id
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryContent", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryContent(@RequestParam(name = "id") String id) {
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andIdEqualTo(Long.parseLong(id));
        return Result.success(userMessageMapper.selectByExampleWithBLOBs(example).get(0));
    }

}
