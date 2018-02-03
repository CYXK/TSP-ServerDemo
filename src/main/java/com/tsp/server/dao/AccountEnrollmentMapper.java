package com.tsp.server.dao;

import com.tsp.server.bean.AccountEnrollment;
import com.tsp.server.bean.AccountEnrollmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface AccountEnrollmentMapper {
    long countByExample(AccountEnrollmentExample example);

    int deleteByExample(AccountEnrollmentExample example);

    @Insert({
        "insert into AccountEnrollment (ID, ACCOUNT_ID, ",
        "WALLET_ACCOUNT, LOCALE, ",
        "ACCOUNT_SOURCE, ACCOUNT_ENTRY_MODE)",
        "values (#{id,jdbcType=CHAR}, #{accountId,jdbcType=INTEGER}, ",
        "#{walletAccount,jdbcType=VARCHAR}, #{locale,jdbcType=VARCHAR}, ",
        "#{accountSource,jdbcType=VARCHAR}, #{accountEntryMode,jdbcType=VARCHAR})"
    })
    int insert(AccountEnrollment record);

    int insertSelective(AccountEnrollment record);

    List<AccountEnrollment> selectByExample(AccountEnrollmentExample example);

    int updateByExampleSelective(@Param("record") AccountEnrollment record, @Param("example") AccountEnrollmentExample example);

    int updateByExample(@Param("record") AccountEnrollment record, @Param("example") AccountEnrollmentExample example);
}