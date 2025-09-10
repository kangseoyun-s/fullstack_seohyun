package com.company.java005_ex;

public class ForEx008 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "\t");
		}

		{
			int i = 1;
			while (i <= 5) {
				System.out.print("\n" + i + "\t");
				i++;
			}
		}

		{
			int i = 1;
			do {
				System.out.print(i + "\t");
				i++;
			} while (i <= 5);
		}

		for (int i = 5; i >= 1; i--) {
			System.out.print("\n" + i + "\t");
		}

		{
			int i = 5;
			while (i >= 1) {
				System.out.print(i + "\t");
				i--;
			}
		}
		{
			int i = 5;
			do {
				System.out.print(i + "\t");
				i--;
			} while (i >= 1);
		}

		for (int i = 1; i <= 3; i++) {
			System.out.print("JAVA" + i + "\t");
		}

		{
			int i = 1;
			while (i <= 3)
				;
			{
				System.out.print("JAVA" + i + "\t");
				i++;
			}
		}
		{
			int i = 1;
			do {
				System.out.print("JAVA" + i + "\t");
				i++;
			} while (i <= 3);
		}
	}

}

