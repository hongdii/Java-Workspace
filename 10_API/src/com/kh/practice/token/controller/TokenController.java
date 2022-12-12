package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		// 방법1. 내가푼 방법
//		String tstn = "";
//		while(stn.hasMoreTokens()) {	// 다음 토큰이 있으면 true, 없으면 false
//			tstn += stn.nextToken();
//		}
//		return tstn; 
		
		// 방법2. StringBuffer or StringBuilder를 이용	// 메모리 효율을 위한 방법
		StringBuilder sb = new StringBuilder();
		
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		return sb.toString();
	}
	
	public String firstCap(String input) {
		String first = input.substring(0, 1).toUpperCase();
		String other = input.substring(1);
		return first+other;
	}
	
	public int findChar(String input, char one) {
		char[] arr = input.toCharArray();
		int count = 0;
		for(char a : arr) {
			if(a == one) {
				count++;
			}
		}
//		// 방법2. charAt 활용
//		for(int i=0 ; i<input.length() ; i++) {
//			if(input.charAt(i) == one) {	// apple -> {'a', 'p', 'p', 'l', 'e'}
//				count++;
//			}
//		}
		return count;
	}
}
