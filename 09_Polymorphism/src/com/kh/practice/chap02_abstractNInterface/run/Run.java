package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
//		PhoneController pc = new PhoneController();
//		pc.method();
		String[] arr = new PhoneController().method();
		for(String result : arr) {
			System.out.println(result);
		}
		
		int a=0;
		int b=5;
		
		if(((Integer) a).equals(b)) {
			
		}
	}
}
