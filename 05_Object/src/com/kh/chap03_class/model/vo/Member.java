package com.kh.chap03_class.model.vo;

public class Member {
	
	private String memberId;	// - memberId : String	// - 는 접근제한자 private 의미
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// + changeName(name:String):void	// + 는 접근제한자 public 의미
	public void changeName(String name) {
		memberName = name;
	}
	
	// + printName():void
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}
	
	
}
