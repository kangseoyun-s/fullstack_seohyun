package com.company.java016;

public class JavaIO006 {
	public static void main(String[] args) {
		// 1. String 문자열 누적 - 새로운 주소 (변형 X)
		String str = "ABC";
		System.out.println("1. str 주소 > " + str + " " + System.identityHashCode(str));
		str += "D";
		System.out.println("2. str 주소 > " + str + " " + System.identityHashCode(str));
		// 2. StringBuffer 문자열 누적 - 기존 주소 (변형 O)
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");
		System.out.println("3. sb 주소 > " + sb + " " + System.identityHashCode(sb));
		sb.append("D");
		System.out.println("4. sb 주소 > " + sb + " " + System.identityHashCode(sb));
	}

}
