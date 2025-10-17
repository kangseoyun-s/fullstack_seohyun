package com.company.java015;

interface InterA2{ void hi();}
interface InterB2{ void hi(String name);}
interface InterC2{ String hi();}
interface InterD2{ String hi(int num, String name);}
public class Lambda002 {
	public static void main(String[] args) {
		System.out.println("\n\n [Step1] 매개변수 X, 리턴값 X");
		// 1-1. 익명 객체 hi 출력
		InterA2 a = new InterA2() {

			@Override
			public void hi() {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
			
		}; a.hi();
		// 1-2. 람다식
		InterA2 a2 = () ->{System.out.println("hi");}; a2.hi();
		InterA2 a3 = () ->{System.out.println("hi");}; a2.hi();
		InterB2 b2 = (String name) -> {System.out.println("hi!" + name);}; b2.hi("sally");
		InterB2 b3 = (String name) -> {System.out.println("hi!" + name);}; b2.hi("buja");
		InterB2 b4 = (String name) -> {System.out.println("hi!" + name);}; b2.hi("빨강이");
		
		System.out.println("\n\n [Step] 매개변수 O, 리턴값 O");
		InterC2 c = new InterC2() {

			@Override
			public String hi() {
				// TODO Auto-generated method stub
				return "Good Day";
			}

		};
		System.out.println(c.hi());
		InterC2 c2 = () -> {return "Good Day";};
		System.out.println(c2.hi());
		InterC2 c3 = () -> {return "Good Day!";};
		System.out.println(c3.hi());
		
		System.out.println("\n\n [Step] 매개변수 O, 리턴값 O)");
		InterD2 d = new InterD2() {

			@Override
			public String hi(int num, String name) {
				// TODO Auto-generated method stub
				String star ="";
				for(int i=0; i<num; i++) {star+="★";}
				return "hi " + name + star;
			}

		}; 
		System.out.println(d.hi(1, "sally")); 
		System.out.println(d.hi(2, "sally"));
		InterD2 d2 = (int num, String name) -> {
			String star = "";
			for (int i = 0; i < num; i++) {
				star += "★";
			}
			return "hi " + name + star;
		};
		System.out.println(d2.hi(3, "alpha")); 
		System.out.println(d2.hi(4, "alpha")); 
		InterD2 d3 = (num, name) -> {
			String star = "";
			for (int i = 0; i < num; i++) {
				star += "★";
			}
			return "hi " + name + star;
		};
		System.out.println(d3.hi(5, "buja")); 
		System.out.println(d3.hi(6, "buja")); 
		InterD2 d4 = (num, name) -> {
			String star = "";
			for (int i = 0; i < num; i++) {
				star += "★";
			}
			return "hi " + name + star;
		};
	}
}