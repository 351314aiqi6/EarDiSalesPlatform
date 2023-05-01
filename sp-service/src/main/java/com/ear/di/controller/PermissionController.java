package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import com.ear.di.dao.PermissionInfoMapper;
import com.ear.di.entity.PermissionInfo;
import com.ear.di.entity.PermissionInfoExample;
import com.ear.di.enums.RespCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/permission")
public class PermissionController {
    private final PermissionInfoMapper permissionInfoMapper = SpringUtil.getBean(PermissionInfoMapper.class);

    /**
     * 修改权限
     * @param id   id
     * @param user_role   用户角色
     * @param permission_name  权限名称
     * @param permission_value  权限值
     *
     * @return 修改结果
     */

    @ResponseBody
    @RequestMapping(value = "/updateperList",method = {RequestMethod.GET,RequestMethod.POST})
    public Result queryPermissionList(
            @RequestParam(name = "id")Integer id,
            @RequestParam(name = "user_role")String user_role,
            @RequestParam(name = "permission_name")String permission_name,
            @RequestParam(name = "permission_value")Boolean permission_value) {

            PermissionInfoExample example = new PermissionInfoExample();
            example.createCriteria().andIdEqualTo(id);
            PermissionInfo permissionInfo = new PermissionInfo();
            permissionInfo.setId(id);
            permissionInfo.setUserRole(user_role);
            permissionInfo.setPermissionName(permission_name);
            permissionInfo.setPermissionValue(permission_value);
            return Result.judgeResult(permissionInfoMapper.updateByExampleSelective(permissionInfo,example) == 1,
                    permissionInfo,RespCode.PERMISSION_ADD_ERROR);
        }


}
