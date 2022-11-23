package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {	// 복습하기
	private int[] lotto = new int[6];
	
	// 초기화 블럭 이용해서 난수로 int배열 lotto 초기화
	{	
		// length는 필드임. String의 length와 배열에서 사용하는 length는 다른 것
		for(int i=0 ; i<lotto.length ; i++) {	// 0 1 2 3 4 5
			// 0.0 <= x < 1.0
			// 0.0 <= x < 45.0
			// 1 <= x <= 45
			int random = (int)(Math.random()*45+1);	// 1~45까지의 난수 랜덤 생성
			lotto[i] = random;
			
			for(int j=0 ; j<i ; j++) {
				if(lotto[j] == random) {
					i--;
					break;
				}
			}	
		}
	}
	
	public Lotto() {
		super();
	}
	
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public int[] getLotto() {
		return lotto;
	}
	
	public void information() {		// 반환형이 void이니까 출력문을 information안에서 작성
		System.out.println(Arrays.toString(lotto));
	}
}
