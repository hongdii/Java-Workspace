package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * => 기본 자료형을 객체로 포장해주는 클래스들을 레퍼클래스라고 함.
		 * 
		 * 기본자료형 		<---->		Wrapper 클래스
		 * boolean					Boolean
		 * char						Character
		 * byte						Byte
		 * short					Short
		 * int						Integer
		 * long						Long
		 * float					Float
		 * double					Double
		 */
			
//		String name = "";
//		name.charAt(0);
//		
//		int number = 5;
//		//number.	// int는 자료형이기때문에 당연히 메서드없음
//		Integer number2 = 50;
//		number2.equals(50);	// 객체로 number2를 생성하여 메서드 사용 가능
		
		//==========================================
		
		int num1 = 10;
		int num2 = 15;
		
		// 일반 기본 자료형에서 객체 자료형의 메소드를 활용하고 싶을때 ----> Wrapper 클래스로 변환하여 사용
		// 자동 형변환이 일어남
		// 기본자료형 => Wrapper 자료형 (Boxing)
		// 기본자료형이 Wrapper 자료형으로 자동형변환됨 == 박싱
		Integer i1 = num1;
		Integer i2 = num2;
		
//		System.out.println(num1.equals(num2));
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.compareTo(i1)); 	// 중요. 활용하여 정렬의 기준을 세울 수 있음!
		// a.compareTo(b) : a와 b를 비교해서 a가 b보다 크면 1, a가 b보다 작으면 -1, a와 b가 같으면 0을 리턴
		
		// 매개변수로 compareTo()넣거나 오버라이딩해서 compareTo를 기준삼아 정렬 가능
		// 배열.sort()
		// 컬렉션.sort()
		
		// Wrapper 자료형 => 기본 자료형 (UnBoxing)
		int num3 = i1;	// 자동형변환 이루어짐
		int num4 = i2;
		
		// 기본 자료형 <---> String
		String str1 = "10";	// 10
		String str2 = "15.3";	// 15.3
		
		System.out.println(str1 + str2);
		
		// 1. String --> 기본자료형 : 파싱한다.
		//		바꿀자료형Wrapper클래스.parseXXX(변환할 문자열)
		int i = Integer.parseInt(str1);	// "10" -> 10
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		// 2. 기본자료형 --> String
		//		10		-->	"10"
		//		15.3	==>	"15.3"
		// 	String.valueOf(반환할 기본 자료형 값) : String
		String strI = String.valueOf(i);	// 10 => "10"
		String strI2 = i+"";	// 가장 많이 사용되는 문장.
		String strI3 = Integer.valueOf(i).toString();
		
		String strD = String.valueOf(d); // 15.3 => "15.3"
		
		System.out.println(strI+" "+strI2+" "+strD);
		
	}

}
