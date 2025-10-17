package com.company.java015;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {

	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> {System.out.println("Hello " + t);};
		// Consumer<String> consumer = System.out::println;
		consumer.accept("sally");
		consumer.accept("lambda");
		// void java.util.function.Consumer.accept(T t) / (T t) -> {X} / accept
		Supplier<String> supplier = () -> {return "Hello";};
		// Supplier<String> supplier = () -> {"Hello"}
		System.out.println(supplier.get()); 
		// T java.util.function.Supplier.get() / ()->{return} / get
		Predicate<Integer> predicate = (t) -> {return t<0;};
		// Predicate<Integer> predicate = t -> t<0
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(-10));
		// boolean java.util.function.Predicate.test(T t) / (T t) -> {return boolean} / test
		Function<String, Integer> function = (t) -> {return Integer.parseInt(t);};
		// Function<String, Integer> function = t -> Integer.parseInt(t)
		// // Function<String, Integer> function = Integer::parseInt(t)
		System.out.println(function.apply("10")+3);
		// R java.util.function.Function.apply(T t) / (T t) -> {return R} / apply
		IntBinaryOperator operator = (int left,int right) -> {return left >right? left:right;}; // import java.util.function.Supplier;
		// IntBinaryOperator operator = (left, right) -> {left>right? left:right;}
		System.out.println(operator.applyAsInt(10,3));
		System.out.println(operator.applyAsInt(3,10));
		// int java.util.function.IntBinaryOperator.applyAsInt(int left,int right) /
		// (int left,int right) -> {return int} / applyAsInt
	}

}

/*
 자바의 api 함수형 인터페이스 
  
1. Consumer 받는 용도  
2. Supplier 제공 용도
3. Predicate 판단 용도 
4. Function 처리 용도
5. Operator 연산 용도  
  */
