package com.company.java007;

import java.util.Arrays;

public class Arr2 {
	public static void main(String[] args) {
		int [][] arr = {  {1,2,3}, // 00 01 02
				          {4,5,6}  // 10 11 12
				       };
		System.out.println(arr); // 주소
		System.out.println(Arrays.toString(arr)); // 주소
		System.out.println(Arrays.deepToString(arr)); // 어떤 데이터 가지고 있는지 확인
		
		//ver-1 눈에 보이는 대로
		System.out.println("ver-1");
		System.out.print(arr[0][0]+"\t"); System.out.print(arr[0][1]+"\t"); System.out.print(arr[0][2]+"\t");
		System.out.println();
		System.out.print(arr[1][0]+"\t"); System.out.print(arr[1][1]+"\t"); System.out.print(arr[1][2]+"\t");
		System.out.println();
		//ver-2 칸 정리
		System.out.println("ver-2");
		for(int i=0; i<=2; i++) {System.out.print(arr[0][i]+"\t");}
		System.out.println();
		for(int i=0; i<=2; i++) {System.out.print(arr[1][i]+"\t");}
		System.out.println();
		//ver-3 층정리
	    System.out.println("ver-3");
		for(int ch=0; ch<=1; ch++){for(int i=0; i<=2; i++) {System.out.print(arr[ch][i]+"\t");}
		System.out.println();}
		
		System.out.println("ver-4");
		// 배열명(아파트).length 층 / 배열명[0](층).length 칸
		for(int ch=0; ch<=arr.length; ch++){for(int i=0; i<=arr[ch].length; i++) {System.out.print(arr[ch][i]+"\t");}
		System.out.println();}
	}//end main
}// end class
