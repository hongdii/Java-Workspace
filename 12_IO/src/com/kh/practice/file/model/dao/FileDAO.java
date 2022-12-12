package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		return new File(file).isFile(); // isFile() 반환값으로 불린 값 반환.
		// true -> 파일있음	false -> 파일없음
	}
	
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		
		// 보조가 문자기반이니까 기반도 문자기반이어야함
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)); ) {
			// String에 써서 저장
			bw.write(s);
			bw.flush(); // 추가해서 떠도는 문자열 없게끔해주기
//			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	
	public StringBuilder fileOpen(String file) {
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		StringBuilder sb = new StringBuilder();
		try( BufferedReader br = new BufferedReader(new FileReader(file)); ){
			
			String value = null;
			while( (value = br.readLine()) != null ) {
				sb.append(value+"\n");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고
		// String에 써서 저장하되 이어서 저장될 수 있도록 함
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)); ) {
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
