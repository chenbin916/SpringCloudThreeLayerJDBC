package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StuDao;
import com.test.domain.Student;

@Service
public class StuServiceImpl implements StuService{
	
	@Autowired
	StuDao stuDao;
	
	
	@Override
	public int insert(Student stu) {
		return stuDao.insert(stu);
	}

	@Override
	public Student queryById(int stuId) {
		return stuDao.queryById(stuId);
	}
	
	@Override
	public List<Student>queryStuList(Student stu)
	{
		
		return stuDao.queryStuList(stu);
	}



	
}
