package com.kh.practice;

import java.util.*;

public class MusicController {
	
	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		int result = 0;
		
		try {
			list.add(music);
			result = 1;
		}catch(Exception e) {
			result = 0;
		}
		return result;
	}
	
	public int addAtZero(Music music) {
		int result = 0;
		
		try {
			list.add(0, music);	// 인덱스 타입 제시하여 원하는 위치에 곡추가
			result = 1;
		} catch(Exception e){
			result = 0;
		}
		return result;
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		Music m = null;
		
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		return m;
	}
	
	public Music removeMusic(String title) {
		Music m = null;
		
		// 향상된 for문은 삭제하거나 삽입시 사용불가
		for(int i=0 ; i<list.size() ; i++) {
			if(list.get(i).getTitle().equals(title)) {
				//삭제해야할 Music객체
				m = list.remove(i); // 삭제시킨 Music 객체를 Music객체 m에 대입.
				break;
			}
		}		
		return m;
	}
	
	public Music setMusic(String title, Music music){
		Music m = null;
		
		for(int i=0 ; i<list.size() ; i++) {
			if(list.get(i).getTitle().equals(title)) {
				m = list.set(i, music);
			}
		}
		return m;
	}
	
	public int ascTitle(){
		Collections.sort(list); 
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list, new AscTitle());
		return 1;
	}
}
