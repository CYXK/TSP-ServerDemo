package com.tsp.server.dao;

import com.tsp.server.bean.ServiceRequestor;
import com.tsp.server.bean.ServiceRequestorExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ServiceRequestorMapper {
    long countByExample(ServiceRequestorExample example);

    int deleteByExample(ServiceRequestorExample example);

    @Delete({
        "delete from ServiceRequestor",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ServiceRequestor (NAME)",
        "values (#{name,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ServiceRequestor record);

    int insertSelective(ServiceRequestor record);

    List<ServiceRequestor> selectByExample(ServiceRequestorExample example);

    @Select({
        "select",
        "ID, NAME",
        "from ServiceRequestor",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.tsp.server.dao.ServiceRequestorMapper.BaseResultMap")
    ServiceRequestor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceRequestor record, @Param("example") ServiceRequestorExample example);

    int updateByExample(@Param("record") ServiceRequestor record, @Param("example") ServiceRequestorExample example);

    int updateByPrimaryKeySelective(ServiceRequestor record);

    @Update({
        "update ServiceRequestor",
        "set NAME = #{name,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ServiceRequestor record);
}