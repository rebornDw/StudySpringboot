package com.rei.web.service;

import java.util.ArrayList;

import com.rei.web.model.Student;

public interface StudentService {

	public ArrayList<Student> getStuByName(String name);
	
    public ArrayList<Student> getStuByNianji(String nianji);
    
    public void deleteStuByName(String name);
	
	
}
