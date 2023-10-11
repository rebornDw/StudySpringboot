package com.rei.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rei.web.dao.StudentDao;
import com.rei.web.model.Student;

@Service
@Transactional
public class StudentServiceImp implements StudentService  {

	@Autowired
	public StudentDao studentDao;
	
	
	//通过名字查询学生的业务
	@Override
	public ArrayList<Student> getStuByName(String name) {
		ArrayList<Student> findByName = studentDao.findStudentByName(name);
		return findByName;
	}


	@Override
	public ArrayList<Student> getStuByNianji(String nianji) {
		// TODO Auto-generated method stub
		ArrayList<Student> findByNianji = studentDao.findStudentByNianji(nianji);
		return findByNianji;
	}
	
	
	@Override
	public void deleteStuByName(String name) {
		// TODO Auto-generated method stub
		studentDao.deleteStudentByName(name);
	}

	
	@Override
	public int updateStuByNianji(Long id, String nianji) {
		// TODO Auto-generated method stub
		return studentDao.updateStudentByNianji(id, nianji);
	}


	@Override
	public ArrayList<Student> getStuById(Long id) {
		return studentDao.findStudentById(id);
	}

}

