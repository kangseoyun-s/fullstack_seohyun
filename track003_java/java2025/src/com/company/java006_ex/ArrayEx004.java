package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		// 변수
		int cnt=0;
		char [] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		// 입력 
		// 처리 만약 'B'가 'a'라면 카운트, 만약 'a'가 'a'라면 카운트
		for(int i=0; i<=5; i++) {if(ch[i]=='a') {cnt++;}}
		// 출력
		System.out.println("a의 갯수:" + cnt++);
	}

}
