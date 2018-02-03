package com.tsp.server.dao;

import com.tsp.server.bean.BillingAddress;
import com.tsp.server.bean.BillingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface BillingAddressMapper {
    long countByExample(BillingAddressExample example);

    int deleteByExample(BillingAddressExample example);

    @Delete({
        "delete from BillingAddress",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into BillingAddress (ACCOUNT_ID, COUNTRY, ",
        "PROVINCE, CITY, ",
        "LINE1, LINE2, POSTAL_CODE)",
        "values (#{accountId,jdbcType=INTEGER}, #{country,jdbcType=VARCHAR}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{line1,jdbcType=VARCHAR}, #{line2,jdbcType=VARCHAR}, #{postalCode,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(BillingAddress record);

    int insertSelective(BillingAddress record);

    List<BillingAddress> selectByExample(BillingAddressExample example);

    @Select({
        "select",
        "ID, ACCOUNT_ID, COUNTRY, PROVINCE, CITY, LINE1, LINE2, POSTAL_CODE",
        "from BillingAddress",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.tsp.server.dao.BillingAddressMapper.BaseResultMap")
    BillingAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BillingAddress record, @Param("example") BillingAddressExample example);

    int updateByExample(@Param("record") BillingAddress record, @Param("example") BillingAddressExample example);

    int updateByPrimaryKeySelective(BillingAddress record);

    @Update({
        "update BillingAddress",
        "set ACCOUNT_ID = #{accountId,jdbcType=INTEGER},",
          "COUNTRY = #{country,jdbcType=VARCHAR},",
          "PROVINCE = #{province,jdbcType=VARCHAR},",
          "CITY = #{city,jdbcType=VARCHAR},",
          "LINE1 = #{line1,jdbcType=VARCHAR},",
          "LINE2 = #{line2,jdbcType=VARCHAR},",
          "POSTAL_CODE = #{postalCode,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BillingAddress record);
}