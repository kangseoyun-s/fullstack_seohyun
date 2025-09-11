package com.company.java005_ex;

import java.util.Scanner;

public class Repeay014_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch;
		System.out.println("문자 입력 >");
		ch = scanner.next().charAt(0);
		if(ch=='x') {System.out.println("x-ray");}
		else if(ch=='y') {System.out.println("yogurt");}
		else if(ch=='z') {System.out.println("zebra");}
		else {System.out.println("x,y,z가 아닙니다.");}
	}

}
