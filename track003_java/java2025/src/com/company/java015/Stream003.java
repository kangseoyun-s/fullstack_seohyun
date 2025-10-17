package com.company.java015;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Stream003 {

	public static void main(String[] args) {
		Integer [] ages = {17, 21, 45, 18, 26};
		
		double avg = Arrays.stream(ages)
			               .mapToInt(age -> age)
			               .average()
			               .orElse(0.0);
		System.out.println("평균 나이: " + avg);
		
		// Ex2 짝수만 출력
		// step1) 스트림 만들기
		Stream<Integer> ages1 = Arrays.stream(ages);
		// step2) 짝수 필터링 - filter
		ages1.filter(t -> t%2==0)
		// step3) 출력 - forEach
		.forEach(t -> System.out.println(t));
		// Ex3 성이 김씨인 친구들
		List<String> names = Arrays.asList("김수지", "이나영", "김나영", "유재석", "강호동");
		// System.out.println(names.get(0).startsWith("김")); // startsWith("문자") 시작하는
		Stream<String> names1 = names.stream();
		names1.filter(t -> t.startsWith("김"))
		      .sorted()
		      .forEach(t -> System.out.println(t));
		names.stream()
		     .sorted()
		     .forEach(System.out::print);
		int max = Arrays.stream(ages).mapToInt(age->age).max().orElse(-1);
		System.out.println(max);
	}

}
