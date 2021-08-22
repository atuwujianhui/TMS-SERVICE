package com.fjzcit.tms.mapper.test;

import com.fjzcit.tms.model.test.InterfaceCase;
import com.fjzcit.tms.model.test.InterfaceCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceCaseMapper {
    long countByExample(InterfaceCaseExample example);

    int deleteByExample(InterfaceCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InterfaceCase record);

    int insertSelective(InterfaceCase record);

    List<InterfaceCase> selectByExample(InterfaceCaseExample example);

    InterfaceCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InterfaceCase record, @Param("example") InterfaceCaseExample example);

    int updateByExample(@Param("record") InterfaceCase record, @Param("example") InterfaceCaseExample example);

    /**
     * 按照主键更新，但是只更新字段不为空的数据
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(InterfaceCase record);

    /**
     * 安装主键更新整个对象
     * @param record
     * @return
     */
    int updateByPrimaryKey(InterfaceCase record);
}