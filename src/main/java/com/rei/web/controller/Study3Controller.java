package com.rei.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rei.web.model.Student;
import com.rei.web.service.StudentService;

@Controller
public class Study3Controller {
	@Autowired
	StudentService a;
	
	
	@RequestMapping(value="study0923",method=RequestMethod.GET)
	public String study2() {
		return "study3";
	}

	@RequestMapping(value="study0923",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenById(String id){
		return a.getStuById(Long.valueOf(id));
		
	}
	
	
	@RequestMapping(value="update0923",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenByName(String nianji,String id){
		a.updateStuByNianji(Long.valueOf(id),nianji);
		return a.getStuById(Long.valueOf(id)); 
		
	}
	

}
