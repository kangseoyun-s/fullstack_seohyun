package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		char [][] ch = new char [2][3];
//		ch [0][0] = 'A'; ch [0][1] = 'B'; ch [0][2] = 'C';
//		ch [0][1] = 'B'; ch [0][2] = 'C'; ch [1][0] = 'D';
		char data = 'A';
		for (int o = 0; o < ch.length; o++) {
			for (int i = 0; i < ch[0].length; i++) {
				ch[o][i] = data++;
			}
			data='B';
		}
//		for(int o=0; o<ch[0].length; o++){ch[o][0]=data++;}
//		for(int i=0; i<ch[0].length; i++){ch[0][i]=data++;}
		for (int o = 0; o < ch.length; o++) {
			for (int i = 0; i < ch[o].length; i++) {
				System.out.print(ch[o][i] + "\t");
			}System.out.println();
		}
	}
}
