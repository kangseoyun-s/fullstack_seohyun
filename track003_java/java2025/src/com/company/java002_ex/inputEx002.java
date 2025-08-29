package com.company.java002_ex;

import java.util.Scanner;

public class inputEx002 {
	public static void main(String[] args) {
		int like = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("좋아하는 숫자(정수)를 입력하시오 >");
		like = scanner.nextInt();
		System.out.println("좋아하는 숫자는" + like + "입니다.");

	}
}
