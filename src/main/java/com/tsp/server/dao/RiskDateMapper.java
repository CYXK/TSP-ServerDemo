package com.tsp.server.dao;

import com.tsp.server.bean.RiskDate;
import com.tsp.server.bean.RiskDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RiskDateMapper {
    long countByExample(RiskDateExample example);

    int deleteByExample(RiskDateExample example);

    @Delete({
        "delete from RiskDate",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into RiskDate (KEY, VALUE, ",
        "TOKEN_PROVISION_ID)",
        "values (#{key,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
        "#{tokenProvisionId,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(RiskDate record);

    int insertSelective(RiskDate record);

    List<RiskDate> selectByExample(RiskDateExample example);

    @Select({
        "select",
        "ID, KEY, VALUE, TOKEN_PROVISION_ID",
        "from RiskDate",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.tsp.server.dao.RiskDateMapper.BaseResultMap")
    RiskDate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RiskDate record, @Param("example") RiskDateExample example);

    int updateByExample(@Param("record") RiskDate record, @Param("example") RiskDateExample example);

    int updateByPrimaryKeySelective(RiskDate record);

    @Update({
        "update RiskDate",
        "set KEY = #{key,jdbcType=VARCHAR},",
          "VALUE = #{value,jdbcType=VARCHAR},",
          "TOKEN_PROVISION_ID = #{tokenProvisionId,jdbcType=CHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RiskDate record);
}