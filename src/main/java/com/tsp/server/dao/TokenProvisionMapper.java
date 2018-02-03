package com.tsp.server.dao;

import com.tsp.server.bean.TokenProvision;
import com.tsp.server.bean.TokenProvisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TokenProvisionMapper {
    long countByExample(TokenProvisionExample example);

    int deleteByExample(TokenProvisionExample example);

    @Delete({
        "delete from TokenProvision",
        "where ID = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into TokenProvision (ID, DEVICE_ID, ",
        "WALLET_ACCOUNT, IP4ADDRESS, ",
        "LOCATION, LOCATION_SOURCE, ",
        "EMAIL_ADDRESS, PROTECTION_TYPE, ",
        "PRESENTATION_TYPE, ACCOUNT_TYPE, ",
        "LOCALE, ACCOUNT_SOURCE, ",
        "CONSUMER_ENTRY_MODE)",
        "values (#{id,jdbcType=CHAR}, #{deviceId,jdbcType=CHAR}, ",
        "#{walletAccount,jdbcType=VARCHAR}, #{ip4address,jdbcType=VARCHAR}, ",
        "#{location,jdbcType=VARCHAR}, #{locationSource,jdbcType=VARCHAR}, ",
        "#{emailAddress,jdbcType=VARCHAR}, #{protectionType,jdbcType=VARCHAR}, ",
        "#{presentationType,jdbcType=VARCHAR}, #{accountType,jdbcType=VARCHAR}, ",
        "#{locale,jdbcType=VARCHAR}, #{accountSource,jdbcType=VARCHAR}, ",
        "#{consumerEntryMode,jdbcType=VARCHAR})"
    })
    int insert(TokenProvision record);

    int insertSelective(TokenProvision record);

    List<TokenProvision> selectByExample(TokenProvisionExample example);

    @Select({
        "select",
        "ID, DEVICE_ID, WALLET_ACCOUNT, IP4ADDRESS, LOCATION, LOCATION_SOURCE, EMAIL_ADDRESS, ",
        "PROTECTION_TYPE, PRESENTATION_TYPE, ACCOUNT_TYPE, LOCALE, ACCOUNT_SOURCE, CONSUMER_ENTRY_MODE",
        "from TokenProvision",
        "where ID = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.tsp.server.dao.TokenProvisionMapper.BaseResultMap")
    TokenProvision selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TokenProvision record, @Param("example") TokenProvisionExample example);

    int updateByExample(@Param("record") TokenProvision record, @Param("example") TokenProvisionExample example);

    int updateByPrimaryKeySelective(TokenProvision record);

    @Update({
        "update TokenProvision",
        "set DEVICE_ID = #{deviceId,jdbcType=CHAR},",
          "WALLET_ACCOUNT = #{walletAccount,jdbcType=VARCHAR},",
          "IP4ADDRESS = #{ip4address,jdbcType=VARCHAR},",
          "LOCATION = #{location,jdbcType=VARCHAR},",
          "LOCATION_SOURCE = #{locationSource,jdbcType=VARCHAR},",
          "EMAIL_ADDRESS = #{emailAddress,jdbcType=VARCHAR},",
          "PROTECTION_TYPE = #{protectionType,jdbcType=VARCHAR},",
          "PRESENTATION_TYPE = #{presentationType,jdbcType=VARCHAR},",
          "ACCOUNT_TYPE = #{accountType,jdbcType=VARCHAR},",
          "LOCALE = #{locale,jdbcType=VARCHAR},",
          "ACCOUNT_SOURCE = #{accountSource,jdbcType=VARCHAR},",
          "CONSUMER_ENTRY_MODE = #{consumerEntryMode,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TokenProvision record);
}