package com.ear.di.dao;

import com.ear.di.entity.ChnlAgentInfo;
import com.ear.di.entity.ChnlAgentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChnlAgentInfoMapper {
    int countByExample(ChnlAgentInfoExample example);

    int deleteByExample(ChnlAgentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ChnlAgentInfo record);

    int insertSelective(ChnlAgentInfo record);

    List<ChnlAgentInfo> selectByExample(ChnlAgentInfoExample example);

    ChnlAgentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ChnlAgentInfo record, @Param("example") ChnlAgentInfoExample example);

    int updateByExample(@Param("record") ChnlAgentInfo record, @Param("example") ChnlAgentInfoExample example);

    int updateByPrimaryKeySelective(ChnlAgentInfo record);

    int updateByPrimaryKey(ChnlAgentInfo record);
}