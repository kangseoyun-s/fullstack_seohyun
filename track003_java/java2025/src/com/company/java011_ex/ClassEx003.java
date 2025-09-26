package com.company.java011_ex;
/* 상속: 클래스의 재사용
 Object                                  Object                                  
 ↑                                         ↑
 Grand           {one, two}           Uncle, Aunt   
 ↑                        ↑
 Father          {three}   Uncle {one two four}
 
 */
class Grand extends Object {
    public void one() { System.out.println("grand : one"); }
    public void two() { System.out.println("grand : two"); }
	@Override
	public String toString() {
		return "Grand []";
	}
    
}

class Father extends Grand {
    public void three() { System.out.println("Father : three"); }

	@Override
	public String toString() {
		return "Father []";
	}
    
}
class Uncle extends Grand {
	@Override public void one() { System.out.println("Uncle : one"); }
	@Override public void two() { System.out.println("Uncle : two"); }
	public void four() { System.out.println("Uncle : four"); }
}
class Aunt {
	String name = "mimi";

	@Override
	public String toString() {
		return "Aunt [name=" + name + "]";
	} // object
	
}
public class ClassEx003 {
	public static void main(String[] args) {
		Father papa = new Father();
		papa.one(); papa.two(); papa.three();
		Uncle uncle = new Uncle();
		uncle.four(); uncle.one(); uncle.two();
		// Q1. uncle이 쓸 수 있는 메서드?
		// Uncle {one two four} → Grand {one, two}
		// Q2. 24번째 줄에서 출력되는 내용은?
		// Uncle : four
		// Uncle : one
		// Uncle : two
		// Q3. 18, 19번째의 개념은?
		// 오버라이드
	}

}
