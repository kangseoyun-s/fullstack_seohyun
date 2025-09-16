package com.company.java007_ex;

public class Repeat017_2 {
	public static void main(String[] args) {
		char [][] ch = new char [2][3];
		char data ='A';
//		for(int i=0; i<ch.length; i++){ch[i][0]+=data++;}
//		for(int i=0; i<ch[0].length; i++){ch[0][i]+=data++;}
		for (int k = 0; k < ch.length; k++) {
			for (int i = 0; i < ch[k].length; i++) {
				ch[k][i] += data++;
			} 
			data='B';
		}
		for (int k = 0; k < ch.length; k++) {
			for (int i = 0; i < ch[k].length; i++) {
				System.out.print(ch[k][i]+"\t");
			} System.out.println();
		}
	}

}
