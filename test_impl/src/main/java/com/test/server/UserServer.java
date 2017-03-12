package com.test.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.model.request.User;

@Service
public class UserServer {
	private static final Logger LOG = LoggerFactory
			.getLogger(UserServer.class);
  @Autowired
  UserDao userDao;
  public Boolean insert(User user){
	  if(user!=null){
		  try {
			  userDao.insert(user);
			  return true;
		} catch (Exception e) {
			LOG.error("用户插入失败",e.getMessage());
			 return false;
		}
	  }else{
		  return false;
	  }
	  
  }
}
