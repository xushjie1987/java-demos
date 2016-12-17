package com.testin.mapper;

import com.testin.domain.DruidDataSource;
import com.testin.domain.DruidDataSourceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DruidDataSourceMapper {
    long countByExample(DruidDataSourceCriteria example);

    int deleteByExample(DruidDataSourceCriteria example);

    int deleteByPrimaryKey(String datasource);

    int insert(DruidDataSource record);

    int insertSelective(DruidDataSource record);

    List<DruidDataSource> selectByExampleWithBLOBs(DruidDataSourceCriteria example);

    List<DruidDataSource> selectByExample(DruidDataSourceCriteria example);

    DruidDataSource selectByPrimaryKey(String datasource);

    int updateByExampleSelective(@Param("record") DruidDataSource record, @Param("example") DruidDataSourceCriteria example);

    int updateByExampleWithBLOBs(@Param("record") DruidDataSource record, @Param("example") DruidDataSourceCriteria example);

    int updateByExample(@Param("record") DruidDataSource record, @Param("example") DruidDataSourceCriteria example);

    int updateByPrimaryKeySelective(DruidDataSource record);

    int updateByPrimaryKeyWithBLOBs(DruidDataSource record);

    int updateByPrimaryKey(DruidDataSource record);
}