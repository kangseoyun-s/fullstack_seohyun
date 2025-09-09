package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//변수 0~100
		int num1=-1, num2 =-1;
		char op =' ' ; // 초기값 필수
		
		//입력
		for (;;) {// 1-4. 무한 반복
			if (!(num1 >= 0 && num1 <= 100)){             //1-1. 0~100 범위가 아니라면
			System.out.println("1. 정수를 하나 입력해 주세요. >"); // 1-2. 입력받기
			num1 = scanner.nextInt();
			
				continue; //1-3. 아래쪽 진행하지 말 것!
		
		   }
	
			if (!(num2 >= 0 && num2 <= 100)){               // 2-1. 0~100 범위가 아니라면
			System.out.println("2. 정수를 하나 입력해 주세요. >");  // 2-2. 입력받기
			num2 = scanner.nextInt();
			
				continue; // 2-3. 아래쪽 진행하지 말 것!
			}
		
	
			if (!(op == '+' || op == '-' || op == '*' || op == '/')){ // 3-1. '연산자'가 아니라면
			System.out.println("3. 연산자를 입력해 주세요(+,-,*,/). >"); // 3-2. 입력받기
			op = scanner.next().charAt(0);
			 
				continue; // 3-3. 아래쪽 진행하지 말 것!
			}
			 break; // 모두 잘 썼다면
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
