package com.rei.web.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rei.web.model.Hello;
import com.rei.web.service.HelloService;


@Controller
public class HelloController{
		
	@Autowired
	HelloService helloService;
	
	/**
	 * 作业界面
	 * @return
	 */
	@RequestMapping("hello")
	public String helloworld() {
		return "hello";
	}
	
	/**
	 * 添加数据
	 * @param hello
	 * @return
	 */
	@RequestMapping(value="sumitData",method=RequestMethod.POST)
	@ResponseBody
	public String sumitData(Hello data) {
		helloService.addData(data);		
		return "保存成功";
	}
	
	/**
	 * 通过sid删除数据
	 * @param sid
	 * @return
	 */
	@RequestMapping(value="deleteData",method=RequestMethod.POST)
	@ResponseBody
	public String deleteData(Integer sid) {
		helloService.delData(sid);		
		return "删除成功";
	}
	
	/**
	 * 通过sid修改姓名
	 * @param sid
	 * @param name
	 * @return
	 */
	@RequestMapping(value="changeData",method=RequestMethod.POST)
	@ResponseBody
	public String changeData(Integer sid, String name) {
		helloService.updateData(sid, name);		
		return "更新成功";
	}
	
	/**
	 * 查询数据
	 * @param name
	 * @return
	 */
	@RequestMapping(value="searchData",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Hello> searchData(String name) {
		ArrayList<Hello> data = helloService.getDataByName(name);		
		return data;
	}
	
	/**
	 * input输入框，下拉框使用的接口
	 * @param data
	 * @return
	 */
	@RequestMapping(value="hello1",method=RequestMethod.POST)
	@ResponseBody
	public String hello1(String data) {
		return data;
	}
	
	/**
	 * 接收多选框传递的json数据
	 * @param data
	 * @return
	 */
	@RequestMapping(value="hello2",method=RequestMethod.POST)
	@ResponseBody
	public String hello2(@RequestBody Map<String, ArrayList<String>> data ) {
		ArrayList<String> num = data.get("data");
		return num.toString();
	}
	
	/**
	 * 接收form标签传递的数据，并返回结果到网页上
	 * @param number2
	 * @param model
	 * @return
	 */
	@RequestMapping(value="helloForm",method=RequestMethod.POST)
	public String hello3(String number2, Model model) {
		model.addAttribute("data", number2);
		return "hello";
	}	
}
