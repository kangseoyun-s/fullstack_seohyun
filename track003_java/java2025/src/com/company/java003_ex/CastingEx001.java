package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수
		int a, b ;
		double c ;
		// 입력
		System.out.println("숫자 입력1>");
		a = scanner.nextInt();
		System.out.println("숫자 입력2>");
		b = scanner.nextInt();
		// 처리
		c = (double)a/b;
		// 출력
		System.out.println(a +"/"+b  +"="+ String.format("%2.f", c));
		System.out.printf("%d/%d=%.2f", a,b,c); // 아래 것도 가능
	}

}
