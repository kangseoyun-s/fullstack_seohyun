package com.company.java005_ex;

import java.util.Scanner;

public class Repeat014_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch;
		System.out.println("문자 입력 >");
		ch = scanner.next().charAt(0);
		switch(ch) {
		case 'x': System.out.println("x-ray");
		case 'y': System.out.println("yogurt");
		case 'z': System.out.println("zebra");
		default: System.out.println("x,y,z가 아닙니다.");
		}
		
	}

}
