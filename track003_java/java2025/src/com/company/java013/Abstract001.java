package com.company.java013;
/*
 Abstract(is A) 일반 클래스 + 설계
  고양이는 동물이다
    개도  동물이다
   
        Animal
       ↑     ↑
      Cat    Dog
 */
abstract class Animal{ // 일반 클래스 + 설계
	String name;
	abstract void eat(); // 추상메서드 반드시 추상클래스로 변경
	abstract void sleep(); // 구현부 {}가 없는 애들
	abstract void poo(); //추상화, 일반화, 설계: 공통의 속성, 구체적인 내용이 없음
}
class Cat extends Animal{ // 구현 클래스

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "고양이 냠냠!");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "고양이 수면!");
	}

	@Override
	void poo() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "고양이 시원!");
	}
	
}
class Dog extends Animal{ // 구현 클래스

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "강아지 냠냠!");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "강아지 수면!");
	}

	@Override
	void poo() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "강아지 시원!");
	}
	
}
public class Abstract001 {
	public static void main(String[] args) {
		// 1. abstract class: 일반 클래스 + 설꼐
		// Animal ani = new Animal(); new 메모리 빌리고, 객체 생성 / Animal ()초기화, {}구현부 없음
		Animal ani = null;
		ani = new Cat(); // 부모 = 자식, 업캐스팅, 타입캐스팅 필요 없음
		ani.name="Sally";
		ani.eat();
		ani = new Dog(); // 부모 = 자식, 업캐스팅, 타입캐스팅 필요 없음
		ani.name="Alpha";
		ani.eat();
		//2. 사용 목적
		Animal [] arr = {new Cat(), new Cat(), new Dog(), new Dog()};
		int cnt =0;
		for(Animal a : arr) {a.name = "ani" + ++cnt; a.eat();}
	}

}

/*
        Object
          ↑
        Animal {name/eat,sleep,poo}
       ↑     ↑
      Cat    Dog {@eat,@sleep,@poo}
 */ 
  
  

