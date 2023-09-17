package com.rei.web.model;

import java.util.ArrayList;

public class Teacher {

	public String name;
	
	public String classIndex;
	
	public ArrayList<Student> stuList;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassIndex() {
		return classIndex;
	}

	public void setClassIndex(String classIndex) {
		this.classIndex = classIndex;
	}

	public ArrayList<Student> getStuList() {
		return stuList;
	}

	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}
	
	
	
}
