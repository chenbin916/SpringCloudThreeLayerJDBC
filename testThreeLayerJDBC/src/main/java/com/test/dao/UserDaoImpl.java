package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.test.domain.Student;
import com.test.domain.User;
@Repository
public class UserDaoImpl extends BaseDao implements UserDao  {
	
	
	
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		String sql="insert user  (userName) values(?)";
		return this.insert(sql, user.getUserName());
	}

	@Override
	public User queryById(int userId) {
		// TODO Auto-generated method stub
		
	String sql="select * from user where userId=?";
		
	return this.getObjById(User.class, sql, userId);
		
	}
	
	
	@Override
	public List<User> queryUserList(User user) {
		String sql="select * from user where userName=? ";
		String []args =new String[1];
		args[0]=user.getUserName();
		return this. getObjList (User.class, sql, args);
	}
	@Override
	public List<User> queryUserAll() {
		String sql="select * from user ";
		return this. getObjList (User.class, sql);
	}


}
