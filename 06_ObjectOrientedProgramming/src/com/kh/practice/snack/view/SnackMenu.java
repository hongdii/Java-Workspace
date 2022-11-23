package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		// nextLine() 메서드가 호출된 후 nextInt()메서드와 같은 메서드가 호출되면
		// 엔터가 남기때문에 다시 nextLine()메서드를 사용할시 다시한번 nextLine()메서드를 호출해줘야함.
		sc.nextLine();
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			System.out.println(scr.confirmData());
		}
	}
}
