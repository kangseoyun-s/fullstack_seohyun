package com.company.java005;

import java.util.Scanner;

public class Repeat002_IFor {
	public static void main(String[] args) {
		//1. 무한 반복 for(;;){}
		// for(;;) syso("hello") > 무한 반복
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("숫자 1을 입력하세요.");
			int a = scanner.nextInt();
			if(a==1) {break;}
		}
		// for - break 나가기 1 2
		for(int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.println(i+"\t");
		}
		System.out.println();
		//for - continue 건너뛰기 1 2 () 4 ... 8 9 10
		for(int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.println(i+"\t");
		}
	}

}
