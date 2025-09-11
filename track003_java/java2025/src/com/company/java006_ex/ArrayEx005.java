package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		int upper=0, lower=0;
		char [] ch = { 'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		for(int i=0; i<=5; i++) {if(ch[i]>='A' && ch[i]<='Z') {upper++;}
		else if(ch[i]>='a' && ch[i] <='z') {lower++;}}
		System.out.println("대문자 개수:" + upper++);
		System.out.println("소문자 개수:" + lower++);
	}

}
