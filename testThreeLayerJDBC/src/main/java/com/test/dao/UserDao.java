package com.test.dao;


import java.util.List;

import com.test.domain.User;



public interface UserDao {

	
	public int insert(User user);
	public User queryById(int userId);
	
	
	
	public List<User> queryUserList(User user) ;
	
	public List<User> queryUserAll();
}
