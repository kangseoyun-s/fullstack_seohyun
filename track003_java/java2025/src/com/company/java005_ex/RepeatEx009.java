package com.company.java005_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
		int to=0 ;
// ver-1)
//	1이  3의 배수라면  합을더해주변수에누적
//	2가  3의 배수라면  합을더해주변수에누적
//	3이  3의 배수라면  합을더해주변수에누적		
//	ver-2)
//	if( 1이  3의 배수라면 ){ 합을더해주변수에누적 }
//	if( 2가  3의 배수라면 ){ 합을더해주변수에누적 }
//	if( 3이  3의 배수라면 ){ 합을더해주변수에누적 }
	System.out.println("\nfor-ver");
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				to += i;
			}
			System.out.println("1~10까지 3의 배수의 합:" + to);
	}
	System.out.println("\nwhile-ver");
	int i = 1;
	while (i <= 10) {
		if (i % 3 == 0) {
			to += i;
		}
		i++;
	}
	System.out.println("1~10까지 3의 배수의 합:" + to);
	System.out.println("\ndowhile-ver");
	i = 1;
	do {
		if (i % 3 == 0) {
			to += i;
		}
		i++;
	} while (i <= 10);
	System.out.println("1~10까지 3의 배수의 합:" + to);
	}
}