package com.rei.web.model;

import org.springframework.web.multipart.MultipartFile;

public class FormData {
    private String textInput;
    private String select;
    private String checkBox1;
    private String checkBox2;
    private String checkBox3;
    private MultipartFile file;
	public String getTextInput() {
		return textInput;
	}
	public void setTextInput(String textInput) {
		this.textInput = textInput;
	}
	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}
	public String getCheckBox1() {
		return checkBox1;
	}
	public void setCheckBox1(String checkBox1) {
		this.checkBox1 = checkBox1;
	}
	public String getCheckBox2() {
		return checkBox2;
	}
	public void setCheckBox2(String checkBox2) {
		this.checkBox2 = checkBox2;
	}
	public String getCheckBox3() {
		return checkBox3;
	}
	public void setCheckBox3(String checkBox3) {
		this.checkBox3 = checkBox3;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
    
	
    
}