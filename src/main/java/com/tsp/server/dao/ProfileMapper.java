package com.tsp.server.dao;

import com.tsp.server.bean.Profile;
import com.tsp.server.bean.ProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ProfileMapper {
    long countByExample(ProfileExample example);

    int deleteByExample(ProfileExample example);

    @Delete({
        "delete from Profile",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into Profile (SERVICE_REQUESTOR_ID, NAME, ",
        "TOKEN_REQUESTOR_ID, STATUS, ",
        "ENCRYPTION_API_KEY, ENCRYPTION_SECRET, ",
        "POSTBACK_API_KEY, POSTBACK_SECRET, ",
        "POSTBACK_URL, MAXPMTS, ",
        "KEYEXPTS, AMOUNT_LIMIT)",
        "values (#{serviceRequestorId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{tokenRequestorId,jdbcType=CHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{encryptionApiKey,jdbcType=VARCHAR}, #{encryptionSecret,jdbcType=VARCHAR}, ",
        "#{postbackApiKey,jdbcType=VARCHAR}, #{postbackSecret,jdbcType=VARCHAR}, ",
        "#{postbackUrl,jdbcType=VARCHAR}, #{maxpmts,jdbcType=INTEGER}, ",
        "#{keyexpts,jdbcType=TIMESTAMP}, #{amountLimit,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Profile record);

    int insertSelective(Profile record);

    List<Profile> selectByExample(ProfileExample example);

    @Select({
        "select",
        "ID, SERVICE_REQUESTOR_ID, NAME, TOKEN_REQUESTOR_ID, STATUS, ENCRYPTION_API_KEY, ",
        "ENCRYPTION_SECRET, POSTBACK_API_KEY, POSTBACK_SECRET, POSTBACK_URL, MAXPMTS, ",
        "KEYEXPTS, AMOUNT_LIMIT",
        "from Profile",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.tsp.server.dao.ProfileMapper.BaseResultMap")
    Profile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Profile record, @Param("example") ProfileExample example);

    int updateByExample(@Param("record") Profile record, @Param("example") ProfileExample example);

    int updateByPrimaryKeySelective(Profile record);

    @Update({
        "update Profile",
        "set SERVICE_REQUESTOR_ID = #{serviceRequestorId,jdbcType=INTEGER},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "TOKEN_REQUESTOR_ID = #{tokenRequestorId,jdbcType=CHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "ENCRYPTION_API_KEY = #{encryptionApiKey,jdbcType=VARCHAR},",
          "ENCRYPTION_SECRET = #{encryptionSecret,jdbcType=VARCHAR},",
          "POSTBACK_API_KEY = #{postbackApiKey,jdbcType=VARCHAR},",
          "POSTBACK_SECRET = #{postbackSecret,jdbcType=VARCHAR},",
          "POSTBACK_URL = #{postbackUrl,jdbcType=VARCHAR},",
          "MAXPMTS = #{maxpmts,jdbcType=INTEGER},",
          "KEYEXPTS = #{keyexpts,jdbcType=TIMESTAMP},",
          "AMOUNT_LIMIT = #{amountLimit,jdbcType=BIGINT}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Profile record);
}