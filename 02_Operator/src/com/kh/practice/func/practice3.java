package com.kh.practice.func;
import java.util.Scanner;

public class practice3 {
	
	public void test3 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : ((13 < age && age <= 19) ? "청소년" : "성인");
		System.out.println(result);
	}
	

}
