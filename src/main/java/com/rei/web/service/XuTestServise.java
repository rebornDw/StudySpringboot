package com.rei.web.service;

import java.util.ArrayList;

import com.rei.web.model.Student;

public interface XuTestServise {

	public ArrayList<Student> getStuByNianji(String nianji);
	
	public ArrayList<Student> getStuByName(String name);
	
	public void deleteStuByName(String name);
	
}
