package com.company.java014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List001 {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0]="헐크";
		System.out.println(Arrays.toString(arr));
		
		List list = null;
		     list = new ArrayList();
		     list = new LinkedList();
		     list = new Vector();
		     
		List<String> list2 = new ArrayList<String>();
		list2.add("one");
		//list2.add(1);
		list2.add(new String("two"));
		//list2.add(3.14);
		//list2.add('A');
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<>();
		list3.add("apple");
		list3.add("banana");
		list3.add("apple");
		list3.add("coconut");
		
		System.out.println(list3);
		System.out.println(list3.get(3));
		System.out.println(list3.size());
		System.out.println(list3.remove(2)+"/"+list3);
		System.out.println(list3.contains("melon"));
		System.out.println(list3.contains("coconut"));
	}

}
