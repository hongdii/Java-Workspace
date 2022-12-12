package com.kh.chap04_override.run;

import com.kh.chap04_override.modle.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 모든 클래스는 Object 클래스의 후손이다. 즉, 최상위 클래스는 항상 Object
		 * => 즉, Oject에 있는 모~든 메소드들은 다! 가져다 쓸수 있음
		 * 		맘에 들지 않으면 오버라이딩해서 재정의가 가능함.
		 * 
		 */
		
		Book bk = new Book("수학의 정석", "오현지", 7000);
		
		/*
		 * 출력문 안에 레퍼런스(참조형) 변수를 제시해서 출력하고자 할때
		 * 내부적으로 JVM이 자동으로 toString() 메소드를 호출함.
		 * 
		 * 부모클래스인 Object클래스에 있는 toString()
		 * 해달 래퍼런스 타입의 풀클래스명 + @ + 해당객체의 주소값의 16진수
		 * 
		 * 자식클래스인 Book클래스에서 toString()메소드를 재정의
		 * 해당 객체의 모든 필드값을 하나의 문자열로 합쳐서 돌려주는 메소드로 재정의함.
		 */
		
		System.out.println(bk);
		// 메소드 변경전
		// com.kh.chap04_override.modle.vo.Book@53bd815b
		// toString()메서드 사용하나 안하나 출력값 같음
		// 메소드 변경후
		// 책 제목 : 책 제목 : 수학의 정석, 책 저자 : 오현지책 가격 : 7000
		// toString()메서드를 오버라이딩하여 원하고자하는 값 출력
		}

}
