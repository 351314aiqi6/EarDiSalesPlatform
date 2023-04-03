package com.ear.di.dao;

import com.ear.di.entity.MerchantInfo;
import com.ear.di.entity.MerchantInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantInfoMapper {
    int countByExample(MerchantInfoExample example);

    int deleteByExample(MerchantInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MerchantInfo record);

    int insertSelective(MerchantInfo record);

    List<MerchantInfo> selectByExample(MerchantInfoExample example);

    MerchantInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MerchantInfo record, @Param("example") MerchantInfoExample example);

    int updateByExample(@Param("record") MerchantInfo record, @Param("example") MerchantInfoExample example);

    int updateByPrimaryKeySelective(MerchantInfo record);

    int updateByPrimaryKey(MerchantInfo record);
}