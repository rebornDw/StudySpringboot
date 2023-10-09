package com.rei.web.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rei.web.model.Student;

public interface XuTestDao extends JpaRepository<Student, Long> {
	
	
	@Query("select s from Student s where s.nianji = :nianji")
	public ArrayList<Student> findStudentByNianji(@Param(value = "nianji") String nianji);
	
	@Modifying
	@Query("delete from Student s where s.name = :name")
	public void deleteStudentByName(@Param(value = "name") String name);
	
	@Query("select s from Student s where s.nianji = :name")
	public ArrayList<Student> findStudentByName(@Param(value = "name") String name);
	
}
