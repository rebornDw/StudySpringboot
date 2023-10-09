package com.rei.web.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	
    @Id
	public long id;
	
	public String sex;
	
	public String description;
	
	public Integer age;
	
	public String name;
	
	public String nianji;
	
	public Integer t_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNianji() {
		return nianji;
	}

	public void setNianji(String nianji) {
		this.nianji = nianji;
	}

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}
	
	

}
