package com.company.java011_ex;

import java.util.Arrays;

public class ClassArrEx1 {
	public static void main(String[] args) {
		Apple[] apples= new Apple[3];
		Apple[] apples2 = new Apple[] { new Apple("RED", "iron", 2, 1000), new Apple("GREEN", "hulk", 1, 1500),
				new Apple("GOLD", "captain", 3, 2000) };
		// System.out.println(Arrays.deepToString(apples2));
		// apples[0] = new Apple("RED", "iron", 2, 1000)
		// apples[1] = new Apple("GREEN", "hulk", 1, 1500)
		// apples[2] = new Apple("GOLD", "captain", 3, 2000)
		for(int i=0; i<apples2.length; i++) {apples2[i].show();}
		// for(int i=0; i<apples2.length; i++) {System.out.println(apples[i]);}
		
		// 향상 for
		// for(Apple a: apples) {System.out.println(a);}
		//     한 개씩  : 배열, 객체명
	}

}
