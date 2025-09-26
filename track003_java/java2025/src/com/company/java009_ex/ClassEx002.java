package com.company.java009_ex;

import java.util.Scanner;

class MyPrice001{
	String name;
	int price;

	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품 이름 입력 > "); this.name = scanner.next();
		System.out.println("상품 가격 입력 > "); this.price = scanner.nextInt();
	}

	void show() {
		System.out.println("\n\n상품 정보입니다.");
		System.out.printf("상품 이름: %s / 상품 가격: %d", this.name, this.price );
	}
}

public class ClassEx002 {
	public static void main(String[] args) {
		MyPrice001 p1 = new MyPrice001();
		p1.name = "apple";
		p1.price = 1500;
		p1.input();
		p1.show();
	}

}
/* [runtime data area]
 * -----------------------------
 * [method: 정보, static, final : 공용 정보]
 *  MyPrice001.class, ClassEx002.class       클래스(설계도)           
 * -----------------------------             객체(p1) 인스턴스(p1.name="apple"/p1.price=1500)                                                         
 * [heap : 동적]      | [stack: 빌리기]
 *                                         p1.(){}
 * 1번지                                    p1.input(){}
 * {name=null, price=0, input(), show()} < p1            
 *         
 *                  | main   
 * ------------------------------                      
 */
