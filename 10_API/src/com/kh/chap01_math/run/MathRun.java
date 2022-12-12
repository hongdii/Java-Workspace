package com.kh.chap01_math.run;

// import java.lang.*;
// 생략 가능, 보이진 않지만 항상 자동으로 java.lang 패키지가 import 되어있음.
// String 또한 패키지안에 있어서 임포트하지않아도 사용 가능.

public class MathRun {

	public static void main(String[] args) {
		
		// Math 클래스 (수학과 관련된 기능을 제공함)
		
		// 파이 => Math클래스 내에 상수필드로 정의되어 있음.
		System.out.println("파이 : "+Math.PI); 	// 출력해보면 파이값 상수필드로 정의되어있움
		
		// 메소드명(매개변수) : 반환형
		// 올림 => Math.ceil(double) : 반환값 double형		// 자주 쓰임
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1));
		
		// 반올림 => Math.round(double) : 반환값 long형		// 자주 쓰임
		System.out.println("반올림 : "+Math.round(num1));	// num1이 4.3일때 4, 4.5일때 5 반환
		
		// 버림 => Math.floor(double)	 : 반환값 double형
		System.out.println("버림 : "+Math.floor(num1));
		
		// 가장 가까운 정수값을 알아낸 후 실수형 반환 : rint
		System.out.println("가장 가까운 정수값 : "+Math.rint(num1));	//	반올림과 비슷한 역할. 잘 사용안됨
		
		// 절대값 => Math.abs(int/double/long/float) : 반환값 : 매개변수 그대로 	// 다양한 자료형의 매개변수를 넣을수있기때문에 오버로딩된 메서드라는것
		int num2 = -10;
		System.out.println("절대값 : "+Math.abs(num2)); 
		
		// 코딩테스트에서 수학메서드 자주사용
		// 최소값 => Math.min(int, int) : 반환값 int
		System.out.println("최소값 : "+Math.min(5, 10));
		
		// 최대값 => Math.max(int, int) : 반환값 int
		System.out.println("최대값 : "+Math.max(5, 10)); // max는 두 개의 매개변수만 가질수 있음
		
		// 실제로 사용안하고 코딩테스트에서는 간혹 사용
		// 제곱근(루트) => Math.sqrt(double) : 반환값 double
		System.out.println("8의 제곱근 : "+Math.sqrt(8));
		
		// 제곱 => Math.pow(double, double) : 반환값 double
		System.out.println("2의 10 제곱 : "+Math.pow(2, 10));
		
		// 자바스크립트와 디비 언어에서 자주 사용됨
		
		/*
		 * java.lang.Math 클래스의 특징
		 * - 모든 필드 => 상수필드
		 * - 모든 메소드 => static 메소드
		 * 
		 * 모든게 다 staric이기 때문에 Math.필드 or Math.메서드명 으로 다 접근가능(객체생성할 필요가 없음)
		 * Math 클래스의 생성자가 private이다. (객체생성불가)
		 * 
		 */
		
		// openJDK11 document 구글에 검색해서 읽어보기
		// 신규 업데이트를 개발자문서로 공유하기때문에 개발자 문서 참고해서 공부하기
		// 실무에서 가장 많이 사용하는게 JDK11이나 8이라서 그 문서 참고하기
		// 개발자 문서 영문으로 되어있는걸 보는것이 좋으나 번역본 찾아서 있으면 그걸로 보기(없으면 파파고로 번역해서 보기~)
		
	}

}
