package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for (int i = 1 ; i <= num ; i++) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice1();
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for (int i=num ; 0 < i && i <= num ; i--) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice2();
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1 ; i<=num ; i++) {
			if(i==num) {
				System.out.print(i);
			} else {
				System.out.print(i+" + ");
			}
			sum+=i;
		}
		System.out.print(" = "+sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1<num2) {
				for (int i = 1 ; num1 <= num2 ; num1++) {
					System.out.print(num1+" ");
				}
			} else {
				for (int i = 1 ; num2 <= num1 ; num2++) {
					System.out.print(num2+" ");
				}
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice4();
		}
	}
	
	public void practice5() {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
		} else {
			for(int i=1 ; num<10 ; num++) {
				System.out.printf("=========== %d단 ==========\n", num);
				for(int j=1 ; j<10 ; j++) {
					System.out.printf("%d X %d = %d\n", num, j, (num*j));
				}
				System.out.println();
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i=1 ; i<=10 ; i++) {
		
			System.out.print(num+" ");
			num+=gong;
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++) {
			for(int j=num ; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() { //혼자서 하다가 막힘. 집가서 복습
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i<num ; i++) { // 입력한 만큼 for문 반복
			for(int j=1 ; j<num-i ; j++) { // 3 2 1 0 만큼 공백 출력, 공백이외 공간에는 *출력
				System.out.print(" ");
			}
			for(int j=1 ; j<2+i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {	//혼자서 하다가 막힘. 집가서 복습
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i<num ; i++) { // 입력한 만큼 for문 반복
			
			for(int j= 0; j<i ; j++) { 
				System.out.print(" ");
			}
			for(int j=0 ; j<num-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public void practice12() {	// 복습하기
		//   *		공백3 별1
		//  *** 	공백2 별3
		// ***** 	공백1 별5
		//******* 	공백x 별7
		
		// 따라서 4를 입력했을때 공백은 num-1기준으로 1씩감소
		// 별은 공백찍히고 2씩 상승
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i<num ; i++) { // 0 1 2 3
			
			for(int j=0 ; j< num - (1+i) ; j++) { // 3 2 1 0
				System.out.print(" ");
			}
			for(int j=0 ; j< 1 + 2*i ; j++) { // 1 3(1+2*1) 5(1+2*2) 7(1+2*3)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();//9
		
		// 소수 : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수
		if(num<2) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			boolean isPrime = true;
			for(int i=2 ; i<num ; i++) {// 2~8
				if(num% i == 0) {
					isPrime= false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}
			
			
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		int count = 0;
		for(int i=2 ; i<=num ; i++) {
			boolean isPrime = true;
			//i값이 소수인지 아닌지 검사함.
			// i값이 소수라면 출력하고 값을 1 증가시킴.
			for(int j=2 ; j<i ; j++) {
				if(i%j == 0) {
					isPrime = false;
				}
			}
			if(isPrime == true) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.", num, count);
	}
	
	public void practice15() {
		
	}
	
	// 어려울 경우 출력된걸 한줄씩 코딩해보고 규칙을 찾아 전체 코드 만들기
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i<num ; i++) { // 0 1 2 3
			
			for(int j=0 ; j< num - (1+i) ; j++) { // 3 2 1 0
				System.out.print(" ");
			}
			for(int j=0 ; j< 1 + 2*i ; j++) { // 1 3(1+2*1) 5(1+2*2) 7(1+2*3)
				System.out.print("*");
			}
			System.out.println();
		}
		// 3 2
		// 4 3
		// 5 4
		for(int i=0 ; i<num ; i++) { 
			
			for(int j=0 ; j< 1+i ; j++) { 
				System.out.print(" ");
			}
			for(int j=0 ; j < (num-i)*2 -3 ; j++) { 
				// 1+2*(num-2-i) ->1 ->0
				// 1 + 2num -4 -2i -> 2(num-i) -3
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}