package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	
	public void test4() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String s = sc.nextLine(); // 좌측과 우측은 동일한 자료형이어야함.
		
		System.out.println("첫 번째 문자 : "+s.charAt(0));
		System.out.println("두 번째 문자 : "+s.charAt(1));
		System.out.println("세 번째 문자 : "+s.charAt(2));
		//System.out.println("세 번째 문자 : "+"apple".charAt(2)); => 고정된 문자열에서 사용가능함
	}
	
}
