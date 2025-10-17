package com.company.java014_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class UserInfo2 {
	private int no;
	private  String name; 
    private  int age;
	public UserInfo2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
}
public class SetEx001 {
	public static void main (String[] args) {
		Set<UserInfo2> set1 = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요. > ");
		String name = scanner.next();
		set1.add(new UserInfo2(1, "아이언맨" , 50));
		set1.add(new UserInfo2(2, "헐크" , 40));
		set1.add(new UserInfo2(3, "캡틴" , 120));
		set1.add(new UserInfo2(3, "캡틴" , 120));
		System.out.println(set1.size());
		int sum = 0;
        for (UserInfo2 user : set1) {
            sum += user.getAge();
        }
        double avg = (double) sum / set1.size();

        System.out.println("전체 평균 나이: " + avg);
		Iterator<UserInfo2> iterator = set1.iterator();
        while (iterator.hasNext()) {
            UserInfo2 user = iterator.next();
            if (user.getName().equals(name)) {
            	System.out.println(user);
            	break;
            }
        }
        
	}
}
