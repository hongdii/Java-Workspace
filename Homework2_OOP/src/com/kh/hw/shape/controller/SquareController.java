package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	Shape s = new Shape();
	
	// 둘레
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return width*2 + height*2;
	}
	
	//넓이
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return width * height;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 "+s.information();
	}
}
