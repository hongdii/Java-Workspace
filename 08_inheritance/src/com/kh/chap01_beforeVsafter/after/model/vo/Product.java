package com.kh.chap01_beforeVsafter.after.model.vo;

public class Product {
	/*
	 * 세 클래스 모두 공통적으로 기술되어있던 요소(필드, 메서드)들만 추출해서 정의해둔 클래스 : 부모클래스
	 */
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
//	protected String brand;
//	protected String pCode;
//	protected String pName;
//	protected int price;
	
	public Product() {
		super(); // ctrl누르고 마우스로 super메서드 누르면 Object클래스로 이동
				// Product 클래스는 Object클래스의 자식이면서 Desktop의 부모이다.
	}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode; 
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getPcode() {
		return pCode;
	}
	
	public String getPname() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "brand : "+brand+", pCode : "+pCode+", pName : "+pName+", price : "+price;
	}
}
