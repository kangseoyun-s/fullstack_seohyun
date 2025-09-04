package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//변수
	int av;
	// String result= "불합격";
	//입력
	System.out.println("평균을 입력하시오. >");
	av = scanner.nextInt();
	// 출력
	if(av>=60) {System.out.println("합격");}
	else {System.out.println("불합격");}
	//System.out.println(result);
	//System.out.println(av >=60 ? "합격" : "불합격");
	}
}
