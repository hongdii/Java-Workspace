package com.kh.chap01_thread.thread;

// 스레드 생성방법
/*
 * 1. 직접적으로 Thread클래스를 상속받는 방법
 * 	- Thread 클래스 상속 후에 run()메소드 오버라이딩
 * 	- Thread1 객체를 생성 후 start()메서드를 호출
 * 
 */

public class Thread1 extends Thread{
	/*
	 * 스레드 실행시 Run메서드 호출됨.
	 * 따라서 작업하고자 하는 코드를 반드시 RUN메서드안에 재정의 해줘야한다.
	 * 즉, Thread클래스 안에 있는 run메서드를 재정의 해줘야한다.
	 */
	@Override
	public void run() {
		// 내가 작업할 코드를 작성
		for(int i=0 ; i<=100 ; i++) {
			System.out.println(/*this.*/getName() + "["+i+"]"); 
			// getName()메서드 사용시 this키워드 생략 가능. getName()은 Thread에만 구현되어있기때문.
			// getName() : 스레드의 이름 반환, 순차적으로 Thread-0, Thread-1, 2... 이름이 붙는다.
			
			// 스레드를 상속받으면 implements Runnable할때와 달리 'Thread.currentThread().getName()'를 사용하지 않고,
			// getName()메서드를 바로 사용할 수 있다.
		}
	}
}
