package com.company.java005_ex;

import java.util.Scanner;

public class Repeat013_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0 ;
		for (;;) {
			if (!(num == 1)) {
				System.out.println("숫자 한 개 입력 > ");
				num = scanner.nextInt();
			}
			else {break;}
			{
				continue;
			}
			
		}
	}
}

