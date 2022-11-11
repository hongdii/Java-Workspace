package com.kh.name.run;

import com.kh.name.Myname; //com.kh.name는 패키지, Myname은 클래스, URL의 역순으로 짜도록 권장

public class Run {

	public static void main(String[] args) {
		
		// = : 대입연산자, 왼쪽에서 오른쪽으로 대입
		Myname mn = new Myname(); // 클래스를 다른 클래스에서 가져오는 문장
		
		mn.callMyName();
		
	}
}
