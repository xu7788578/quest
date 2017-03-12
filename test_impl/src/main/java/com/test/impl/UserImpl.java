package com.test.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.model.request.User;
import com.test.request.UserApiRequest;
import com.test.server.CommonServer;
import com.test.server.QuestionServer;
import com.test.server.UserServer;

public class UserImpl implements QuestionServer{
	@Autowired
	UserServer userServer;
	@Autowired
	CommonServer commonServer;
	public int getRanDom() {
		// TODO Auto-generated method stub
		return commonServer.getRandom();
	}

	public Boolean insert(UserApiRequest user) {
		User u=new User();
		BeanUtils.copyProperties(user, u);
		return userServer.insert(u);
	}

}
