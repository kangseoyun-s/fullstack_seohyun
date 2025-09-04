package com.company.java004;

public class If001 {
	public static void main(String[] args) {
		int axe=1;
		System.out.println("1형식 - 조건을 무조건 읽음");
				//axe가 금도끼, 은도끼, 낡은 도끼
	if (axe==1) {System.out.println("금도끼");}
	if(axe== 2)	{System.out.println("은도끼");}
	if(axe== 3) {System.out.println("낡은 도끼");} 
	//2형식 else 뒤에는 조건이 못 옴
	System.out.println("2형식 - 맞다/틀리다");
	axe=2;
	if(axe==1) {System.out.println("금도끼");}
	else {System.out.println("금도끼가 아니다.");}
	//3형식
	System.out.println("다형식");
	axe=3;
	if (axe==1) {System.out.println("금도끼");}
	else if(axe== 2)	{System.out.println("은도끼");}
	else if(axe== 3) {System.out.println("낡은 도끼");} 
	else {System.out.println("모두 도끼가 아니다.");}
	}

}
