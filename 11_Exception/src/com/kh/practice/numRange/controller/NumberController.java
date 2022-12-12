package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		boolean result = false;
		if(0<num1 && num1<101 && 0<num2 && num2<101) {
			if(num1%num2==0) {
				result = true;
			} else {
				result = false;
			}	
		}
		return result;
	}
}
