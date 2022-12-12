package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	// 코딩테스트뿐아니라 실무에서 많이 사용
	// 문자열과 관련된 메소드
	public void method() {
		
		String str1 = "Hello World"; // 01234 5 678910
		
		// 1. 문자열.charAt(int index) : char
		// 	  문자열에서 전달받은 index의 위치에 있는 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : "+ch);
		
		// 2. 문자열.concat(String str) : String
		//	  문자열과 전달된 또다른 문자열을 하나로 합쳐서 리턴
		// 자바스크립트에서도 사용
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		
//		String b = new StringBuilder().append(Hello World!!!).toString();
		
		// 3. 문자열.length() : int
		//	  문자열의 길이 반환
		System.out.println("str1의 길이 : "+str1.length());
		
		// 4. 문자열.substring(int beginIndex) : String
		//		=> 문자열의 beginIndex위치에서 부터 끝까지의 문자열을 추출해서 리턴
		
		//	문자열.substring(int beginIndex, int endIndex) : String
		//	=> 문자열의 beginIndex위치에서 부터 endIndex -1 까지의 문자열을 추출해서 리턴
		// 자바스크립트나 디비에서도 자주 사용하는 메서드
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 5)); // 0 <= 인덱스범위 < 5
		
		// 5. 문자열.replace(char old, char new) : String
		// 	  => 현재 문자열에서 old 문자를 new 문자로 대체(replace)하고 변환한 문자열 리턴
		String str3 = str1.replace('l', 'a');
		System.out.println("str3 : " + str3);
		// str1 = str1.replace('1', 'a'); => str1값 자체를 바꾸기위해 메서드사용후 대입
		// str1.replace('1', 'a'); 만 해주면 원본값이 바뀌지않음!
		
		// 6. 문자열.trim() : String
		//	  -> 문자열의 앞 뒤 공백을 제거한 문자열 리턴
		String str4 = "                      J A V A                ";
		System.out.println("trim() : " +str4.trim()); 	// 해당 문자열 앞뒤 공백만 제거하고 문자열 사이의 공백은 제거되지않음
		
		// 7. 문자열.toUpperCase() : String
		//	  => 문자열을 모두 다 대문자로 변경후 문자열 리턴(영문자)
		//	  문자열.toLowerCase() : String
		// 	  => 문자열을 모두 다 소문자로 변경후 문자열 리턴
		// 로그인(아이디 체크)에서 자주 사용되는 메서드
		System.out.println("upper : "+str1.toUpperCase());
		System.out.println("lower : "+str1.toLowerCase());
		
		// 8. 문자열.toCharArray() : char[]
		//	  => 문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 9. static valueOf(char[] data) : String
		System.out.println( String.valueOf(arr) );
		System.out.println( String.valueOf(1111111111111.3141) );
	}
}
