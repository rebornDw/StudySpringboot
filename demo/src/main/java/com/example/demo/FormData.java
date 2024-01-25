package com.example.demo;

import java.util.List;

public class FormData {
    private String textInput;
    private String dropdown;
    private List<String> checkbox;
    
	public String getTextInput() {
		return textInput;
	}
	public void setTextInput(String textInput) {
		this.textInput = textInput;
	}
	public String getDropdown() {
		return dropdown;
	}
	public void setDropdown(String dropdown) {
		this.dropdown = dropdown;
	}
	public List<String> getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(List<String> checkbox) {
		this.checkbox = checkbox;
	}
    
}