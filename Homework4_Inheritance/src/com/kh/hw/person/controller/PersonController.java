package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] arr = {s.length, e.length};
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	
	public Student[] printStudent() {
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		
	}
}
