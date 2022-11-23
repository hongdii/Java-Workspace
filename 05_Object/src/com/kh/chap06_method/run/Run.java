package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {
	// JVM : Java Virtual Machine의 줄임말. 직역하면 '자바를 실행하기 위한 가상 기계(컴퓨터)'
	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();
		int random = mt1.method2();
		System.out.println("랜덤값 : "+random);
		
		mt1.method3(100, 1000);
		
		System.out.println("a * b = "+mt1.method4(9, 28));
	
		System.out.println("=================================");
		
		// static 메소드의 경우에 new문으로 객체를 생성할 필요가 없다.
		// static이 붙은 클래스변수와 마찬가지로, 메소드 또한 프로그램 실행시 정적메모리영역에 저장되기때문.
		MethodTest2.method1();
		
		//MethodTest1.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("오현지", 23); 	// 반드시 인자를 넘겨줘야 메서드가 실행됨. String, int 자료형 순으로 값을 넣어주어야함.(자료형과 매개변수 갯수 일치 주의)
		
		System.out.println(MethodTest2.method4(100));
	}
	
}
