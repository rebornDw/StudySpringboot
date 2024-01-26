package com.rei.web.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.rei.web.model.FormData;

@Controller
@RequestMapping("/demo") 
public class DemoController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
    
    

@RequestMapping("/showForm")  // 替换成你的视图URL
public String showForm() {
    return "index2";  // 返回前端页面的名称，这个页面将展示表单
}

/**
 * ajax提交保留备用
 * @param formData
 * @param model
 * @return
 */
@PostMapping("/submit")
public String handleFormSubmission(@RequestBody FormData formData, Model model) {
    // Handle form submission logic here
    System.out.println("Received form submission:");
    System.out.println("TextInput: " + formData.getTextInput());
    System.out.println("Dropdown: " + formData.getDropdown());
    System.out.println("Checkbox values: " + formData.getCheckbox());

    // You can add attributes to the model if needed for the response view
    model.addAttribute("submissionMessage", "Form submitted successfully!");

    // Return a view to display after form submission (e.g., a success page)
    return "success";
}

/**
 * 表单提交方式
 * @param textInput
 * @param dropdown
 * @param file
 * @param checkbox
 * @return
 */
@PostMapping("/submitform")
public String submitform(@RequestParam("textInput") String textInput,
		@RequestParam("dropdown") String dropdown,
		@RequestParam("imageInput") MultipartFile file,
        @RequestParam(name = "checkbox", required = false) List<String> checkbox){
    // Handle form submission logic here
    System.out.println("Received form submission:");
    System.out.println("TextInput: " + textInput);
    System.out.println("Dropdown: " + dropdown);
    System.out.println("file: " + file.getOriginalFilename());
    System.out.println("Checkbox values: " + checkbox);

    // Return a view to display after form submission (e.g., a success page)
    return "success";
}

}