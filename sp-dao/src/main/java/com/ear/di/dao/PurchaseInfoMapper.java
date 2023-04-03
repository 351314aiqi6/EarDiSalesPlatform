package com.ear.di.dao;

import com.ear.di.entity.PurchaseInfo;
import com.ear.di.entity.PurchaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseInfoMapper {
    int countByExample(PurchaseInfoExample example);

    int deleteByExample(PurchaseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchaseInfo record);

    int insertSelective(PurchaseInfo record);

    List<PurchaseInfo> selectByExample(PurchaseInfoExample example);

    PurchaseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchaseInfo record, @Param("example") PurchaseInfoExample example);

    int updateByExample(@Param("record") PurchaseInfo record, @Param("example") PurchaseInfoExample example);

    int updateByPrimaryKeySelective(PurchaseInfo record);

    int updateByPrimaryKey(PurchaseInfo record);
}