package com.company.java006_ex;

public class ArrayEx006 {
	public static void main(String[] args) {
		double [] arr = {1.1  , 1.2  , 1.3  , 1.4  , 1.5 };
		double [] arr2 = new double[5];
		double data=1.1;
		for(int i=0; i<arr2.length; i++){arr2[i]=data; data+=0.1;}
		for(int i =0; i<arr2.length; i++)
		{System.out.printf("%.1f ",arr2[i]);}
	}

}
