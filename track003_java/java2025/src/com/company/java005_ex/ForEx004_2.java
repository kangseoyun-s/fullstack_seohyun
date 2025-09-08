package com.company.java005_ex;

import java.util.Scanner;

public class ForEx004_2 {
	public static void main(String[] args) {
		// 변수
		String result ="";
		int cnt = 0;
		// 입력 + 처리(1)
		// 1이 3의 배수라면 카운트
		// 2가 3의 배수라면 카운트
		// 3이 3의 배수라면 카운트
		
		// 입력 + 처리(2)
		//if(1이 3의 배수라면) {카운트}
		//if(2가 3의 배수라면) {카운트}
		//if(3이 3의 배수라면) {카운트}
		
		// 입력 + 처리(3)
		//if(1%3==0) {cnt++}
		//if(2%3==0) {cnt++}
		//if(3%3==0) {cnt++}
		for(int i=1; i<=10; i++){if(i%3==0) {cnt++; result+=(i==3? "":",")+i;}}
		// 출력
		System.out.println("3의 배수:" + result );
		System.out.println("갯수:" + cnt );
	}

}
