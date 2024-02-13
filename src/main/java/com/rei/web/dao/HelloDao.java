package com.rei.web.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rei.web.model.Hello;

public interface HelloDao extends JpaRepository<Hello, Long> {	
	
	/**
	 * 添加数据,hql没有insert into values的values关键字，需切换为nativeQuery使用sql的写法
	 * @param name 姓名
	 * @param age 年龄
	 * @param interest 爱好
	 */
	@Modifying
	@Transactional
	@Query(value = "insert into Hello(name,age,interest) values (:name, :age, :interest)", nativeQuery = true)
	public void addHello(@Param(value = "name") String name,
			@Param(value = "age") Integer age,
			@Param(value = "interest") String interest);
	
	/**
	 * 通过id删除数据
	 * @param id
	 */
	@Modifying
	@Transactional
	@Query("delete from Hello h where h.sid = :sid")
	public void delHello(@Param(value = "sid") Integer sid);
	
	/**
	 * 通过id修改姓名
	 * @param id
	 * @param name
	 */
	@Modifying
	@Transactional
	@Query("update Hello h set h.name = :name where h.sid = :sid")
	public void updateHello(@Param("sid") Integer sid, @Param("name") String name);
	
	/**
	 * 通过name查询数据,hql不支持select *
	 * @param name
	 * @return
	 */
	@Query("select h from Hello h where h.name = :name")
	public ArrayList<Hello> findHelloByName(@Param(value = "name") String name);
		
}
