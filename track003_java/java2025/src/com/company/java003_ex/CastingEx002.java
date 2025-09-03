package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수
		int ko, en, ma, to, le;
		double av ;
		// 입력
		System.out.println("국어 점수 입력 >");
		ko = scanner.nextInt();
		System.out.println("영어 점수 입력 >");
		en = scanner.nextInt();
		System.out.println("수학 점수 입력 >");
		ma = scanner.nextInt();
		// 처리
		to = ko + en + ma ;
		av = (double)to/3 ;
		le = (int)(av/10) ;
		// 출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GOOD  IT SCORE ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "국어","영어","수학","총점","평균","레벨");
		System.out.printf("%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5d\n", ko, en, ma, to, av, le);
	}
}
