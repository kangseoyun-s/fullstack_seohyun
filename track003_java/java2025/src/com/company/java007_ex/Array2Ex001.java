package com.company.java007_ex;

public class Array2Ex001 {
	public static void main(String[] args) {
		int [][] arr2 = {{100,200,300}, {400,500,600}};
//		System.out.print(arr2[0][0]); System.out.print(arr2[0][1]); System.out.print(arr2[0][2]);
//		System.out.println();
//		System.out.print(arr2[1][0]); System.out.print(arr2[1][1]); System.out.print(arr2[1][2]);
//		System.out.println();
//		for(int i=0; i<arr2[i].length; i++){System.out.print(arr2[0][i]);}
		for(int s=0; s<arr2.length; s++){for(int i=0; i<arr2[s].length; i++){System.out.print(arr2[s][i] +"\t");}System.out.println();}
	}
}
