package com.company.java007_ex;

public class Array2Ex006 {
	public static void main(String[] args) {
		int [][] arr = new int [5][5];
		int data =1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = data++;
			}
		}
//		for(int j=0; j<arr[0].length; j++) {arr[j][0]=data;}
//		for(int i=0; i<arr[0].length; i++){arr[0][i]=data;}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] +"\t");
			} System.out.println();
		}
	}

}
