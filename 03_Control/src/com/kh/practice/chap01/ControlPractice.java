package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		String result = "";
	
		switch (menu) {
		case 1 :
			result = "입력";
			break;
		case 2 :
			result = "수정";
			break;
		case 3 :
			result = "조회";
			break;
		case 4 :
			result = "삭제";
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			return;
		}
		
		System.out.printf("%s 메뉴입니다.", result);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 ==0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int a = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int b = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int c = sc.nextInt();
		
		int sum = (a+b+c);
		double avg = sum/3;
		
		if (a>=40 && b>=40 && c>=40 && avg >= 60) {
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d "
					+ "\n합계 : %d \n평균 : %s \n축하합니다, 합격입니다!", a, b, c, sum, avg);
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	// 4.제어문.pdf 8p에 예시있음
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		
		switch (month) {
		case 1 :
		case 2 :
		case 12 :
			season = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			season = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			season = "여름";
			break;
		case 9 :
		case 10 :
		case 11 :
			season = "가을";
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
			return;
		}
		System.out.printf("%d월은 %s입니다.",month ,season);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		if (id.equals("oh")) {
			if (password.equals("oh")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			if (password.equals("oh")) {
				System.out.println("아이디가 틀렸습니다.");
			} else {
				System.out.println("아이디와 비밀번호 둘다 틀렸습니다.");
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		if (grade.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else {
			System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi <25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); //nextInt() 다음에 nextLine() 사용할때 무조건 써줘야 에러 안남.
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		
			switch (op) { // 15 / 4 = 3.750000
			case '+' : // 문자는 '' 기호임.
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1+num2));
				break;
			case '-' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1-num2));
				break;
			case '*' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1*num2));
				break;
			case '/' :
				System.out.printf("%d %c %d = %f", num1, op, num2, (num1/(double)num2));
				// 나눈 몫은 실수형으로 표시
				break;
			case '%' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1%num2));
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int a = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int b = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int c = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int d = sc.nextInt();
		
		System.out.println("=========== 결과 ===========");
		
		// 중간고사*0.2, 기말고사*0.3, 과제*0.3, 출석*0.2 => 모두 더하면 총점
		
//		double total;
//		if (total >= 70) {
//			System.out.println();
//		} else {
//			System.out.println("FAIL");
//		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("비밀번호 입력(1000~9999) : "); // 4자리 맞추기위해 숫자 범위를 1000~9999로 함
 		int pwd = sc.nextInt();
		
		if(pwd > 999 && pwd < 9999) { // 자리수 체크, 999보다 크고 9999보다 작은 숫자는 네자리 숫자밖에 없음
			int first = pwd % 10; // 일의 자릿수 구하기
			int second = (pwd / 10) % 10; // 십의 자릿수 구하기
			int third = (pwd / 100) % 10; // 백의 자릿수 구하기
			int forth = (pwd / 1000) % 10; // 천의 자릿수 구하기
			
			// 중복값이 있는지 처리하기
			if (first != second && first != third && first != forth && second != third &&
					second != forth && third != forth) {
				// 성공
				System.out.println("생성 성공");
			} else {
				// 실패
				System.out.println("중복 값 있음");
			}
			
		} else {	// 자리수가 3자리 이하거나, 5자리 이상인 경우
					// 자리수 안 맞으면 출력
			System.out.println("자리수 안맞음");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
