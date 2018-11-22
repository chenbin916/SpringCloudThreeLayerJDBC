package com.test.service;



import java.util.List;

import com.test.domain.Student;



public interface StuService {
	
	public int insert(Student stu);
	public Student queryById(int stuId);
	public List<Student> queryStuList(Student stu);

}
