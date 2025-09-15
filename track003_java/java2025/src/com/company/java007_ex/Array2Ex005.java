package com.company.java007_ex;

public class Array2Ex005 {
	public static void main(String[] args) {
		int[][] arr = {
				   { 1, 1, 1,},
				   { 2, 2, 2,},
				   { 3, 3, 3,},
				   { 4, 4, 4,},
				 };
				 int total=0;  double avg=0.0;	 
	    for(int s=0; s<arr.length; s++){for(int i=0; i<arr[s].length; i++){total+=arr[s][i];}};		 
		avg = (double)total/(arr.length*arr[0].length);
		System.out.println("총점 >" + total);
		System.out.println("평균 >" + avg);
	}

}
