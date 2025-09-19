package com.company.java008_ex;

public class Repeat020_6 {
	public static void main(String[] args) {
		char [][] ch = new char [2][3];
		char data = 'A';
		for (int o = 0; o < ch.length; o++) {
			for (int i = 0; i < ch[0].length; i++) {
				ch[o][i] = data++;
			}
			data='a';
		}
		for (int o = 0; o < ch.length; o++) {
			for (int i = 0; i < ch[o].length; i++) {
				System.out.print(ch[o][i] + "\t");
			}System.out.println();
		}
	}
}
