package com.test.dao;


import java.util.List;

import com.test.domain.Student;



public interface StuDao {

	
	public int insert(Student stu);
	public Student queryById(int stuId);
	public List<Student> queryStuList(Student stu);
}
