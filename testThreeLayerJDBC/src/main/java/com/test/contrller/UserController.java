package com.test.contrller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.Student;
import com.test.domain.User;
import com.test.service.StuService;
import com.test.service.UserService;

@RestController
public class UserController {
	
	 @Autowired
	 UserService userService;

	 @Autowired
	 StuService stuService;
	 
	 @RequestMapping("/hello1")
	 public String hello1(String name) 
	 {
		 int c=1/0;
		 return "Hello:"+name;
		 
		 
	 }
	 
	 @RequestMapping("/hello")
	 public String hello(String name) 
	 {
		 return "Hello:"+name;
		 
		 
	 }
	 
	 
	 @RequestMapping("/save")
	 public String save(String userName) 
	 {
		 User user= new User();
		 user.setUserName(userName);
		 
		 userService.insert(user);
		 return "save successful:"+userName;
	 }
	 
	 
	 @RequestMapping("/getUSer")
	 public User getUser (int userId)
	 {
		 
		 User user=userService.queryById(userId);
		 
		 return user;
		 
	 }

	 
	 
	 
	 //
	 
	 
	 
	 
	 @RequestMapping("/queryUserAll")
	 public List <User>  queryUserAll ()
	 {

		 
		 return userService.queryUserAll();
		 
	 }
	 
	 
	 @RequestMapping("/queryUserList")
	 public List <User>  queryUserList()
	 {
		 User user=new User();
		 user.setUserName("tommy");
		 List <User> users=userService.queryUserList(user);
		 return users;
		 
	 }
	 
	 
	 //below  table student table operator 
	 
	 
	 @RequestMapping("/queryStuList")
	 public List <Student>  queryStuList ()
	 {
		 Student stu=new Student();
		 stu.setStuAge(23);
		 stu.setStuSex("1");
		 List <Student> stus=stuService.queryStuList(stu);
		 
		 return stus;
		 
	 }
	 
	 
	 
	 
}
