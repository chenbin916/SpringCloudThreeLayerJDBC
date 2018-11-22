package com.test.dao;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class BaseDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public int insert(String sql ,String userName) {

		int res=jdbcTemplate.update(sql,userName);
		return res;
	}
	
	public <T> int insert(String sql,T domain) {

		int res=jdbcTemplate.update(sql, domain);
		return res;
	}
	
	
	public <T> T getObjById (Class<T> tClass,String sql,int id) 
	{
		RowMapper<T>rowMapper=new BeanPropertyRowMapper<T>(tClass);
		
		
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
	
	
	public <T> List<T> getObjList (Class<T> tClass,String sql, String args[]) 
	{
		RowMapper<T>rowMapper=new BeanPropertyRowMapper<T>(tClass);
		return jdbcTemplate.query(sql, args, rowMapper);		
	
	}
	
	
	public <T> List<T> getObjList (Class<T> tClass,String sql) 
	{
		RowMapper<T>rowMapper=new BeanPropertyRowMapper<T>(tClass);
		return jdbcTemplate.query(sql, rowMapper); 
			
	
	}
	
	


}
