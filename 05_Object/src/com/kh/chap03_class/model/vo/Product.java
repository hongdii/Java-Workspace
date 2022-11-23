package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public, default
	// public으로 해야 다른패키지에서 접근가능
	// default로 설정한 경우 같은 패키지에서만 접근 가능. / 다른 패키지에서 접근 불가
	
	// 상품명, 상품가격, 브랜드
	private String pname;
	private int price;
	private String brand = "애플";
	
	//setter 메서드 3개
	public void setpName(String pname) {
		this.pname = pname;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter 메서드 3개
	public String getpName(String pname) {
		return pname;
	}
	
	public int getPrice(int price) {
		return price;
	}
	
	public String getBrand(String brand) {
		return brand;
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 반환해주는 information메서드
	public String information() {
		return "상품명 "+pname+"의 가격은 "+price+"원이고 브랜드는 "+brand+"입니다.";
	}
}
