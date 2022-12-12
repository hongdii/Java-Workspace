package com.kh.practice.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{

	public String maker;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String printInformation() {
		return "";
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
}
