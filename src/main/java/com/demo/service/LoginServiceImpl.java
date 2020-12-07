package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.user;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;

	@Override
	public user validate(String name, String pass) {
		return loginDao.validate(name,pass);
		
	}

}
