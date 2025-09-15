package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		int [][] arr2 = {{101,102,103},{201,202,203}};
		// for(int i=0; i<=2; i++) {System.out.print(arr2[0][i]); System.out.println();}
		
		
		for (int s = 0; s < arr2.length; s++) {
			for (int i = 0; i < arr2[s].length; i++) {
				System.out.print(arr2[s][i] +"\t");
				
			}System.out.println();
		}
	}
}
