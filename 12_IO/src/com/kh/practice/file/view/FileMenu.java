package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****\n1. 노트 새로 만들기\n2. 노트 열기\n3. 노트 열어서 수정하기\n"
					+ "9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}	
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		// StringBuilder 변수 sb에 값 넣으려면 .append()메서드 활용 그것을 String형으로 바꾸려면 .toString()메서드 활용
		// StringBuilder가 무엇인지 공부
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			
			if(str.equals("ex끝it")) {
				break;
			}
			// 입력한 값을 StringBuilder에 저장
			sb.append(str + "\n");	// 줄바꿈 처리 미리하려고 FileMenu에서 \n 추가해줌
		}
		
		while(true) {
			System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();
			
			if(fc.checkName(fileName) /*== true*/) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				char yOn = sc.nextLine().charAt(0);
				if(yOn == 'y'|| yOn == 'Y') {
					fc.fileSave(fileName, sb); /* StringBuilder 넘김*/
				} else {
					System.out.println("파일명을 다시 입력해주세요.");
					continue;	// 파일명을 다시 입력할 경우 위의 while문을 만나지 않고 현재 while문 안을 반복하도록 작업하기위해 사용
				}
			}else {
				fc.fileSave(fileName, sb); /*파일내용(StringBuilder) 넘김*/
			}
			break;
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String openName = sc.nextLine();
		
		if(fc.checkName(openName) /*== true*/) {
			// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
			System.out.println(fc.fileOpen(openName));	// StringBuilder를 문자열로 바꿔주려면 toString()사용해야하지만 자동호출돼서 안써도됨
		}else {
			System.out.println("없는 파일입니다.");
			//mainMenu();
		}
		
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String editName = sc.nextLine();
		
		if(fc.checkName(editName) == false) {
			System.out.println("없는 파일입니다.");
			//mainMenu();
		} else {
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str = sc.nextLine();
				
				if(str.equals("ex끝it")) {
					break;
				}
				sb.append(str+"\n"); // 입력한 값을 StringBuilder에 저장
			}
			
			fc.fileEdit(editName, sb); /* StringBuilder 전달*/
			
		}
	}
}
