package com.rei.web.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rei.web.model.Student;

public interface StudentDao extends JpaRepository<Student, Long> {
	
	
	@Query("select s from Student s where s.name = :name")
	public ArrayList<Student> findStudentByName(@Param(value = "name") String name);
	
	
}
