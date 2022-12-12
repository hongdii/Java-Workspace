package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	int[] arr = pc.personCount();
	
	public void mainMenu() {
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+arr[0]+"명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 "+arr[1]+"명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: studentMenu(); break;
			case 2: employeeMenu(); break;
			case 9: System.out.println("종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void studentMenu() {
		System.out.println("1. 학생 추가\n2. 학생 보기\n9. 메인으로\n메뉴 번호 : ");
		
		if(arr[0] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에\n학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");	
		}

		int num = sc.nextInt();
		
		while(true) {
			switch(num) {
			case 1: 
				insertStudent(); 
				if(arr[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); 
				}
				break;
			case 2: printStudent(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); mainMenu(); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
		

		
	}
	
	public void employeeMenu() {
		System.out.println("1. 사원 추가\n2. 사원 보기\n9. 메인으로\n메뉴 번호 : ");
		
		if(arr[1] == 3) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에\n사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");	
		}

		int num = sc.nextInt();
		
		while(true) {
			switch(num) {
			case 1: 
				insertEmployee(); 
				if(arr[1] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); 
				}
				break;
			case 2: printEmployee(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); mainMenu(); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void insertStudent() {
		
		if(arr[0] != 3) {
			while(true) {
				System.out.print("학생 이름 : ");
				String name = sc.nextLine();
				System.out.print("학생 나이 : ");
				int age = sc.nextInt();
				System.out.print("학생 키 : ");
				double height = sc.nextDouble();
				System.out.print("학생 몸무게 : ");
				double weight = sc.nextDouble();
				System.out.print("학생 학년 : ");
				int grade = sc.nextInt();
				System.out.print("학생 전공 : ");
				String major = sc.nextLine();
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				
			}
		}
		

		
		pc.insertStudent(name, age, height, weight, grade, major);
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
