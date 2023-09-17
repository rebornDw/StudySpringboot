package com.rei.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rei.web.dao.StudentDao;
import com.rei.web.model.Student;

@Service
public class StudentServiceImp implements StudentService  {

	@Autowired
	public StudentDao studentDao;
	
	
	//通过名字查询学生的业务
	@Override
	public ArrayList<Student> getStuByName(String name) {
		ArrayList<Student> findByName = studentDao.findStudentByName(name);
		return findByName;
	}

}
