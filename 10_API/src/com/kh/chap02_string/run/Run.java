package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.*;

public class Run {

	public static void main(String[] args) {
		A_StringPoolTest ast = new A_StringPoolTest();	// 객체 생성
		//ast.method3();

		B_StringMethodTest bsmt = new B_StringMethodTest();
		//bsmt.method();
		
		C_StringTokenizerTest cstt = new C_StringTokenizerTest();
		//cstt.method();
		
		D_StringBufferAndBuilder dsbab = new D_StringBufferAndBuilder();
		dsbab.method();
	}

}
