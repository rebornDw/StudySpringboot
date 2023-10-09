package com.rei.web.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	
    @Id
	public int id;
	
	public String sex;
	
	public String age;
	
	public String name;
	
	public String nianji;
	
	public String t_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() { 	
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getclass() {
		return nianji;
	}

	public void setclass(String nianji) {
		this.nianji = nianji;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	
	

}
