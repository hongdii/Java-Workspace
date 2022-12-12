package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

public class Run {

	/*
	 * 프로세스
	 * - 현재 동작(실행)하고 있는 프로그램
	 * 
	 * 스레드
	 * - 한개의 프로세스(process)내에서 실제로 작업을 수행하는 소단위
	 * - 모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행함(일꾼)
	 * 
	 * 멀티스레드
	 * - 한 개의 프로그램을 실행하고 그 내부적으로 여러 작업(스레드)를 처리하는 것
	 * - 멀티스레드의 장점
	 * 1) 자원을 효율적으로 사용할 수 있다.
	 * 2) 사용자 입장에서 일처리가 빠르게 보인다.
	 * 3) 작업이 분리되어 코드가 간결해진다.
	 * 
	 * ex)
	 * - 청소(나, 1시간), 빨래(세탁기, 2시간), 설거지(나, 30분), 화장실 청소(나, 30분)
	 * 나: 메인스레드, 세탁기 : 서브스레드
	 * - 무조건 주체가 되는 중심이되는 스레드가 메인 스레드. == 자바의 메인 메서드
	 * - 추가로 필요한 스레드 == 서브스레드 -> main메서드에서 생성해서 실행한다.
	 * - (서브스레드 예시) : 비행기 게임, 좀보이드
	 */
	
	// 모든 자바 어플리케이션은 Main Thread가 main메서드를 실행하면서 시작된다. => 에러코드에서도 확인 가능
	// 메인 메서드가 main thread임
	public static void main(String[] args) {	
		// 메인메서드만 있다면 -> 싱글스레드
		// 항상! 앞 라인의 명령문이 다 끝난 후에 실행이 되었음.
		for(int i=0 ; i<= 100 ; i++) {
			System.out.println("작업 1 ["+i+"]");
		}
		
//		for(int i=0 ; i<= 100 ; i++) {
//			System.out.println("작업 2 ["+i+"]");
//		}
		// 현재 작업으로 멀티스레드 환경을 만들려면 필요한 스레드의 개수 -> 1
		// 웬만하면 하나의 자바파일에 하나의 클래스 생성
		
		//스레드 생성 방법 : 1. Thread클래스를 직접 상속받기
		Thread1 th1 = new Thread1();
		
		// 스레드 이름 지정
		th1.setName("스레드 1");
		
		// 스레드 시작
		th1.start();
		
		// 스레드 생성방법 : 2. Runnable 인터페이스를 구현하기.
		//Thread 객체 생성 후 생성자에 Runnable인터페이스를 구현한 객체(Thread2)를 매개값으로 전달한 후 
		//start() 메소드 호출
		Thread th2 = new Thread(new Thread2());
		
		th2.setName("스레드2");
		
		th2.start(); // start()를 사용해야 스레드가 생성됨.
		
		// 스레드 생성방법 3 : 1회용 스레드가 필요할때 (익명클래스)
		// 굳이 클래스만들 필요 없이 1회용으로만 만들고자할때 사용.
		Thread th3 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=100 ; i++) {
					System.out.println(getName()+"["+i+"]");
				}
			}
		};	// 익명클래스 만들때는 중괄호 끝에 ;(세미콜론) 작성
		th3.start();
		// bin 패키지안에 $표시run으로 실행됨
		
		System.out.println("메인스레드 종료!");
		// 메인스레드가 종료되더라도 실행중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
		// 매번 결과가 다르게 보일것 => 스케쥴에 따라 순차적으로 번갈아가며 작업이 수행되기 때문
		
	}
}
