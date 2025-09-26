package com.company.java009_ex;

import java.util.Scanner;

class TV {
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + "]";
	}

	public TV(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}

	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}

	String channel;
	int volume;
	void show() {
		System.out.println(this.channel + "\t" + this.volume);
	}

	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("* channel 입력 > "); channel = scanner.next();
		System.out.println("* volume 입력 > "); volume = scanner.nextInt();
	}
}
public class ClassEx004 {
	public static void main(String[] args) {
		   TV  t1 = new TV("JDBC" , 8);
		   t1.show(); 
		   TV  t2 = new TV();
		   t2.input();  
		   t2.show();
}
}
