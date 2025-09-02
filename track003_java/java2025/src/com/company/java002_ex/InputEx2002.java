package com.company.java002_ex;

import java.util.Scanner;

public class InputEx2002 {
	public static void main(String[] args) {
		int korean,  english, math, total ;
		double avg ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오.");
		korean = scanner.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		english  = scanner.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		math  = scanner.nextInt();
		total = korean + english + math ;
		avg = total/3.0 ;
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);
	}

}
