package com.company.java006_ex;

public class ArrayEx007 {
	public static void main(String[] args) {
		char [] arr = {'A','B','C','D','E'};
		char [] arr2 = new char[5];
		char data='A';
		for(int i=0; i<arr2.length; i++){arr2[i]=data; data+=1;}
		for(int i=0; i<arr2.length; i++){System.out.print(arr2[i]+" ");}
	}

}
