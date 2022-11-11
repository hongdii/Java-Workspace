package com.kh.operator;

public class C_Compound {
	
	/*
	 * 복합대입연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * += -= *= /= %=
	 * 
	 * a = a + 3; -> a += 3;
	 * 기존의 a값에 3을 더해 a에 다시 대입해주겠다 라는 뜻.
	 */
	
	public void method() {
		int num = 12;
		
		System.out.println("현재 num : "+num);
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3 증가시킨 num : "+num); // 15
		
		// num을 3 또 증가시키기
		num += 3;
		System.out.println("또 3 증가시킨 num : "+num); // 18
		
		num -= 5;
		// num을 5 감소시키기
		System.out.println("5 감소시킨 num : "+num);
		
		num *= 6;
		// num을 6배 증가시키기
		System.out.println("6배 증가시킨 num : "+num);
		
		num /= 2;
		// num을 2배 감소시키기
		System.out.println("2배 감소시킨 num : "+num);
		
		num %= 4;
		// num을 4배로 나눴을때 나머지값을 num에 대입
		System.out.println("최종 num : "+num);
		
		// += 의 경우 문자열 집합도 가능하다.
		String str = "Hello";
		
		// str + str + "World"
		str += "World";
		
		System.out.println(str);
	}
	
}
