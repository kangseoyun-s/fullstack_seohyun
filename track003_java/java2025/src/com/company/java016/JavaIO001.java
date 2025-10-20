package com.company.java016;

import java.io.File;
import java.io.IOException;

public class JavaIO001 {

	public static void main(String[] args) throws IOException {
		// 1. 경로 체크
		String folder_abs="C:\\file\\"; // 절대 경로(시스템의 폴더 기준-전체 경로 C:\)
		String folder_rel="src/com/company/java016_ex/"; // 상대 경로(현재 작업 폴더 기준)
		String file_path="io001.txt";
		
		// 2. 폴더 + 파일 준비
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_path);
		// 폴더가 없다면          폴더 만들기
		try{if(!folder.exists()) {folder.mkdirs();}
		if(!file.exists()) {file.createNewFile();}
		}catch (Exception e) {e.printStackTrace();}
		System.out.println("폴더/파일 준비 완료");
	}

}
