package com.company.java003_ex;

import java.util.Scanner;

public class CastingCharEx {
	public static void main(String[] args) {
		//변수
		char u = ' ';
		char l = ' ';
		Scanner scanner = new Scanner(System.in);
 		//입력
		System.out.println("대문자를 입력해 주세요 >");
		u = scanner.next().charAt(0);
		//처리
		l = (char)(u+32);
		//풀력
		System.out.println("입력하신 대문자:" + u + ", 소문자 변환:" + l);
	}

}
