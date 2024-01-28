package com.rei.web.controller;


import java.io.File;
import java.io.IOException;


import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



@Controller

@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/")
	String index() {
		return "index";
	}

	@RequestMapping("/showForm") // 替换成你的视图URL
	public String showForm() {
		return "index2"; // 返回前端页面的名称，这个页面将展示表单
	}

	/**
	 * ajax提交保留备用
	 * 
	 * @param formData
	 * @param model
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@PostMapping("/submit")
	@ResponseBody
	public String handleFormSubmission(
			@RequestPart("textInputAjax") String textInputAjax,
			@RequestPart("selectAjax") String selectAjax,
			@RequestPart("checkboxAjax1") String checkboxAjax1,
			@RequestPart("checkboxAjax2") String checkboxAjax2,
			@RequestPart("checkboxAjax3") String checkboxAjax3,
			@RequestPart("file") MultipartFile file
			)
			throws IllegalStateException, IOException {
		// Handle form submission logic here
		System.out.println("textInputAjax: " + textInputAjax);
		System.out.println("Select: " + selectAjax);
		System.out.println("checkboxAjax1: " + checkboxAjax1);
		System.out.println("Checkbox values: " + checkboxAjax2);
		System.out.println("Checkbox values: " + checkboxAjax3);

		// 图片的名字
		String originalFilename = file.getOriginalFilename();
		System.out.println("originalFilename: " + originalFilename);
		// 要保存的路径
		String path = "C:\\Users\\Administrator\\Desktop\\img\\";

		File imgFile = new File(path + originalFilename);
		file.transferTo(imgFile);

		return "success";
	}

	/**
	 * 表单提交方式
	 * 
	 * @param textInput
	 * @param dropdown
	 * @param file
	 * @param checkbox
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@PostMapping("/submitform")
	@ResponseBody
	public String submitform(@RequestParam("textInput") String textInput, @RequestParam("dropdown") String dropdown,
			@RequestParam("imageInput") MultipartFile file,
			@RequestParam(name = "checkbox", required = false) List<String> checkbox)
			throws IllegalStateException, IOException {
		// Handle form submission logic here
		System.out.println("Received form submission:");
		System.out.println("TextInput: " + textInput);
		System.out.println("Dropdown: " + dropdown);
		System.out.println("file: " + file.getOriginalFilename());
		System.out.println("Checkbox values: " + checkbox);

		// 图片的名字
		String originalFilename = file.getOriginalFilename();
		// 要保存的路径
		String path = "C:\\Users\\Administrator\\Desktop\\img\\";

		File imgFile = new File(path + originalFilename);
		file.transferTo(imgFile);


		// Return a view to display after form submission (e.g., a success page)
		return "success";
	}

}