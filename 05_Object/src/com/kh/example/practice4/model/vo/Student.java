package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//초기화 블럭
	{
		grade = 3;
		classroom = 15;
		name = "오현지";
		height = 164.2;
		gender = '여';
	}
	
	public void Student() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}

	public void information() {
		System.out.println("이름 : "+name+", 학년 : "+grade+", 반 : "+classroom
				+", 키 : "+height+", 성별 : "+gender);
	}
}
