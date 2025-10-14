package com.company.java014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//콜렉션프레임워크 - [배열]의 단점을 개선한 [객체]만 저장 가능 [동적배열]
//List, Set, Map
//List(기차) - index O, 중복 허용 O add / get(순서) / size / remove(순서) / contains
//Set(주머니) - index X, 중복 허용 X add / 향상된 for, iterator / size / remove(순서) / contains
//Map(사전) - key:value → entry 한쌍, put / get(key), 향상된 for, iterator / size / remove(순서) / contains
public class Map001 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		System.out.println("1: " + map);
		System.out.println("2: " + map.get("two"));
		System.out.println("3: " + map.size());
		System.out.println("4: " + map.remove("two"));
		System.out.println("5: " + map.containsKey("one"));
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> one : map.entrySet()) {
			System.out.println(one.getKey()+"/"+one.getValue());
		}
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator(); // 1. iter -> [one=1, three=3]
		while(iter.hasNext()) {// 2. 처리 대상 확인
			Entry<String, Integer> temp = iter.next();
			System.out.println(temp.getKey()+"/"+temp.getValue());
		}
	}

}
