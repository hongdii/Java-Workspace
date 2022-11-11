package com.kh.third;

public class MethodTest {
	
	public void printMethodA() {
		
		System.out.println("프린트메서드A 출력중!!"); //System은 자바에서 제공하는 기본 클래스, 따라서 첫글자를 대문자로 기술
		
		printMethodB(); //printMethodB 호출
		
	}
	
	public void printMethodB() {
		
		System.out.println("프린트메서드B 출력중!!");
		
		printMethodC();
	}
	
	public void printMethodC() {
		
		System.out.println("프린트메서드C 출력중!!");
		
		//printMethodA();
	}
	
}
