package com.company.java008_ex;

public class Repeat020_2 {
	public static void main(String[] args) {
		int [][] arr = new int [2][3];
		int data = 101;
		for (int s = 0; s < arr.length; s++) {
			for (int i = 0; i < arr[s].length; i++) {
				arr[s][i] = data++;
			}
			data = 201;
		}
		for (int s = 0; s < arr.length; s++) {
			for (int i = 0; i < arr[s].length; i++) {
				System.out.print(arr[s][i] +"\t");}
			System.out.println();
	     } 
	}
}
