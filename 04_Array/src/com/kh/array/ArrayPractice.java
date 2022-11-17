package com.kh.array;

import java.util.Scanner;

public class ArrayPractice {
   
   public void practice1() {
      int[] arr = new int[10];
            
      for(int i=0 ; i<10 ; i++) {
         arr[i] = i+1;
         System.out.print(arr[i]+" ");
      }
   }
   
   public void practice2() {
      int[] arr = new int[10];
      int i = 0;
      
      //for(int i=0; i<10 ; i++) { // 0 1 2 3 4 5 6 7 8 9
         for(int j=10 ; j>0 ; j--) { // 10 9 8 7 6 5 4 3 2 1
            arr[i] = j;
            System.out.print(arr[i]+" ");
            i++;
         }
      //}
      
   }
   
   public void practice3() {
      Scanner sc = new Scanner(System.in);
      System.out.print("양의 정수 : ");
      int size = sc.nextInt();
      
      int[] arr = new int[size];
      
      for(int i=0 ; i<size ; i++) {
         arr[i] = i+1;
         System.out.print(arr[i]+" ");
      }
   }
   
   public void practice4() {
      String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
      
      System.out.println(arr[1]);
   }
   
   public void practice5() {   // 복습 필수
      Scanner sc = new Scanner(System.in);
      
      System.out.print("문자열 : ");
      String str = sc.nextLine();
      
      char[] arr = new char[str.length()];   // String형 배열말고 char형 배열로 선언.
      
      for(int i=0 ; i < str.length() ; i++) {
         arr[i] = str.charAt(i);
      }
      
      System.out.print("문자 : ");
      char search = sc.nextLine().charAt(0);
      
      int count = 0;
      
      System.out.printf("%s에 %c가 존재하는 위치(인덱스) : " , str, search);
      
      // equals() 메서드는 char형 변수를 인자로 받지 못함.
      for(int i=0 ; i < arr.length ; i++) {
         if(arr[i] == search) {
            System.out.print(i+" ");
            count++;
         }
      }
      System.out.println();
      System.out.printf("%c 개수 : %d", search, count);
   }
   
   public void practice6() {
      Scanner sc = new Scanner(System.in);
      String[] str = {"월", "화", "수", "목", "금", "토", "일"};
      
      System.out.print("0 ~ 6 사이 숫자 입력 : ");
      int num = sc.nextInt();
      
      if(num<0 || num>6) {
         System.out.println("잘못 입력하셨습니다.");
      } else {
         System.out.print(str[num]+"요일");
      }
   }
   
   public void practice7() {   
      Scanner sc = new Scanner(System.in);
      System.out.print("정수 : ");
      int num = sc.nextInt();
      int[] arr = new int[num];
      int sum = 0;
      
      for(int i=0 ; i<num ; i++) {
         System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
         arr[i] = sc.nextInt();
         sum+=arr[i];
      }
      
      for(int i=0 ; i<num ; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      System.out.println("총 합 : "+sum);
   }
   
   public void practice8() {   // 복습 필수
      Scanner sc = new Scanner(System.in);
      System.out.print("정수 : ");
      int num = sc.nextInt();	// 5
      int[] arr = new int[num];
      
      if(num%2==0 || num<3) {
         System.out.println("다시 입력하세요.");
         practice8();
      } else {		// i<=2
         for(int i=0 ; i<=num/2 ; i++) {
            arr[i]=i+1;
            System.out.print(arr[i]+", ");
            }
         }
         for(int i=num/2 ; i>0 ; i--) {
            arr[i] = i;
            if(i == 1) {
               System.out.print(arr[i]);
            } else {
               System.out.print(arr[i]+", ");
            }
         }
      }
   
   public void practice9() {
      Scanner sc = new Scanner(System.in);
      System.out.print("치킨 이름을 입력하세요 : ");
      String str = sc.nextLine();
      
      String[] arr = {"양념", "후라이드"};
      boolean bool = false;
      
      for(int i=0 ; i< arr.length ; i++) {
         if(arr[i].equals(str)) {
            bool = true;
            break;
         } else {
            bool = false;
         }
      }
      
      if(bool == true) {
         System.out.printf("%s치킨 배달 가능", str);
      } else {
         System.out.printf("%s치킨은 없는 메뉴입니다", str);
      }
   }
}