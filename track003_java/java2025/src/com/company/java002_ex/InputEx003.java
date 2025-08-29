package com.company.java002_ex;

import java.util.Scanner;

public class InputEx003 {
	public static void main(String[] args) {
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자의 년도를 입력받습니다 >");
		year = scanner.nextInt();
		System.out.println("당신의 나이는" + (2025-year) + "살 입니다.");
	}

}
