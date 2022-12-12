package com.kh.practice;

import java.util.Scanner;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******\n1. 마지막 위치에 곡 추가\n2. 첫 위치에 곡 추가\n3. 전체 곡 목록 출력\n"
					+ "4. 특정 곡 검색\n5. 특정 곡 삭제\n6. 특정 곡 정보 수정\n7. 곡명 오름차순 정렬\n8. 가수명 내림차순 정렬\n9.종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못 입력. 프로그램 재실행.");
				mainMenu();
				return;
			}
		}
		
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		int result = mc.addList(new Music(title, singer));
		
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		if(result > 0) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();

		int result = mc.addAtZero(new Music(title, singer));
		
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		if(result > 0) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String search = sc.nextLine();
		
		Music m = mc.searchMusic(search);
		
		if(m==null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println("검색한 곡은 "+m+" 입니다.");
//			System.out.println("검색한 곡은 "+m.getTitle()+", "+m.getSinger()+"입니다." );
		}
		
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String delete = sc.nextLine();

		Music m = mc.removeMusic(delete);
		
		if(m==null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.print(m+"(을)를 삭제 했습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String search = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String updateT = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String updateS = sc.nextLine();
		
		
		Music m = mc.setMusic(search, new Music(updateT, updateS));
		
		if(m == null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(m.getTitle()+m.getSinger()+"가 값이 변경되었습니다");	
		}
	}
	
	public void ascTitle() {	// asc : 오름차순
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.ascTitle();
		
		if(result > 0) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
	
	public void descSinger() {	// desc : 내림차순
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int result = mc.descSinger();
		
		if(result > 0) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
}
