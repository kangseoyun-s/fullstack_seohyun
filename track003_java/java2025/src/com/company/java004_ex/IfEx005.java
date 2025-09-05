package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch=' ';
		System.out.println("영문을 입력하시오. >");
		ch = scanner.next().charAt(0);
		if(ch >= 'a' && ch >='z') {System.out.println(ch = (char) (ch -32));}
		else if(ch <='A' && ch >='Z') {System.out.println(ch = (char) (ch + 32));}
		// String result = "ch"
		// (조건)? 참 : ((조건))? 참 : 거짓
		// (ch = ch>='A' && ch<='Z') ? ch+=32 : (ch >='a' && ch<='z') ch-=32: ch;
	}

}
