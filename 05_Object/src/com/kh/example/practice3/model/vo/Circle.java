package com.kh.example.practice3.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private int radius = 1; //반지름
	
	public Circle() {
		System.out.println("원의 둘레 : "+(PI*radius*2)+", "+"원의 넓이 : "+(PI*radius*radius));
	}
	
	public void incrementRadius(int num) {
		radius += num;
	}
	
	public void getAreaOfCircle() {
		System.out.print("원의 둘레 : "+ (PI*radius*2)+", ");
	}
	
	public void getSizeOfCircle() {
		System.out.println( "원의 넓이 : "+(PI*radius*radius));
	}
}
