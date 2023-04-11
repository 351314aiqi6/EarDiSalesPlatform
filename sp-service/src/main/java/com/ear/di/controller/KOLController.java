package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import com.ear.di.dao.KOLInfoMapper;
import com.ear.di.entity.KOLInfo;
import com.ear.di.entity.KOLInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/kol")
public class KOLController {

    private final UserController userController = SpringUtil.getBean(UserController.class);

    private final KOLInfoMapper kolInfoMapper = SpringUtil.getBean(KOLInfoMapper.class);

    /**
     * 主播注册
     *
     * @param performPlatform 直播平台
     * @param kolIntroduce    主播介绍
     * @param kolName         主播名称
     * @param kolFollowers    主播粉丝
     * @return 注册结果
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public Result register(@RequestParam(name = "userId") String userId,
                           @RequestParam(name = "kolIntroduce") String kolIntroduce,
                           @RequestParam(name = "performPlatform") String performPlatform,
                           @RequestParam(name = "kolName") String kolName,
                           @RequestParam(name = "kolFollowers") String kolFollowers) {
        if (userController.getUser(null, userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.USER_IS_NOT_EXIST);
        } else if (!this.query(userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.KOL_ALREADY_REGISTER);
        } else {
            KOLInfo kolInfo = new KOLInfo();
            kolInfo.setUserId(userId);
            kolInfo.setKolIntroduce(kolIntroduce);
            kolInfo.setKolName(kolName);
            kolInfo.setPerformNumber(0L);
            kolInfo.setPrePerformNumber(0L);
            kolInfo.setPerformViewerNumber(0L);
            kolInfo.setPerformPlatform(performPlatform);
            kolInfo.setKolFollowers(Integer.parseInt(kolFollowers));
            kolInfo.setKolId(String.valueOf(System.currentTimeMillis()));
            return Result.judgeResult(kolInfoMapper.insertSelective(kolInfo) == 1, kolInfo, RespCode.REGISTER_KOL_ERROR);
        }
    }

    /**
     * 主播信息查询
     *
     * @param userId 用户ID
     * @return 查询结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "userId", required = false) String userId) {
        KOLInfoExample example = new KOLInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<KOLInfo> kolInfos = kolInfoMapper.selectByExample(example);
        if (kolInfos.isEmpty()) {
            return Result.success(null);
        }
        return Result.success(kolInfos.get(0));
    }

    /**
     * 主播信息查询
     * @return 查询结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryAll() {
        return Result.success(kolInfoMapper.selectByExample(new KOLInfoExample()));
    }

    /**
     * 主播注册
     *
     * @param kolAvatar    主播头像
     * @param kolIntroduce 主播介绍
     * @param kolName      主播名称
     * @param kolFollowers 主播粉丝
     * @return 注册结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "userId") String userId,
                         @RequestParam(name = "kolAvatar") String kolAvatar,
                         @RequestParam(name = "kolIntroduce") String kolIntroduce,
                         @RequestParam(name = "kolName") String kolName,
                         @RequestParam(name = "kolFollowers") String kolFollowers) {
        if (this.query(userId).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.KOL_NOT_EXIST);
        } else {
            KOLInfoExample example = new KOLInfoExample();
            example.createCriteria().andUserIdEqualTo(userId);
            KOLInfo kolInfo = new KOLInfo();
            kolInfo.setKolAvatar(kolAvatar);
            kolInfo.setKolIntroduce(kolIntroduce);
            kolInfo.setKolName(kolName);
            kolInfo.setKolFollowers(Integer.parseInt(kolFollowers));
            return Result.judgeResult(kolInfoMapper.updateByExampleSelective(kolInfo, example) == 1, kolInfo, RespCode.UPDATE_KOL_ERROR);
        }
    }
}
