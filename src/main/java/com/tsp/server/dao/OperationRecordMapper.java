package com.tsp.server.dao;

import com.tsp.server.bean.OperationRecord;
import com.tsp.server.bean.OperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface OperationRecordMapper {
    long countByExample(OperationRecordExample example);

    int deleteByExample(OperationRecordExample example);

    @Delete({
        "delete from OperationRecord",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into OperationRecord (TOKEN_ID, ACTION_NAME, ",
        "TIMESTAMP, DESCRIPTION)",
        "values (#{tokenId,jdbcType=CHAR}, #{actionName,jdbcType=VARCHAR}, ",
        "#{timestamp,jdbcType=TIMESTAMP}, #{description,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(OperationRecord record);

    int insertSelective(OperationRecord record);

    List<OperationRecord> selectByExample(OperationRecordExample example);

    @Select({
        "select",
        "ID, TOKEN_ID, ACTION_NAME, TIMESTAMP, DESCRIPTION",
        "from OperationRecord",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.tsp.server.dao.OperationRecordMapper.BaseResultMap")
    OperationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationRecord record, @Param("example") OperationRecordExample example);

    int updateByExample(@Param("record") OperationRecord record, @Param("example") OperationRecordExample example);

    int updateByPrimaryKeySelective(OperationRecord record);

    @Update({
        "update OperationRecord",
        "set TOKEN_ID = #{tokenId,jdbcType=CHAR},",
          "ACTION_NAME = #{actionName,jdbcType=VARCHAR},",
          "TIMESTAMP = #{timestamp,jdbcType=TIMESTAMP},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OperationRecord record);
}