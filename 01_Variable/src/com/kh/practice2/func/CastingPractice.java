package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice {
	public void test() {
		double kor,eng,math,sum; // double kor,eng,math;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		math = sc.nextDouble();
		
		sum = kor+eng+math; // int sum = (int)(kor+eng+math);
							// int avg = sum/3;
		System.out.printf("총점 : %d \n", (int)sum); // System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %d", (int)sum/3);  // System.out.printf("평균 : %d", avg);
	}
}
