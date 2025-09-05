package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//변수
		int num1, num2 ;
		char ch1= ' ';
		double num3;
		System.out.println("계산기");
		System.out.println("정수를 하나 입력해 주세요. >");
		num1 = scanner.nextInt();
		System.out.println("정수를 하나 입력해 주세요. >");
		num2 = scanner.nextInt();
		System.out.println("연산자를 입력해주세요(+,-,*,/)");
		ch1= scanner.next().charAt(0);
		num3 = (double)num1/num2;
		if(ch1 == '+') {System.out.println(num1 +"+"+num2 + "=" + (num1 + num2));}
		else if(ch1 == '-') {System.out.println(num1 +"-"+num2 + "=" + (num1 - num2));}
		else if(ch1 == '*') {System.out.println(num1 +"*"+num2 + "=" + (num1 * num2));}
		else if(ch1 == '/') {System.out.printf("%d/%d=%.2f", num1,num2,num3 );}
	//	변수
	//	int num1, num2 ; String result ="";
	//  char ch1;
	//  처리      출력  숫자   연산자  숫자 =
	//  result = "" +num1 + ch1 +num2 + '=';
	//  if(ch1=='+') {result +=(num1+num2);}
	//  else if(ch1=='-') {result +=(num1-num2);}
	//  else if(ch1=='*') {result +=(num1*num2);}
	//  else if(ch1=='/') {result +=String.format("%.2f", (double)num1/num2);}
	}

}
