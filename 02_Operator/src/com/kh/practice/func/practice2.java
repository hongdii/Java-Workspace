package com.kh.practice.func;
import java.util.Scanner;

public class practice2 {
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade= sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cl = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int b = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double j = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade, cl, b, name, 
				(gender == 'M' ? "남" : "여"), j);
		
	}
	
}
