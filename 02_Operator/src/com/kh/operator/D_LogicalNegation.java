package com.kh.operator;

public class D_LogicalNegation {

	/*
	 * 논리부정연산자 ! (단항연산자) 
	 * 
	 * !논리값(true/false)
	 * 
	 * 논리값을 반대로 바꿔주는 연산자
	 */
	
	public void method() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : "+ !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		System.out.println("b : "+b+", b2 : "+b2);
		// bool값은 원래 변수에 포함된 값을 변화시키지않음. 출력되고 사라짐. 
		// 원래 변수에 포함된 값을 변경하는 연산자는 증감연산자밖에 없음.
		
		// 계산식에 논리부정연산자 사용하기
		
		boolean b3 = !(5>3);
		System.out.println("b3 : "+b3);
	}
	
}
