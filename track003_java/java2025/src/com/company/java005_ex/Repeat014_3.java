package com.company.java005_ex;

import java.util.Scanner;

public class Repeat014_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		for(;;) {
			System.out.println("숫자 입력 >");
			num = scanner.nextInt();
			if(num==7) {System.out.println("종료합니다!");{break;}}
		}
	}

}
