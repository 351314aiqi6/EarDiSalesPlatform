package com.ear.di.dao;

import com.ear.di.entity.IppEMandateEvent;
import com.ear.di.entity.IppEMandateEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IppEMandateEventMapper {
    int countByExample(IppEMandateEventExample example);

    int deleteByExample(IppEMandateEventExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IppEMandateEvent record);

    int insertSelective(IppEMandateEvent record);

    List<IppEMandateEvent> selectByExample(IppEMandateEventExample example);

    IppEMandateEvent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IppEMandateEvent record, @Param("example") IppEMandateEventExample example);

    int updateByExample(@Param("record") IppEMandateEvent record, @Param("example") IppEMandateEventExample example);

    int updateByPrimaryKeySelective(IppEMandateEvent record);

    int updateByPrimaryKey(IppEMandateEvent record);
}