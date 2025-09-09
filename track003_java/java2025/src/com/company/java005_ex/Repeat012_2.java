package com.company.java005_ex;

import java.util.Scanner;

public class Repeat012_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		System.out.println("숫자 한 개 입력 >");
		num = scanner.nextInt();
		switch(num) {
		case 1: System.out.println("one"); break;
		case 2: System.out.println("two"); break;
		case 3: System.out.println("three"); break;
		default: System.out.println("1,2,3이 아니다.");
		}
	}

}
