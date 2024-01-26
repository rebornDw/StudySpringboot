package com.rei.web.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rei.web.service.StudentService;

@Controller
public class IndexController {

	@Autowired
	public StudentService studentService;
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}

	@RequestMapping("about")
	public String about() {
		return "about";
	}

	@RequestMapping("service")
	public String service() {
		return "services";
	}

	@RequestMapping("pages")
	public String pages() {
		return "pricing";
	}

	@RequestMapping("portfolio")
	public String protfolio() {
		return "portfolio";
	}

	@RequestMapping("blog")
	public String blog() {
		return "blog";
	}

	@RequestMapping("contact")
	public String contact() {
		return "contact";
	}

}
