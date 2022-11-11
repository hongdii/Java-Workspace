package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice2 {
	
	// 메서드 작성
	public void test2() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.println("더하기 결과 : "+(a+b)); 
		// a+b 라고 쓸경우 a=1, b=2일때, 12로 표시됨
		// (a+b) 의 경우 a=1, b=2일때, 3으로 덧셈 연산이 되어 표시됨
		System.out.println("빼기 결과 : "+(a-b));
		System.out.println("곱하기 결과 : "+(a*b));
		System.out.println("나누기 몫 결과 : "+(a/b));
	}
}
