package com.company.java011_ex;

public class ClassArrEx1 {
	public static void main(String[] args) {
		Apple[] apples= new Apple[3];
		Apple[] apples2= new Apple[] {
			new Apple("RED", "iron", 2, 1000), new Apple("GREEN", "hulk", 1, 1500), new Apple("GOLD", "captain", 3, 2000)  
		};
		for(int i=0; i<apples2.length; i++) {apples2[i].show();}
	}

}
