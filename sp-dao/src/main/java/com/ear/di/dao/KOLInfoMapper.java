package com.ear.di.dao;

import com.ear.di.entity.KOLInfo;
import com.ear.di.entity.KOLInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KOLInfoMapper {
    int countByExample(KOLInfoExample example);

    int deleteByExample(KOLInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(KOLInfo record);

    int insertSelective(KOLInfo record);

    List<KOLInfo> selectByExample(KOLInfoExample example);

    KOLInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") KOLInfo record, @Param("example") KOLInfoExample example);

    int updateByExample(@Param("record") KOLInfo record, @Param("example") KOLInfoExample example);

    int updateByPrimaryKeySelective(KOLInfo record);

    int updateByPrimaryKey(KOLInfo record);
}