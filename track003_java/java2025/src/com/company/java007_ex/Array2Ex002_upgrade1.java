package com.company.java007_ex;

public class Array2Ex002_upgrade1 {
	public static void main(String[] args) {
		int[][] arr2 = {
			    {101, 102, 103},
			    {200, 201, 202},
			    {301, 302, 303}
			};
/*		System.out.print(arr2[0][0]);System.out.print(arr2[0][1]);System.out.print(arr2[0][2]);
		System.out.println();
		System.out.print(arr2[1][0]);System.out.print(arr2[1][1]);System.out.print(arr2[1][2]);
		System.out.println();
		System.out.print(arr2[2][0]); System.out.print(arr2[2][1]); System.out.print(arr2[2][2]);
		System.out.println();
		for(int i=0; i<=2; i++){System.out.print(arr2[0][i]); System.out.println();}*/
		for(int s=0; s<=2; s++){for(int i=0; i<=2; i++)if(arr2[s][i]==0){System.out.print(arr2[s][i]); System.out.println();}}
				
	}

}
