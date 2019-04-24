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
	
	
	public void batchInsert(String sql ,List<Person> persons) {
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				//	"(userType, userID, imageSequence, imagePathIP, imageURL, faceModelValue, updateTime, cmdFlag, cardGUID,personName,personSex,faceModelZone) " +
				Person person = persons.get(i);
				ps.setInt(1, person.getUserType());
				ps.setString(2, person.getUserID());
				ps.setString(3, person.getImageSequence());
				ps.setString(4, person.getImagePathIP());
				ps.setString(5, person.getImageURL());
				ps.setString(6, person.getFaceModelValue());
				ps.setDate(7, (Date) person.getUpdateTime());
				ps.setString(8, person.getCmdFlag());
				ps.setString(9, person.getCardGUID());
				ps.setString(10, person.getPersonName());
				ps.setString(11, person.getPersonSex());
				ps.setString(12, person.getFaceModelZone());
			}
					
			@Override
			public int getBatchSize() {
				return persons.size();
			}
		  });
		
	
	}
	
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
