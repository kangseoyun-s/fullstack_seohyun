package com.company.java006_ex;

public class Repeat016 {
	public static void main(String[] args) {
		char [] chars = {'a', 'b','c'};
		char [] chars2 = new char[3];
		char data ='a';
		for(int i=0; i<chars.length; i++){chars2[i]=data; data+=1;}
		for(int i=0; i<chars.length; i++){System.out.print(chars2[i]);}
	}

}
