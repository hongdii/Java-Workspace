package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	
	// ctrl +shift +O => 여러개 클래스 임포트 가능.
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		System.out.println("1. 사원 추가\r\n"
				+ "2. 사원 수정\r\n"
				+ "3. 사원 삭제\r\n"
				+ "4. 사원 출력\r\n"
				+ "9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 9:
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void insertEmp() {
		
	}
	
	public void updateEmp() {
			
		}
	
	public void deleteEmp() {
		
	}
	
	public void printEmp() {
		
	}
}
