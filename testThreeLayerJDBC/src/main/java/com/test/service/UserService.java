package com.test.service;


import java.util.List;


import com.test.domain.User;



public interface UserService {
	
	public int insert(User user);
	public User queryById(int userId);
	public List<User> queryUserList(User user) ;
	
	public List<User> queryUserAll();
}
