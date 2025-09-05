package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력하시오. >");
		num = scanner.nextInt();
		if(num%2==0) {System.out.println("여자");}
		else {System.out.println("남자");}
		// String result = q3 > 0 ? "양수" : q3 < 0 ? "음수":"0";
		// ()? "참" : "거짓"
		// num%2==0 ? "여자" : num%2!==0 ? "남자"
	}

}
