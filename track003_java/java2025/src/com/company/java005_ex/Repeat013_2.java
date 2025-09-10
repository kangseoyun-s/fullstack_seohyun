package com.company.java005_ex;

import java.util.Scanner;

public class Repeat013_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch ;
		System.out.println("영어를 입력하시오. >");
		ch = scanner.next().charAt(0);
		switch(ch) {
		case 'a': System.out.println("apple"); break;
		case 'b': System.out.println("banana"); break;
		case 'c': System.out.println("coconut"); break;
		default: System.out.println("a,b,c가 아니다."); break;
		}
		
	}

}
