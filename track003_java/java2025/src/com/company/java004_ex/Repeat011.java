package com.company.java004_ex;

import java.util.Scanner;

public class Repeat011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2 ;
		char ch = ' ';
		System.out.println("계산기");
		System.out.println("정수를 하나 입력해 주세요");
		num1 = scanner.nextInt();
		System.out.println("정수를 하나 입력해 주세요");
		num2 = scanner.nextInt();
		System.out.println("연산자를 입력해 주세요(+,-,*,/)");
		ch = scanner.next().charAt(0);
		if(ch == '+') {System.out.println(num1 + "+" + num2 +"="+ (num1+num2));}
		else if(ch == '=') {System.out.println(num1 + "-" + num2 +"="+ (num1-num2));}
		else if(ch == '*') {System.out.println(num1 + "*" + num2 +"="+ (num1*num2));}
		else if(ch == '/') {System.out.println(num1 + "/" + num2 +"="+ (num1/num2));}
	}

}
