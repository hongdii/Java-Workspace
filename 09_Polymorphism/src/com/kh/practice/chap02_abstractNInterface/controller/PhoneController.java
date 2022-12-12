package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		int count = 0;
		
		for(Phone phone : phones) {
			if(phone instanceof V40) {
				result[count++] = ((V40) phone).printInformation();	// 명시적으로 다운캐스팅
			}else {
				result[count++] = ((GalaxyNote9) phone).printInformation();
			}
		}
		return result;
	}
}
