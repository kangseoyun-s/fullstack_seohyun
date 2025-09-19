package com.company.java008_ex;

import java.util.Scanner;

public class Repeat020_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char op;
		for (;;) {
			System.out.println("연산자를 입력해 주세요. > ");
			op = scanner.next().charAt(0);
			if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("연산자를 다시 입력해 주세요.");
			} else {
				break;
			}
		}
		while (!(op == '+' || op == '-' || op == '*' || op == '/')) {
			if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("연산자를 다시 입력해 주세요.");
			} else {
				break;
			}
			System.out.println("연산자를 입력해 주세요. > ");
		}

		do {
			if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("연산자를 다시 입력해 주세요.");
			} else {
				break;
			}
			System.out.println("연산자를 입력해 주세요. > ");
		} while (!(op == '+' || op == '-' || op == '*' || op == '/'));
	}
}
