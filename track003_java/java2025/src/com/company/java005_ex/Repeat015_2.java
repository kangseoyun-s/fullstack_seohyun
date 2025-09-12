package com.company.java005_ex;

import java.util.Scanner;

public class Repeat015_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		System.out.println("숫자 입력 > ");
		num = scanner.nextInt();
		switch(num) {
		case 1: System.out.println("mango"); break;
		case 2: System.out.println("noodle"); break;
		case 3: System.out.println("orange"); break;
		default: System.out.println("m,n,o가 아닙니다."); break;
		}
	}

}
