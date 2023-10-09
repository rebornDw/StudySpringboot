package com.rei.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rei.web.dao.StudentDao;
import com.rei.web.dao.XuTestDao;
import com.rei.web.model.Student;

@Service
@Transactional
public class XuTestServiceImp implements XuTestServise  {

	@Autowired
	public XuTestDao xuTestDao;
	
	
	//通过名字查询学生的业务
	@Override
	public ArrayList<Student> getStuByNianji(String nianji) {
		ArrayList<Student> findByNianji = xuTestDao.findStudentByNianji(nianji);
		return findByNianji;
	}
	
	@Override
	public ArrayList<Student> getStuByName(String name) {
		ArrayList<Student> findByName = xuTestDao.findStudentByName(name);
		return findByName;
	}

	@Override
	public void deleteStuByName(String name) {
		xuTestDao.deleteStudentByName(name);
	}

}
