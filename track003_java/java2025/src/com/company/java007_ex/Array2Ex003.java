package com.company.java007_ex;

public class Array2Ex003 {
	public static void main(String[] args) {
		int [][] num = new int [2][3];
//		System.out.print(num[0][0]);System.out.print(num[0][1]); System.out.print(num[0][2]);
//		System.out.println();
//		System.out.print(num[1][0]);System.out.print(num[1][1]);System.out.print(num[1][2]);
//		System.out.println();
		int data =101;

		for (int n = 0; n < num.length; n++) {
			for (int i = 0; i < num[n].length; i++) {
				num[n][i] = data++;
			}
		}
//		for (int i = 0; i < num[0].length; i++) {
//			num[0][i] = data++;
//		}
//		for (int i = 0; i < num[0].length; i++) {
//			num[1][i] = data++;
//		}
		 
//		for(int n=0; n<num.length; n++){for(int i=0; i<num[0].length; i++){System.out.print(num[0][i]); System.out.println();}}
		for (int n = 0; n < num.length; n++) {
			for (int i = 0; i < num[n].length; i++) {
				System.out.print(num[n][i] + "\t"); 
			} System.out.println();
		}
	}
}
