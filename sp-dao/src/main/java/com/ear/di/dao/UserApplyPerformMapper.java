package com.ear.di.dao;

import com.ear.di.entity.UserApplyPerform;
import com.ear.di.entity.UserApplyPerformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserApplyPerformMapper {
    int countByExample(UserApplyPerformExample example);

    int deleteByExample(UserApplyPerformExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserApplyPerform record);

    int insertSelective(UserApplyPerform record);

    List<UserApplyPerform> selectByExample(UserApplyPerformExample example);

    UserApplyPerform selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserApplyPerform record, @Param("example") UserApplyPerformExample example);

    int updateByExample(@Param("record") UserApplyPerform record, @Param("example") UserApplyPerformExample example);

    int updateByPrimaryKeySelective(UserApplyPerform record);

    int updateByPrimaryKey(UserApplyPerform record);
}