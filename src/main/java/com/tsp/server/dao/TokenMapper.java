package com.tsp.server.dao;

import com.tsp.server.bean.Token;
import com.tsp.server.bean.TokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TokenMapper {
    long countByExample(TokenExample example);

    int deleteByExample(TokenExample example);

    @Delete({
        "delete from Token",
        "where TOKEN = #{token,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String token);

    @Insert({
        "insert into Token (TOKEN, ID, ",
        "PROFILE_ID, STATUS, ",
        "EXPIRATION_DATE, MAXPMTS, ",
        "KEYEXPTS, AMOUNT_LIMIT)",
        "values (#{token,jdbcType=VARCHAR}, #{id,jdbcType=CHAR}, ",
        "#{profileId,jdbcType=INTEGER}, #{status,jdbcType=VARCHAR}, ",
        "#{expirationDate,jdbcType=DATE}, #{maxpmts,jdbcType=INTEGER}, ",
        "#{keyexpts,jdbcType=TIMESTAMP}, #{amountLimit,jdbcType=BIGINT})"
    })
    int insert(Token record);

    int insertSelective(Token record);

    List<Token> selectByExample(TokenExample example);

    @Select({
        "select",
        "TOKEN, ID, PROFILE_ID, STATUS, EXPIRATION_DATE, MAXPMTS, KEYEXPTS, AMOUNT_LIMIT",
        "from Token",
        "where TOKEN = #{token,jdbcType=VARCHAR}"
    })
    @ResultMap("com.tsp.server.dao.TokenMapper.BaseResultMap")
    Token selectByPrimaryKey(String token);

    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenExample example);

    int updateByExample(@Param("record") Token record, @Param("example") TokenExample example);

    int updateByPrimaryKeySelective(Token record);

    @Update({
        "update Token",
        "set ID = #{id,jdbcType=CHAR},",
          "PROFILE_ID = #{profileId,jdbcType=INTEGER},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "EXPIRATION_DATE = #{expirationDate,jdbcType=DATE},",
          "MAXPMTS = #{maxpmts,jdbcType=INTEGER},",
          "KEYEXPTS = #{keyexpts,jdbcType=TIMESTAMP},",
          "AMOUNT_LIMIT = #{amountLimit,jdbcType=BIGINT}",
        "where TOKEN = #{token,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Token record);
}