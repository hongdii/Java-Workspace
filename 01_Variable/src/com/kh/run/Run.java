package com.kh.run;
import com.kh.variable.*; // * : 모든 클래스 가져옴

public class Run {
	
	public static void main(String[] args) {
		A_Variable av = new A_Variable();
		//av.printVariable();
		//av.declareVariable();
		//av.initVariable();
		//av.constantVariable();
		
		B_keyboardInput bk = new B_keyboardInput();
		//bk.inputTest1();
		//bk.inputTest2();
		
		C_Cast cc = new C_Cast();
		//cc.autoCasting();
		//cc.forceCasting();
		
		D_Printf dp = new D_Printf();
		dp.printFtest();
	
	
	}
}
