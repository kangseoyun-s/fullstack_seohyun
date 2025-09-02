package com.company.java002_ex;

import java.util.Scanner;

public class InputEx2002 {
	public static void main(String[] args) {
		int korean = 0;
		Scanner scanner = new Scanner(System.in);
		int english = 0;
		int math = 0;
		System.out.println("국어 점수를 입력하시오.");
		korean = scanner.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		english  = scanner.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		math  = scanner.nextInt();
		System.out.println("총점:" + (korean + english + math));
		System.out.println("평균:" + (korean + english + math)/3);
	}

}
