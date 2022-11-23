package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Book[] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서정보를 입력받은 후 각 객체 배열의 인덱스에 해당 객체를 생성하기.
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
		}
		
		// 전체 도서정보들 출력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i].information());
		}
		
		// 사용자에게 검색할 도서 제목을 입력받아 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메서드
		
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.nextLine();
		
//		for(int i=0 ; i< arr.length ; i++) {
//			if(arr[i].getTitle().equals(searchTitle)) {  // arr 인덱스에 해당되는 주소값을 통해 각각의 객체의 메서드에 접근가능
//				// 그중에 책제목 알아오기위해 겟타이틀 사용하였고, 책제목의 자료형은 String형이기때문에 equals메서드사용
//				System.out.println(arr[i].getPrice());
//			}
//		}
		
		// 만약 일치하는 도서를 찾지 못한 경우 "검색한 도서가 없습니다" 출력
		
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				count++;
				System.out.println("책의 가격 : "+arr[i].getPrice());
				break;	// 배열의 크기가 클때를 대비하여 코드 효율을 높이기위해 분기문 작성.
						// 책의 제목이 중복되지 않은 이상 break문을 걸어주게 되면
						// 찾고자하는 책을 찾고나서 더이상 반복문을 실행시키지 않음.
			} 
		}
		if(count==0) {
			System.out.println("검색한 도서가 없습니다.");
		}
	}

}
