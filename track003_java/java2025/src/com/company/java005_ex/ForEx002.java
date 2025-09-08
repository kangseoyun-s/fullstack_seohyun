package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수
		int n ;
		System.out.println("원하는 구구단을 입력하시오 >");
		n = scanner.nextInt();
		
		// 2*1=2
		// 2*2=4
		// 2*3=6
//		System.out.println(2 +"*" + 1 + "=" + 2*1);
//		System.out.println(2 +"*" + 2 + "=" + 2*2);
//	    System.out.println(n*1);
//	    System.out.println(n*2);
//	    System.out.println(n*3);
//	    System.out.println(n*4);
//	    System.out.println(n*5);
//	    System.out.println(n*6);
//	    System.out.println(n*7);
//	    System.out.println(n*8);
		for(int i=1; i<=9; i++ ) {System.out.println(n + "*" + i + "=" + n*i);}
	}

}
