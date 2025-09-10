package com.company.java006;

public class Repeat003_While_DoWhile {
	public static void main(String[] args) {
		//1.for
		//1 2 3
		System.out.println("1.for");
		for(int i=1; i<=3; i++) {System.out.println(i+"\t");}
		
		//2. while (반복 횟수 모를 때) ctrl + shift + f
		System.out.println("2. While");
		int i=1; //2-1. 초기문 = 위로
		while(i<=3) {//2-2.조건
			System.out.println(i+"\t");
			i++;
		} //2-3. 증감 } 맨끝
		System.out.println("3. do While");
	    i=1; //3-1. 초기문 = 위로
	 	do{ //3-2.일단 실행
			System.out.println(i+"\t");
			i++;
		} while(i<=3);//2-3. 증감 } 맨끝
	}

}
