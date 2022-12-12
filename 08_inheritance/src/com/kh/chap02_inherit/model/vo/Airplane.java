package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	private int tire;
	private int wing;
	
	public Airplane() {
		
	}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	// getter setter 메서드 자동완성 : source - generate getters and setters
	// 단축키 : alt+shift+s
	public void setTire(int tire) {
		this.tire = tire;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}

	public int getWing() {
		return wing;
	}

	@Override	// 메타 데이터. 기능이 있는 주석
	// 자동완성 : 입력란은 다른 라인에 둔후 information에 커서를 두고 ...?
	//	오버라이드 된 메서드는 관례적으로 @Override를 해줘야함.
	public String information() {
		return super.information()+", tire : "+tire+", wing : "+wing;
	}
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 떼굴떼굴 굴리면서 날개를 피면서 움직인다.");
	}
}
