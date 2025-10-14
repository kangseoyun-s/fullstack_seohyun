package com.company.java014;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// 콜렉션프레임워크 - [배열]의 단점을 개선한 [객체]만 저장 가능 [동적배열]
// List, Set, Map
// List(기차) - index O, 중복 허용 O add / get(순서) / size / remove(순서) / contains
// Set(주머니) - index X, 중복 허용 X add / 향상된 for, iterator / size / remove(순서) / contains
class Candy{
	String name ; 
	int price;
	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candy(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Candy [name=" + name + ", price=" + price + "]";
	}
	// 1. Candy 클래스 확인 용도
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	// 2. 사용자가 넣어준 값 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
}
public class Set001 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);               // Integer e = 1 기본값
		set1.add(new Integer(1));  // Integer e = new Integer(1) (부품객체)
		set1.add(2);               // 부품 객체 = 기본값   (Integer - wrapper 클래스)
		set1.add(3);               // 기본값을 자동으로 - 객체화 - 부품객체
		                           // int -> Integer, float -> Float 오토 박싱
		System.out.println(set1); // [1,2,3]      
		
		Set<Candy> set2 = new HashSet<>();
		set2.add(new Candy("츄파춥스",300));
		set2.add(new Candy("츄파춥스",300));
		set2.add(new Candy("츄파춥스",300));
		set2.add(new Candy("청포도",4500));
		set2.add(new Candy("멘톨",5500));
		System.out.println(set2);
		System.out.println(set2.size());
	}

}
