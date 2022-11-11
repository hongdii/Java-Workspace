package com.kh.practice2.func;

public class CastingPractice3 {
	
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2);
		System.out.println((int)dNum);
		
		System.out.println(iNum2*dNum);
		System.out.println((double)iNum1);
		
		System.out.println(iNum1/(double)iNum2); // 둘중 하나만 형변환해주면됨
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		System.out.println(iNum1/fNum); // fNum이 float형이라서 연산시 자동으로 float형으로 변환됨 
		System.out.println((double)iNum1/fNum); // 연산전 형변환 시켜야함
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch+iNum1);
		System.out.println((char)(ch+iNum1));
	}
}
