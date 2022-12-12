package com.kh.chap01_beforeVsafter.after.model.vo;

public class SmartPhone extends Product {
	private String mobileAgency;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);		// 첫 줄에 기술해줘야함.
		this.mobileAgency = mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {	// 부모 클래스 메소드 오버라이딩. 반환형 매개변수갯수 메소드명 등 동일해야함.
		return super.information()+", mobileAgency : "+mobileAgency;
	}
}
