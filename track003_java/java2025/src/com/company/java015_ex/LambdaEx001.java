package com.company.java015_ex;

interface interC2 {
	String hi();
}

public class LambdaEx001 {
	public static void main(String[] args) {
		interC2 c = new interC2() {

			@Override
			public String hi() {
				// TODO Auto-generated method stub
				return "Good :Day";
			}
			
		};
		System.out.println(c.hi());
		interC2 c2 = () -> {return "Good :Day";};
		System.out.println(c2.hi());
	}
	
}

