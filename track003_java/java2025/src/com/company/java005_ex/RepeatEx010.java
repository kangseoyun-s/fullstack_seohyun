package com.company.java005_ex;

public class RepeatEx010 {
	public static void main(String[] args) { 
		System.out.println("\nfor-ver");
		for (char a = 'A'; a <= 'Z'; a++) {
			if (a % 5 == 0) {
				System.out.println();
			}
			System.out.print(a);
		}
		// for(char a='A'; a<='Z'; a++) {if() System.out.println('a');}
		// for(char a='A'; a<='Z'; a++) {if(a%5==0) System.out.println();}
		System.out.println("\nwhile-ver");
		char a = 'A';
		while (a <= 'Z') {
			if (a % 5 == 0) {
				System.out.println();
			}
			System.out.print(a);
			a++;
		}
		System.out.println("\ndowhile-ver");
		a = 'A';
		do {
			if (a % 5 == 0) {
				System.out.println();
			}
			System.out.print(a);
			a++;
		} while (a <= 'Z');
		//ver-1 눈에 보이는 그대로
		// System.out.println();
		// System.out.print('A'); System.out.print('B'); System.out.print('C'); System.out.print('D'); System.out.print('E');
		//ver-2 구조 {반복} {변수} for{시작; 종료; 변화}
		//ver-3 특별한 문제 풀이 조건
 	}

}
