package com.rei.web.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rei.web.model.Student;

public interface StudentDao extends JpaRepository<Student, Long> {
	
	
	@Query("select s from Student s where s.name = :name")
	public ArrayList<Student> findStudentByName(@Param(value = "name") String name);
	
	
	@Query("select s from Student s where s.nianji = :nianji")
	public ArrayList<Student> findStudentByNianji(@Param(value = "nianji") String nianji);
	

	@Modifying
	@Query("delete from Student s where s.name= :name")
	public void deleteStudentByName(@Param(value = "name") String name);
	

	@Modifying
	@Query("update Student s set s.nianji = :nianji where s.id = :id")
	public int updateStudentByNianji(
			@Param(value="id") Long id, 
			@Param(value = "nianji") String nianji
			);
	
	
	@Query("select s from Student s where s.id = :id")
	public ArrayList<Student> findStudentById(@Param(value = "id") Long id);

	
}
