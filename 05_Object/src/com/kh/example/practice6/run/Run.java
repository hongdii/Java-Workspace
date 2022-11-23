package com.kh.example.practice6.run;
import com.kh.example.practice6.modle.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
//		setTitle.title = "용의자x의 헌신";
//		b1.pulbisher = "몰라"
//		b1.author = "히가시노게이고"
		b1.inform();
		
		Book b2 = new Book("자바의 정석", "나무", "오현지");
		b2.inform(); 	// title, publisher, author
		
		Book b3 = new Book("자바의 정석", "나무", "오현지", 15000, 0.0);
		b3.inform();
	}
}
