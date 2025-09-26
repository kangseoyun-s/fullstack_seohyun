package com.company.java009_ex;

import java.util.Scanner;

class Calc{
	int num1, num2;
	char op;
	double result;

	public Calc(int num1, int num2, char op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public Calc() {
		super();
		// TODO Auto-generated constructor stub
	}

	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n숫자 1 > ");
		num1 = scanner.nextInt();
		System.out.println("숫자 2 > ");
		num2 = scanner.nextInt();
		System.out.println("연산자 > ");
		op = scanner.next().charAt(0);
	}

	void opcalc() {
		if (this.op == '+') {
			this.result = this.num1 + this.num2;
		} else if (this.op == '-') {
			this.result = this.num1 - this.num2;
		} else if (this.op == '*') {
			this.result = this.num1 * this.num2;
		} else if (this.op == '/') {
			this.result = this.num1 / (double) this.num2;
		}
	}

	void show() {
		this.opcalc();
		if (this.op == '/') {
			System.out.printf("%d %c %d = %.2f", this.num1, this.op, this.num2, this.result);
		} else {
			System.out.printf("%d %c %d = %d", this.num1, this.op, this.num2, (int) this.result);
		}
	}
}
public class ClassEx007 {
	 public static void main(String[] args) {
		   Calc  c1= new Calc(10,3,'+');  
		   c1.show();
		   
		   Calc  c2= new Calc();  
		   c2.input();   
		   c2.show(); 
		    
		   }
	 
}
