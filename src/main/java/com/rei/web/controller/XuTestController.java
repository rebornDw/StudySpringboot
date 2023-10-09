package com.rei.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rei.web.model.Student;
import com.rei.web.service.XuTestServise;

@Controller
public class XuTestController {

	@Autowired
	XuTestServise xuTestService;
	
	@RequestMapping("xuTest1")
	public String Study() {
		return"xuTest";
	}
	
	@RequestMapping("xuTest2")
	@ResponseBody
	public String xuStudyData() {
		return "xu123";
	}
	
	@RequestMapping(value="xuTest6",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenByName(String stuNianji){
		ArrayList<Student> stuByNianji = xuTestService.getStuByNianji(stuNianji);
		return stuByNianji;
	}
	
	@RequestMapping(value="xuTest5",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenByXingming(String stuName,String stuNianji){
		xuTestService.deleteStuByName(stuName);
		ArrayList<Student> stuByNianji = xuTestService.getStuByNianji(stuNianji);
		return stuByNianji;
	}
}
