package com.ear.di.dao;

import com.ear.di.entity.QuotationSheet;
import com.ear.di.entity.QuotationSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotationSheetMapper {
    int countByExample(QuotationSheetExample example);

    int deleteByExample(QuotationSheetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuotationSheet record);

    int insertSelective(QuotationSheet record);

    List<QuotationSheet> selectByExample(QuotationSheetExample example);

    QuotationSheet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSheet record, @Param("example") QuotationSheetExample example);

    int updateByExample(@Param("record") QuotationSheet record, @Param("example") QuotationSheetExample example);

    int updateByPrimaryKeySelective(QuotationSheet record);

    int updateByPrimaryKey(QuotationSheet record);
}