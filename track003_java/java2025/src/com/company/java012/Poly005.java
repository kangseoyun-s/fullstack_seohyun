package com.company.java012;
/*
    Object       
      ↑             
    Animal   
      ↑                                  
     Cat {String number; void show()}
*/
/*
	Object       
	  ↑             
	Animal   
	  ↑                                  
	 Person {String jumin; void show()}
*/
class Animal {
	String name;
	int age;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Object 컴파일러가 자동 생성 X → 오버로딩과 상속 시
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("Animal");
	}
}
class Cat extends Animal {
	String number;
	public void show() {
		System.out.println("CAT > " + super.name + "/" + super.age);
	}
}
class Person extends Animal {
	String jumin;
	public void show() {
		System.out.println("PERSON > " + super.name + "/" + super.age);
	}
}
public class Poly005 {
	public static void main(String[] args) {
		// 하나의 타입(부모)으로 여러 타입의 객체(자식)를 관리
		// 부모 = 자식 / 업캐스팅 / 타입캐스팅 X
		Animal [] anis = {new Cat(), new Cat(), new Person(), new Person()};
		// 1. 보장: {String name; int age; / show()}
		//					= new Cat(){number, @show()} - Animal{String name; int age; / show()}
		// 1. 보장: {String name; int age; / show()}
	    //					= new Person(){jumin, @show()} - Animal{String name; int age; / show()}
		Animal controller = null;
		controller = anis[0]; controller.show();
		controller = anis[1]; controller.show();
		controller = anis[2]; controller.show();
		controller = anis[3]; controller.show();
	}

}
