package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		// 무한루프로 꾸며주는 것이 좋음.
		while(true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;	// 반복문 자체를 빠져나가야하기 때문에 break가 아닌 return문 사용
						// break문은 switch만 빠져나감.
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}	
		}
	}
	
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		inputSize(3, num);
	}
	
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		inputSize(4, num);
	}
	
	public void inputSize(int type, int menuNum) {
		if(type==3) {
			switch(menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
				triangleMenu();
				break;
			case 2:
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				triangleMenu();
				break;
			case 3:
				printInformation(3);
				triangleMenu();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				inputMenu();
				break;
			}
		} else if(type==4) {
			switch(menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
				squareMenu();
				break;
			case 2:
				System.out.print("높이 : ");
				double height1 = sc.nextDouble();
				System.out.print("너비 : ");
				double width1 = sc.nextDouble();
				System.out.println("사각형 면적 : " + scr.calcArea(height1, width1));
				squareMenu();
				break;
			case 3:
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				squareMenu();
				break;
			case 4:
				printInformation(4);				
				squareMenu();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				inputMenu();
				break;
			}
		}
	}
	
	public void printInformation(int type) {
		String result = "";
		if(type==3) {
			result = tc.print();
			//System.out.println(tc.print());
		} else if(type==4) {
			result = scr.print();
			//System.out.println(scr.print());
		}
		System.out.println(result);
	}
	
}
