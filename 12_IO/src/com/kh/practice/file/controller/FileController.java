package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		// 매개변수로 넘어온 sb를 String으로 바꿔 
		fd.fileSave(file, sb.toString());	// StringBuilder변수 String형으로 바꾸려면 toString()메서드 사용.
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		// 매개변수로 넘어온 sb를 String으로 바꿔
		fd.fileEdit(file, sb.toString());
	}
}
