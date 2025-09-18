package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008_3 {
	public static void ringbell(String [][] apt) {
		apt[1][1] = "bell"; 
	}
	
	public static void main(String[] args) {
		String [][] apt = {
				{"아이유", "손흥민", "BTS RM"}, // 00 01 02
				{"이정재", "리사", "유재석"},    // 10 11 12
				{"박지성", "강호동", "마동석"},  //  20 21 22
		};
		System.out.println("MAIN > APT - " + Arrays.deepToString(apt));
		ringbell(apt);
		System.out.println("MAIN > APT - BELL " + Arrays.deepToString(apt));
	}

}

/* [heap]                    [stack]
 *                   <       ringbell(1000번지)
   1000번지 apt       <       apt[1000번지]
   apt[0층 1001번지 | 1층 1002번지 | 2층 1003번지] 
   1001번지{"아이유", "손흥민", "BTS RM"}
   1002번지{"이정재", "리사", "유재석"}
   1003번지{"박지성", "강호동", "마동석"}
 */
 
