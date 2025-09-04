package com.company.java003_ex;

import java.util.Scanner;

public class Repeat009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수
		int a, b ;
		double c ;
		// 입력
		System.out.print("숫자 입력 1 >");
		a = scanner.nextInt();
		System.out.print("숫자 입력 2 >");
		b = scanner.nextInt();
		//처리
		c = (double)a/b;
		//출력
		System.out.printf("%d/%d=%.2f", a,b,c );
	}

}
