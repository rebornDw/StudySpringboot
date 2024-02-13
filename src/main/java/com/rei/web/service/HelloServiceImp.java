package com.rei.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rei.web.dao.HelloDao;
import com.rei.web.model.Hello;

@Service
public class HelloServiceImp implements HelloService {
	
	@Autowired
	public HelloDao helloDao;
	
	/**
	 * 添加数据
	 */
	@Override
	public String addData(Hello hello) {
		helloDao.addHello(hello.name, hello.age, hello.interest);
		return "添加成功";
	}
	
	/**
	 * 删除数据
	 */
	@Override
	public String delData(Integer sid) {
		helloDao.delHello(sid);
		return "删除成功";
	}

	/**
	 * 更新数据
	 */
	@Override
	public String updateData(Integer sid, String name) {
		helloDao.updateHello(sid, name);
		return "更新成功";
	}

	/**
	 * 查询数据
	 */
	@Override
	public ArrayList<Hello> getDataByName(String name) {
		ArrayList<Hello> findByName = helloDao.findHelloByName(name);
		return findByName;
	}

}
