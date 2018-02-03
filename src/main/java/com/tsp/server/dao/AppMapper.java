package com.tsp.server.dao;

import com.tsp.server.bean.App;
import com.tsp.server.bean.AppExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AppMapper {
    long countByExample(AppExample example);

    int deleteByExample(AppExample example);

    @Delete({
        "delete from App",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into App (ID, PROFILE_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{profileId,jdbcType=INTEGER})"
    })
    int insert(App record);

    int insertSelective(App record);

    List<App> selectByExample(AppExample example);

    @Select({
        "select",
        "ID, PROFILE_ID",
        "from App",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.tsp.server.dao.AppMapper.BaseResultMap")
    App selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") App record, @Param("example") AppExample example);

    int updateByExample(@Param("record") App record, @Param("example") AppExample example);

    int updateByPrimaryKeySelective(App record);

    @Update({
        "update App",
        "set PROFILE_ID = #{profileId,jdbcType=INTEGER}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(App record);
}