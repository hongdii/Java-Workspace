package com.kh.practice.func;
import java.util.Scanner;

public class practice4 {
	
	public void test4 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		int sum = a+b+c;
		double avg = sum/3;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg );
		
		String result = (a >= 40 && b >= 40 && c >= 40) && (avg >= 60 ) ? "합격" : "불합격";
		
		System.out.println(result);
		
		
	}

	public void test5 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		String resNo = sc.nextLine();
		char gender = resNo.charAt(7);
		
		String result = (gender == '2' || gender == '4') ? "여자" : "남자";
		// '1' == 1 -> 49 == 1, '2' == 1 -> 50 == 1
		// gender는 문자형이기때문에 문자로 비교해주어야함
		
		System.out.println(result);
		
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = ((num2 < num3) || (num3 <= num1)) ? true : false;
		
		System.out.println(result);
		
	}
	
	public void test7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = ( (num1==num2) && (num2==num3) && (num3==num1)) ?  true : false;
		
		System.out.println(result);
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		double incentiveI1 = a*1.4; // 3000 * 0.4 +3000 == 3000 * 1.4(식을 간략화)
		// 3000 * 0.4 +3000 과 같이 표현하면 정확도 가 떨어지기 때문에 3000 * 1.4로 표현하는 것이 좋음.
		System.out.println("A사원 연봉/연봉+a : "+a+"/"+incentiveI1);
		System.out.println((incentiveI1 >= 3000) ? "3000 이상" : "3000 미만");

		System.out.println("B사원 연봉/연봉+a : "+b+"/"+(double)b);
		System.out.println((b >= 3000) ? "3000 이상" : "3000 미만");
		
		double incentiveI2 = c*1.15;
		System.out.println("C사원 연봉/연봉+a : "+c+"/"+incentiveI2);
		System.out.println((incentiveI2 >= 3000) ? "3000 이상" : "3000 미만");
		
	}
}
