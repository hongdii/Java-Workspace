package com.kh.third.run;

import com.kh.third.MethodTest;

public class Run {
	
	public static void main(String[] args) {
		
		//1. 사용하고자하는 클래스 임포트
		MethodTest mt = new MethodTest();
		
		//2. 내가 실행하고자하는 일반메서드 실행
		mt.printMethodA();
		
		System.out.println("메인메서드 종료!");
	}
}
