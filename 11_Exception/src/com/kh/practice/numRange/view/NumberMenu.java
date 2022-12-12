package com.kh.practice.numRange.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		try {
			if(!(0<num1 && num1<101 && 0<num2 && num2<101)) {
				throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
			}
			boolean result = new NumberController().checkDouble(num1, num2);
			System.out.printf("%d은(는) %d의 배수인가 ? %s",num1, num2, result);
		} catch(NumRangeException e) {
			e.printStackTrace();
		}
	}
}
