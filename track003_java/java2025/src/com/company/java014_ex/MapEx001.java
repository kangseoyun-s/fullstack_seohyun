package com.company.java014_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapEx001 {
	public static void main (String[] args) {
		String name ="";
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		System.out.printf(
			    "==============================\n" +
			    "%s %s\n" +
			    "==============================\n" +
			    "---------------------\n" +
			    "%s %s\n" +
			    "---------------------\n" +
			    "%s %s\n" +
			    "---------------------\n" +
			    "%s %s\n" +
			    "---------------------\n",
			    "KING", "NAME",
			    "파구왕", "통키",
			    "제빵왕", "김탁구",
			    "요리왕", "비룡"
			);
		System.out.println("KING의 정보를 제공 중입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요. > ");
		name = scanner.next();
		for(Entry<String, String> one : map.entrySet()) {
			if(one.getKey().equals(name)) {System.out.println("□ " + one.getKey()+" : "+one.getValue()); break;
		 }
		}
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {// 2. 처리 대상 확인
			Entry<String, String> temp = iter.next();
		}
	}

}
// for(Entry<String, String> one : map.entrySet()) {
//  System.out.println(k.getKey() + "\t" + k.getValue());
// }
//System.out.println("이름을 입력하세요. > ");
// String find = scanner.next();
//System.out.println(map.containsKey(find)? find + "-" + map.get(find):찾는 것 없음!);