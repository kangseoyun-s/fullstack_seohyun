package com.company.java005_ex;

import java.util.Scanner;

public class ForEx003_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수 1~10까지의 합
		int to = 0; //to를 담을 변수
		// 입력 + 처리
		// to 변수에 1 담기
		// to 변수에 2 담기
//		to = to + 1;
//		to = to + 2;
//		to = to + 3;
//		to = to + 4;
//     	to = to + 5;
//		to = to + 6;
//		to = to + 7;
//		to = to + 8;
//		to = to + 9;
//		to = to + 10;
		for(int i=1; i<=10; i++) {to = to + i; System.out.print((i==1? "":"+")+i);}
		// 출력
		System.out.println("=" + to);
	}

}
