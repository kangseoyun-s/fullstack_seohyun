package com.company.java009_ex;

class Student001{
	String name ;
	int no, kor, eng, math ;
	void info() {System.out.println("이름: " + this.name);
	System.out.println("총점: " + (this.kor+this.eng+this.math));
	System.out.printf("%s%.2f", "평균: ", (this.kor+this.eng+this.math)/3.0);
	}
}
public class ClassEx001 {
	public static void main(String[] args) {
		 Student001   s1 = new Student001();
	     s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
	     s1.info();
	}

}
