package com.company.java009_ex;

class Score {
	@Override
	public String toString() {
		return "Score [stdid=" + stdid + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}

	public Score(String stdid, int kor, int eng, int math) {
		super();
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total();
		avg();
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	String stdid;
	int kor, eng, math, total;
	double avg;

	void total() {
		total = kor + eng + math;
	}

	void avg() {
		avg = total / 3.0;
	}

	void info() {
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "학번", "kor", "eng", "math", "total", "avg");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5.2f\n", stdid, kor, eng, math, total, avg);
	}
}
public class ClassEx006 {
	public static void main(String[] args) {
		   Score s1= new Score("std1234" , 100, 100 , 99); 
		   s1.info();
		   }

}
