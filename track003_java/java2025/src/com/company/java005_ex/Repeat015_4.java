package com.company.java005_ex;

public class Repeat015_4 {
	public static void main(String[] args) {
		int [] num = {10,20,30};
		int [] num2 = new int[3];
		int data =10;
		for(int i=0; i<num.length; i++) {num2[i]=data; data+=10;}
		for(int i=0; i<num.length; i++){System.out.println(num[i]);}
	}

}
