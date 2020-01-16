package com._520.spring_tx.xml.dao.impl;

import com._520.spring_tx.xml.dao.IAccountDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

public class AccountDAOImpl implements IAccountDAO {

    // jdbc模板类
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void transOut(Long outId, int money) {
        jdbcTemplate.update("UPDATE account SET balence = balence - ? WHERE id = ?",money, outId);
    }

    public void transIn(Long inId, int money) {
        jdbcTemplate.update("UPDATE account SET balence = balence + ? WHERE id = ?",money, inId);
    }
}
