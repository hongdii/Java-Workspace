package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		String str = "Java,Oracle,JDBC,HTML,CSS,JavaScript,Server";
		String str1 = "Java Oracle JDBC HTML CSS JavaScript Server";
		
		// 구분자를 제시해서 해당 문자열을 분리시키는 방법
		// 방법 1. 분리된 문자열들을 String[]배열에 차곡차곡 담아서 관리하는 방법
		// 		  문자열.split(구분자) : String[]
		// split : 나누다
		// 자주 사용됨
		String[] arr = str.split(",");	// 오래된 JDK버전을 사용하면 특정 구분자를 제대로 구분하지못하는 이슈있음!~
										// 오래된 JDK버전을 사용하는 회사에 들어가면 적용못할수도~
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		// 문자열 배열의 경우 for문을 다음과 같이 쓸 수 있다 : 향상된 for문
		// for( 값을 받아줄 변수 : 순차적으로 접근할 배열 ) {
		// }
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("===================================");
		
		// 방법 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을 때
		// 		java.util.StringTokenizer 클래스를 이용하는 방법
		//		StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str1, " ");
		
		System.out.println("분리된 문자열의 갯수 : "+stn.countTokens());	// 토큰개수 구하는 메서드
		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());		// 에러발생
//		System.out.println(stn.nextToken());
		
		// 담긴 모든 토큰을 불러오기위한 국룰 방법
		while(stn.hasMoreTokens()) {	// 다음 토큰이 있으면 true, 없으면 false
			System.out.println(stn.nextToken());
		}
	}
	
}
