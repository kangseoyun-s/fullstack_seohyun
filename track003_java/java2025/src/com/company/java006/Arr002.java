package com.company.java006;

import java.util.Arrays;

public class Arr002 {
	public static void main(String[] args) {
		//1. new
		// 주소 담기    1000번지 - 같은 자료형 연속으로 저장
		// arr(1000번지) [0][1][2]
		int [] arr = {1,2,3};
		int [] arr2 = new int[3]; //new 공간 빌리기 int 형태의 자료형 몇 개
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2)); // [0,0,0]
		
		//arr2[0] = 10; arr2[1] = 20; arr2[2] = 30; //for로 줄이기
		int data = 10;
		// arr2[0]=data; /*10*/ data+=10; /*data(20)*/
		// arr2[1]=data; /*20*/ data+=10; /*data(30)*/
		// arr2[2]=data; /*30*/ data+=10; /*data(40)*/
		for(int i=0; i<arr2.length; i++) {arr2[i]=data; data+=10;} //데이터 넣고 10 증가
		
		for(int i=0; i<arr2.length; i++) {System.out.print(arr2[i]+" ");}
	}

}
