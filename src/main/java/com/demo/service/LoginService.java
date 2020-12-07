package com.demo.service;

import com.demo.bean.user;

public interface LoginService {

	user validate(String name, String pass);

}
