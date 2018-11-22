package com.test.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.domain.Student;
@Repository
public class StuDaoImpl extends BaseDao implements StuDao  {
	
	
	@Override
	public int insert(Student stu) {
		String sql="insert student  (stuName,stuSex,stuAge) values(?,?,?)";
		return this.insert(sql, stu.getStuName());
	}

	@Override
	public Student queryById(int stuId) {
	String sql="select * from student where stuId=?";
	return this.getObjById(Student.class, sql, stuId);
		
	}

	@Override
	public List<Student> queryStuList(Student stu) {
		String sql="select * from student where stuSex=? and  stuAge>? ";
		String []args =new String[2];
		args[0]=stu.getStuSex();
		args[1]=String.valueOf(stu.getStuAge());
		return this. getObjList (Student.class, sql, args);
	}
	
	public List<Student> queryStuAll() {
		String sql="select * from student";
		return this. getObjList (Student.class, sql);
	}

}
