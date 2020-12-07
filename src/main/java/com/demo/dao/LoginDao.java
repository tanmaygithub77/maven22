package com.demo.dao;

import com.demo.bean.user;

public interface LoginDao {

	user validate(String name, String pass);

}
