package com.company.java009_ex;

import java.util.Scanner;

class Coffee {
    int price, num;
    String name;

    // 기본 생성자
    public Coffee() {
        this.name = "아메리카노";
        this.price = 2000;
        this.num = 1;
    }

    // 매개변수가 있는 생성자
    public Coffee(String name, int price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }
	void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====커피");
		System.out.println("커피명: " + this.name);
		System.out.println("커피잔수: " + this.num);
		System.out.println("커피가격: " + (this.price*this.num));}
}
public class ClassEx003 {
	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼" ,4000, 2);  a1.show();
		   Coffee a2 = new Coffee();  a2.show();
	}

}
