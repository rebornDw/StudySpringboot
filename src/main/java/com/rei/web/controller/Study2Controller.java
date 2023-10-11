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
public class Study2Controller {
	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value="study092300000",method=RequestMethod.GET)
	public String study2() {
		return "study2";
	}
	
	@RequestMapping(value="study092300000",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenByNianji(String nianji){
		ArrayList<Student> stuByNianji = studentService.getStuByNianji(nianji);
		return stuByNianji;
	}
	
	
	@RequestMapping(value="study10",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenByName(String name,String nianji){
		studentService.deleteStuByName(name);
		ArrayList<Student> stuByNianji = studentService.getStuByNianji(nianji);
		return stuByNianji;
	}
	
	
}

	
