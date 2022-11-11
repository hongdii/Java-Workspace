package com.kh.practice.func;
import java.util.Scanner;

public class OperatorPractice1 {
	
	public void test1 () {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("인원 수 : ");
	int num1 = sc.nextInt();
	
	System.out.print("사탕 개수 : ");
	int num2 = sc.nextInt();
	
	System.out.println("1인당 사탕 개수 : " + (num2 / num1));
	System.out.println("남는 사탕 개수 : " + (num2 % num1));
	}
}
