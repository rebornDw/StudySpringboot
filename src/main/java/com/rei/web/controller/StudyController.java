package com.rei.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rei.web.model.Student;
import com.rei.web.model.Teacher;
import com.rei.web.service.StudentService;


@Controller
public class StudyController {
	
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("test1")
	public String study() {
		return "study";
	}
	
	
	@RequestMapping("test2")
	@ResponseBody
	public String studyData() {
		return "123456789";
	}
	
	
	@RequestMapping(value="test3",method=RequestMethod.POST)
	@ResponseBody
	public Student studyDataJson() {
		
		Student stu = new Student();
		stu.setId(1);
		stu.setName("zhangsan");
		stu.setAge(18);
		stu.setNianji("1");
		stu.setDescription("this is a student");
		return stu;
	}
	
	
	@RequestMapping("test4")
	@ResponseBody
	public ArrayList<Student> studyDataJsonList() {
		
		ArrayList<Student> stuList= new ArrayList<Student>();
		
		Student stu = new Student();
		stu.setId(1);
		stu.setName("zhangsan");
		stu.setAge(18);
		stu.setNianji("1");
		stu.setDescription("this is a student");
		
		
		Student stu1 = new Student();
		stu1.setId(1);
		stu1.setName("lisi");
		stu1.setAge(19);
		stu1.setNianji("2");
		stu1.setDescription("this is a student2");
		
		
		stuList.add(stu);
		stuList.add(stu1);
		
		return stuList;
	}
	
	@RequestMapping("test5")
	@ResponseBody
	public Teacher teaDataJsonList() {
		
		ArrayList<Student> stuList= new ArrayList<Student>();
		
		Student stu = new Student();
		stu.setId(1);
		stu.setName("zhangsan");
		stu.setAge(18);
		stu.setNianji("1");
		stu.setDescription("this is a student");
		
		
		Student stu1 = new Student();
		stu1.setId(1);
		stu1.setName("lisi");
		stu1.setAge(19);
		stu1.setNianji("2");
		stu1.setDescription("this is a student2");
		
		
		stuList.add(stu);
		stuList.add(stu1);
		
		
		Teacher tea = new Teacher();
		tea.setName("wang");
		tea.setClassIndex("一班");
		tea.setStuList(stuList);
		
		
		return tea;
	}
	
	@RequestMapping(value="test6",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Student> studenByName(String name){
		ArrayList<Student> stuByName = studentService.getStuByName(name);
		return stuByName;
	}
	
	
	
}





