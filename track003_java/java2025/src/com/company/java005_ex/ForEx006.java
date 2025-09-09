package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//변수 0~100
		int num1, num2 =0;
		char op =' ' ;
		//입력
		for (;;) {
			System.out.println("1. 정수를 하나 입력해 주세요. >");
			num1 = scanner.nextInt();
			if (num1 >= 0 && num1 <= 100) {
				break;
			}
		}
		for (;;) {
			System.out.println("2. 정수를 하나 입력해 주세요. >");
			num2 = scanner.nextInt();
			if (num2 >= 0 && num2 <= 100) {
				break;
			}
		}
		for (;;) {
			System.out.println("3. 연산자를 입력해 주세요(+,-,*,/). >");
			op = scanner.next().charAt(0);
			if (op == '+' || op == '-' || op == '*' || op == '/') {
				break;
			}
		}
		switch(op) {
		case '+': System.out.println(num1+ "+" + num2 + "=" + (num1+num2)); break;
		case '-': System.out.println(num1 + "-" + num2 + "=" + (num1-num2)); break;
		case '*':System.out.println(num1 + "*" + num2 + "=" + (num1*num2)); break;
		case '/': System.out.println(num1 + "/" + num2 + "=" + (num1/num2)); break;
		}
		// 처리
			
		// 출력
		
	}

}
