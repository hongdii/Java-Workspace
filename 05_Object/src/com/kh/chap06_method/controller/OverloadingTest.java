package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * - 한 클래스 내에 "같은" 메소드명으로 정의할 수 있는 방법
	 * - 매개변수의 자료형의 갯수, 순서가 다르게 작성하면 된다.
	 * - 단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 "전혀" 영향을 주지 않는다.
	 * 
	 */
	// 메소드 오버로딩이 무엇인가, 메소드 오버로딩 에러찾기 등 메소드 오버로딩 문제 무조건 1개나옴.
	// 어떤 라인에 오류가 발생하는지 알아놓으면 좋음
	
	public void test() {
		
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	// 에러 발생
	// - 매개변수명과는 상관없이 자료형의 갯수와 순서가 같아서 에러가 발생함.
	// - 즉, 매개변수의 자료형의 개수나 순서가 다르게 작성되어야한다.
//	public void test(int c, int d) {
//		
//	}
	
	public void test(int a, int b, String s) {
		
	}
	
	/*
	 * 에러 발생
	 * - 반환형이 다르다고 오버로딩이 적용되지 않음.
	 * - 메소드를 호출하는 시점에 매개변수가 동일하기 때문에 에러가 발생한다.
	 * - 즉, 반환형과 상관없이 매개변수의 자료형의 개수와 순서가 다르게 작성되어야한다.
	 */
//	public int test(int a, int b, String s) {
//		return a+b;
//	}
	
	/*
	 * 에러 발생
	 * - 접근 제한자가 다르다고 오버로딩이 적용되지 않습니다.
	 * - 즉, 접근제한자와 상관없이 매개변수의 자료형의 개수와 순서가 다르게 작성되어야한다.
	 */
//	private public void test(int a, int b, String s) {
//		
//	}
	
}