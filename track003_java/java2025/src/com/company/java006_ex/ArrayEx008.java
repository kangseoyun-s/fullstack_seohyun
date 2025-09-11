package com.company.java006_ex;

public class ArrayEx008 {
	public static void main(String[] args) {
		String [] name = {"아이언맨","헐크","캡틴","토르","호크아이"};
		int [] kor={100,20,90,70,35};   
	    int [] eng={100,50,95,80,100};
	    int [] mat={100,30,90,60,100};
	    int [] aver=new int[5];
	    String [] j = new String[5];
	    String [] h = new String[5];
		for (int i = 0; i <= 4; i++) {
			aver[i] = (kor[i] + eng[i] + mat[i]) / 3;
		}
		for (int i = 0; i <= 4; i++) {
			if (aver[i] >= 60) {j[i]="합격";
			} else {j[i]="불합격";}
		}
		for (int i = 0; i <= 4; i++) {
			if (aver[i] >= 95) {h[i]="장학생";
			} else {h[i]="----";}
		}

		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "이름", "국어", "영어", "수학", "평균",
				"합격 여부", "장학생");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i = 0; i <= 4; i++) {
			System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5s\t%-5s\n", name[i], kor[i], eng[i],
					mat[i], aver[i], j[i], h[i]);
		}
	}

}
