package com.company.java007_ex;

public class Array2Ex007 {
	public static void main(String[] args) {
		int [][] arr = new int [4][4];
		int data = 1;
		for (int s = 0; s < arr.length; s++) {
			for (int i = 0; i < arr[s].length; i++) {
				arr[s][i] = data++;
			}
			data = 1;
		}
		for (int s = 0; s < arr.length; s++) {
			for (int i = 0; i < arr[s].length; i++) {
				System.out.print(arr[s][i] +"\t");}
			System.out.println();
	     } 
	}
}
