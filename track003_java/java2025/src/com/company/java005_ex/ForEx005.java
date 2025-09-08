package com.company.java005_ex;

public class ForEx005 {
	public static void main(String[] args) {
		//변수
		int cnt=0;
		//입력 + 처리(1) 문제 파악
		//a가 모음이라면(a,e,i,o,u) 카운트
		//입력 + 처리(2) 구조
		//if(a가 모음이라면(a,e,i,o,u)) {카운트}
		//입력 + 처리(3) 처리
		//if('a'=='a'||'a'=='e'||'a'=='i'||'a'=='o'||'a'=='u')
		for (int i = 'a'; i <= 'z'; i++) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				cnt++;
			}
		}
		System.out.println("소문자 a~z까지 모음의 갯수 > " + cnt);
	}

}
