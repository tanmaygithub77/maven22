package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.bean.user;

@Repository
public class LoginDaoImpl implements LoginDao {
@Autowired
private JdbcTemplate jdbcTemplate;


	@Override
	public user validate(String name, String pass) {
		String sql="select * from user where username=? and password=?";
	user m=(user)jdbcTemplate.queryForObject(sql,new Object[] {name,pass},new RowMapper<user>() {

			@Override
			public user mapRow(ResultSet rs, int arg1) throws SQLException {
				user u=new user(rs.getString(1),rs.getString(2));
				return u;
			}
			
		});
		return m;
	}

}
