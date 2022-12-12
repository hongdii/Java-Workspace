package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibaryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		Book[] books = new Book[5];
		int index = 0;
		for(Book bk : bList) {
			if(bk.getTitle().contains(keyword)) {//포함의 개념 contains
				books[index++] = bk;
			}
		}
		return books;//null null null null null
	}

	public int rentBook(int index) {
		int result = 0;
		Book bk = bList[index];
		
		if(bk instanceof AniBook) {
			if(mem.getAge() < ((AniBook) bk).getAccessAge()) {
				result = 1;
			}
		}else {
			if(((CookBook)bk ).isCoupon()) {
				int couponCount = mem.getCouponCount();
				mem.setCouponCount( mem.getCouponCount()+1 );
				result = 2;
			}
		}
		return result;
//		result를 0으로 초기화 한 후 전달받
//		은 인덱스의 도서가 만화책인 경우
//		회원의 나이와 해당 만화책의 제한
//		나이를 비교하여 회원 나이가 더 적
//		은 경우 result를 1로 초기화
//		아니면 전달받은 인덱스의 도서가 요
//		리책인 경우 해당 요리책의 쿠폰 유
//		무가 유일 경우 회원의 couponCount
//		를 1증가 시킨 후 result 2로 초기화
//		→ result 리
	}
}
