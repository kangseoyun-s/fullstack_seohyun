package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수
		char ch = ' ';
		// 입력
		System.out.println("영어를 입력하시오. >");
		ch = scanner.next().charAt(0);
		// 처리 + 출력
		if(ch>='A' && ch<='Z') {System.out.println("대문자");}
		else if(ch>='a'  &&  ch<='z') {System.out.println("소문자");}
		// else if(ch>='97'  &&  ch<='122') {System.out.println("소문자");}
		else {System.out.println("영문 대문자, 소문자가 아닙니다.");}
	}

}
