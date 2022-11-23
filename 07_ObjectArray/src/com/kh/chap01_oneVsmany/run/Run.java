package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// 1. 기본 생성자로 객체를 생성 후 setter메서드를 통해 각 필드에 값 대입.
//		Book bk1 = new Book();	// 생성자 생성과 함께 객체의 값이 모두 null 혹은 0으로 초기화되어있음.
//		bk1.setTitle("자바의 정석");
//		bk1.setAuthor("오현지");
//		bk1.setPrice(18000);
//		bk1.setPublisher("KH");
//		
//		System.out.println(bk1.information());
//		
//		// 2. 매개변수 생성자로 객체 생성과 동시에 각 필드에 값을 대입하는 방법
//		Book bk2 = new Book("C언어", "오현징", 17000, "나무");
//		System.out.println(bk2.information());
//		
//		// 3. 사용자가 입력한 값들로 객체 생성		// 대부분 3번과 같이 사용자가 입력한 값을 통해 작업하는 과정을 95퍼 사용. 따라서 1,2번에 비해 중요.
//		// Book bk3 = new Book(제목, 저자, 가격, 출판사);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("저자 : ");
//		String author = sc.nextLine();
//		
//		System.out.print("가격 : ");
//		int price = sc.nextInt();
//		sc.nextLine();	// 입력 버퍼값 없애기
//		
//		System.out.print("출판사 : ");
//		String publisher = sc.nextLine();
//		
//		Book bk3 = new Book(title, author, price, publisher);
//		System.out.println(bk3.information());
		
		// 세개의 Book객체가 필요하다는 가정하에 각각의 book 객체를 따로따로 관리.
		// 단, 사용자에게 입력받은 값들로 book객체 채워넣기.
		Book bk1 = null;	// Book과같은 참조자료형의 기본값은 무조건 주소값이기때문에 null집어넣음
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1 ; i<=3 ; i++) {	// 1 2 3
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();	// 입력 버퍼값 없애기
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i==1) {
				bk1 = new Book(title, author, price, publisher);

			} else if(i==2) {
				bk2 = new Book(title, author, price, publisher);

			} else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		
		// 반복문 사용불가
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
	}

}
