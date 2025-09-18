package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008_1 {
	public static void lower(char [] letters) {
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >= 'A' && letters[i] <= 'Z') {
				letters[i] += 32;
			}
		}
	}
	public static void main(String[] args) {
		char [] letters = {'A','B','C','1','@'};
		lower(letters);
		// [heap]                  [stack]
		//		            <      4) lower(1000번지) 7번째 줄
		// 2)1000번지         <     3) letters[1000번지] 6번째 줄
		// {'A','B','C','1','@'}
		//                          1) main
		System.out.println(Arrays.toString(letters));
	}

}
