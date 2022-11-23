package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] arr = new Phone[3];		// Phone[] 참조자료형. 따라서 heap영역에 할당되어있고 3칸 모두 null값이 들어가있음
		
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		arr[0].setSeries("12");
		arr[0].setBrand("애플");
		arr[0].setPrice(1000000);
		
		arr[1] = new Phone("아이폰", "13", "애플", 1500000);	// 객체를 할당함과 동시에 초기화시킴
		arr[2] = new Phone("갤럭시", "zplip4", "삼성", 1350000);
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i].information());
			sum +=arr[i].getPrice();
		}
		
		System.out.println("총 가격 : "+sum);
		System.out.println("평균가격 : " + (sum/arr.length) + "원");
	}

}
