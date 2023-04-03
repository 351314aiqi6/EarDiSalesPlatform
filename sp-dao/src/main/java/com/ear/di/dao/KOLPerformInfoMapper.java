package com.ear.di.dao;

import com.ear.di.entity.KOLPerformInfo;
import com.ear.di.entity.KOLPerformInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KOLPerformInfoMapper {
    int countByExample(KOLPerformInfoExample example);

    int deleteByExample(KOLPerformInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(KOLPerformInfo record);

    int insertSelective(KOLPerformInfo record);

    List<KOLPerformInfo> selectByExample(KOLPerformInfoExample example);

    KOLPerformInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") KOLPerformInfo record, @Param("example") KOLPerformInfoExample example);

    int updateByExample(@Param("record") KOLPerformInfo record, @Param("example") KOLPerformInfoExample example);

    int updateByPrimaryKeySelective(KOLPerformInfo record);

    int updateByPrimaryKey(KOLPerformInfo record);
}