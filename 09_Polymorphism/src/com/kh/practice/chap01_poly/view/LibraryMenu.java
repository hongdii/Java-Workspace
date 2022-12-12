package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibaryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibaryController lc = new LibaryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별 : ");
		char gen = sc.nextLine().charAt(0);
		
		Member mem = new Member();
		mem.setAge(age);
		mem.setName(name);
		mem.setGender(gen);
		lc.insertMember(mem);
		//회원등록부
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 :");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				return;
			}
		}
	}

	public void selectAll() {
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		Book[] bList = lc.selectAll();
		for(int i =0; i< bList.length; i++) {
			System.out.println(i+"번도서 : "+bList[i]);
		}
	}

	public void searchBook() {
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
		sc.nextLine();
		
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i =0; i< searchList.length; i++) {// null
			if(searchList[i] != null) {
				System.out.println(i+"번도서 : "+searchList[i]);
			}
		}
		
	}

	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		// LibraryController의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우 → “성공적으로 대여되었습니다.” 출력
		// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니
		// 마이페이지에서 확인하세요” 출력
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(result == 0 ) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
	}

}
