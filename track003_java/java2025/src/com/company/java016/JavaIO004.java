package com.company.java016;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIO004 {

	public static void main(String[] args) throws IOException {
		// 1. 경로
		String origin ="src/com/company/java016_ex/cat.jpg";
		String target1="src/com/company/java016_ex/cat1.jpg";
		String target2="src/com/company/java016_ex/cat2.jpg";
		// 2. byte 이미지 파일 원본 읽어서 들여서 쓰기
		// cat.jpg → cat1.jpg
		// InputStream → [프로그램] → OutputStream
		InputStream bis = new FileInputStream(origin);    // 원본 읽기
		OutputStream bos = new FileOutputStream(target1); // cat1.jpg 쓰기
		
		int cnt1 =0;
		while((cnt1=bis.read())!=-1) {
			bos.write((byte)cnt1);
		}
		bos.flush(); bos.close(); bis.close();
		System.out.println(">> byte 이미지 복사 완료!");
		// 3. char 이미지 파일 원본 읽어서 들여서 쓰기
		// cat.jpg → cat2.jpg
		// Reader → [프로그램] → Writer
		Reader cr = new FileReader(origin);
		Writer cw = new FileWriter(target2);
		
		int cnt2=0;
		while((cnt2=cr.read())!=-1) {
			cw.write((char)cnt2);
		}
		cw.flush(); cw.close(); cr.close();
		System.out.println(">> char 이미지 복사 완료!");
	}

}
