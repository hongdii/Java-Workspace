package com.kh.example.practice5.model.run;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {
	public static void main(String[] args) {
		new Lotto().information(); // 생성자만 호출해도 에러 안남.
									// Lotto클래스에서 사용할 메서드가 별로 없을경우
									// 이처럼 생성자만 호출하여 사용.
		
	}
}
