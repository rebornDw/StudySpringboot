package com.rei.web.service;

import java.util.ArrayList;

import com.rei.web.model.Hello;

public interface HelloService {	
	
	public String addData(Hello hello);
	
	public String delData(Integer id);
	
	public String updateData(Integer id, String name);
	
	public ArrayList<Hello> getDataByName(String name);
	
}
