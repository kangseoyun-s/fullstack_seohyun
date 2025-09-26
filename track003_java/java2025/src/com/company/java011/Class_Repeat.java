package com.company.java011;

//1. 클래스는 부품 객체
//2. 클래스 상태와 행위
/*                       기본값      명시적 초기화                초기화 블록        생성자
 (static)company         null   ="(주) 703toyland"      "(주) 703toyland"      X         Toy.name
 (static)num               0           X    0               O   0            X          Toy.age
 --------------------------------------------------------------------------------------------------------
      kitty {name=null, age=0}       유지                        유지          유지                      this.name
      Ryan  {name=null, age=0}       유지                        유지         {name="Ryan", age=10}     this.name
 */
// 1단계 [설계도]
/*
class toy{
	// 상태: 멤버 변수
	private String name ; // 인스턴스 - heap area - new O - 생성자 O - this
	private int age ;     // 인스턴스
	static final String company ="(주) 703toyland"; // Toy.company 클래스.변수, 클래스 변수 - method - new X - (now)
	static int num ;      // 클래스 변수(공용)
	// 행위: 멤버 함수
	public void show() {
		System.out.println("NAME: " + this.name);
		System.out.println("Age: " + this.age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public toy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public toy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
*/
public class Class_Repeat {
	public static void main(String[] args) {
		Toy kitty = new Toy(); // [장난감] 2단계    1) new 메모리, 객체 2) 생성자 3) kitty 번지
		//kitty.name="할로윈 키티"// [갖고 놀기] 3단계
		kitty.setName("할로윈 키티");
		kitty.setAge(3);
		kitty.show();
		// 1번지 가서 이름을 할로윈 키티로 설정, 나이를 3으로 설정
		Toy ryan = new Toy("라이언", 10);
		ryan.show();
	}

}
/*
 ----------------------------------------
 method [클래스 정보]
 > toy.class, Class_Repeat.class, toy.company="(주) 703toyland", toy.num=0
 ----------------------------------------
 heap [동적]            | stack[임시 저장 공간]
 2번지{name, age}       < ryan(2번지)
 1번지{name, age}       < kitty(1번지)
                       | main
 ----------------------------------------
  */
