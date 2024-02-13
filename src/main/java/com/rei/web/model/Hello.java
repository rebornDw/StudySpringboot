package com.rei.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "hello")
public class Hello {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer sid;

	@Column(name = "name")
	public String name;

	@Column(name = "age")
	public Integer age;

	@Column(name = "interest")
	public String interest;
	
	public long getId() {
		return sid;
	}

	public void setId(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "sid=" + sid + 
				", name='" + name  + 
				", age='" + age  + 
				", interest='" + interest;
	}

}
