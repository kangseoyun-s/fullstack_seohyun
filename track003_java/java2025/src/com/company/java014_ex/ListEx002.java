package com.company.java014_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		int num;
	    
	    List<String> list2 = new ArrayList<>();
	    list2.add("one");
	    list2.add("two");
	    list2.add("three");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("숫자를 입력하세요 > ");
	    num = scanner.nextInt();
	    System.out.println(list2.get(num - 1));
	    }
//	    switch(num) {
//	    case 1: System.out.println(list2.get(0)); break;
//	    case 2: System.out.println(list2.get(1)); break;
//	    case 3: System.out.println(list2.get(2)); break;
//	    default: System.out.println("1,2,3 중 입력하세요.");
//	    }
//	    
	}
