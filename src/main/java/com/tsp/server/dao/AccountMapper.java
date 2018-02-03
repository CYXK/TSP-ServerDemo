package com.tsp.server.dao;

import com.tsp.server.bean.Account;
import com.tsp.server.bean.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    long countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    @Delete({
        "delete from Account",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into Account (PROFILE_ID, ACCOUNT_NUMBER, ",
        "CVV2, NAME, TEL, ",
        "ID_TYPE, ID_NUMBER, ",
        "EXPIRATION_DATE, STATUS)",
        "values (#{profileId,jdbcType=INTEGER}, #{accountNumber,jdbcType=VARCHAR}, ",
        "#{cvv2,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{tel,jdbcType=VARCHAR}, ",
        "#{idType,jdbcType=VARCHAR}, #{idNumber,jdbcType=VARCHAR}, ",
        "#{expirationDate,jdbcType=DATE}, #{status,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    @Select({
        "select",
        "ID, PROFILE_ID, ACCOUNT_NUMBER, CVV2, NAME, TEL, ID_TYPE, ID_NUMBER, EXPIRATION_DATE, ",
        "STATUS",
        "from Account",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.tsp.server.dao.AccountMapper.BaseResultMap")
    Account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    @Update({
        "update Account",
        "set PROFILE_ID = #{profileId,jdbcType=INTEGER},",
          "ACCOUNT_NUMBER = #{accountNumber,jdbcType=VARCHAR},",
          "CVV2 = #{cvv2,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "TEL = #{tel,jdbcType=VARCHAR},",
          "ID_TYPE = #{idType,jdbcType=VARCHAR},",
          "ID_NUMBER = #{idNumber,jdbcType=VARCHAR},",
          "EXPIRATION_DATE = #{expirationDate,jdbcType=DATE},",
          "STATUS = #{status,jdbcType=CHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Account record);
}