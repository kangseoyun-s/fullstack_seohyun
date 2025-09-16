package com.company.java007_ex;

public class Repeat017_1 {
	public static void main(String[] args) {
		int [][] arr = new int[2][3];
		int data = 101;
//		for(int i=0; i<arr.length; i++) {arr[i][0]+=data++;}
//		for(int i=0; i<arr[0].length; i++){arr[0][i]+=data++;}
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr[k].length; i++) {
				arr[k][i] += data++;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr[k].length; i++) {
				System.out.print(arr[k][i] +"\t");
			} System.out.println();
		}
	}

}
