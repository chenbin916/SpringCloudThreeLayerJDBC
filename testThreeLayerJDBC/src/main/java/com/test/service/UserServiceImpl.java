package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.domain.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	
	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public User queryById(int userId) {
		return userDao.queryById(userId);
	}

	@Override
	public List<User> queryUserList(User user) {
		// TODO Auto-generated method stub
		return userDao.queryUserList(user);
	}

	@Override
	public List<User> queryUserAll() {
		// TODO Auto-generated method stub
		return userDao.queryUserAll();
	}

}
