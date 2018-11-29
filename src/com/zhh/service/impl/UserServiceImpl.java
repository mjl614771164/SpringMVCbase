package com.zhh.service.impl;

import com.zhh.dao.UserDao;
import com.zhh.beans.User;
import com.zhh.service.UserService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserServiceImpl implements UserService{
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	public UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add(User user){
		userDao.add(user);
		logger.info("123");
		System.out.println(123);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

	@Override
	public void delete(String id) {
		userDao.delete(id);
	}
}
