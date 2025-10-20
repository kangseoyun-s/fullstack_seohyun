package com.company.java016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JavaIO003 {
	public static void main(String[] args) {
		// 1. 경로
		String folder_rel = "src/com/company/java016_ex/"; // 상대 경로(현재 작업 폴더 기준)
		String file_path = "io003.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_path);
		// 2. 폴더 + 파일 만들기
		try {if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) {file.createNewFile();}
		System.out.println("1) 폴더/파일 만들기");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. char 쓰기 Reader → [프로그램] → Writer★
		try {
			Writer writer = new FileWriter(file);
			writer.write("hello "); // 버퍼에 저장
			writer.write("java"); // 버퍼에 저장
			writer.flush(); // 버퍼(임시 저장 공간)에 저장된 데이터를 강제로 출력스트림으로 밀어내기 
			                // 버퍼에 있는 내용을 즉시 파일에 쓰기
			writer.close(); // 스트림 닫기
			System.out.println("Writer 쓰기 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 4. char 읽기 Reader★ → [프로그램] → Writer
		try {
			Reader reader = new FileReader(file);
			int cnt=0;
			while((cnt=reader.read())!=-1) {
				System.out.print((char)cnt);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
