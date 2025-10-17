package com.company.java015;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream001 {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(arr);
		
		//    stream (흐름)
		// Arrays.stream(arr).forEach(null);
		Arrays.stream(arr).forEach((t) -> {System.out.print(t);});
		System.out.println();
		System.out.println();
		// void java.util.function.Consumer.accept(T t)
		// (T t) -> {} / accept
		list.stream().forEach((t) -> {System.out.print(t);});
		list.stream().forEach(System.out::print);
	}

}
