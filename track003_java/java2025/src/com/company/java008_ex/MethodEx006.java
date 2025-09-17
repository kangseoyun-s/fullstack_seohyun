package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx006 {
	public static int process_total(int attack, int defense, int speed) {
		return attack + defense + speed;
	}

	public static float process_avg(int total) {
		return total / 3f;
	}

	public static String process_grade(float avg) {
		return avg >= 90 ? "S등급" : avg >= 80 ? "A등급" : avg >= 70 ? "B등급" : avg >= 60 ? "C등급" : "D등급";
	}

	public static String process_star(float avg) {
		String result = "";
		for (int i = 0; i < (int) (avg / 10); i++) {
			result += "★";
		}
		return result;
	}
	public static String process_quest(float avg) {
		return avg >= 90 ? "전설의 용 퇴치" : avg >= 80 ? "유적 탐사하기" : avg >= 70 ? "성 지키기" : avg >= 60 ? "고블린 잡기" : "슬라임 퇴치";
	}

	public static String process_type(int attack, int defense, int speed) {
		if (attack > defense && attack > speed) {
			return "마법사형";
		} else if (defense > attack && defense > speed) {
			return "전사형";
		} else {
			return "도적형";
		}
	}
	public static void main(String[] args) {
//		#### (1단계) 변수 선언  
//		아래와 같은 변수를 선언하세요:
//		- `String name` : 캐릭터 이름  
//		- `int attack, defense, speed` : 능력치  
//		- `int total` : 능력치 총합  
//		- `float avg` : 평균  
//		- `String grade, star, quest, type` : 등급, 별표, 퀘스트, 캐릭터 타입  
//		- `Scanner scanner` : 입력 도구
		String name ="";
		int attack, defense, speed ;
		int total ;
		float avg ;
		String grade, star, quest, type ="";
		Scanner scanner = new Scanner(System.in);
//		#### (2단계) 입력 처리  
//		사용자로부터 다음 정보를 입력받으세요:
//		- 캐릭터 이름
//		- 공격력 (0~100)
//		- 방어력 (0~100)
//		- 민첩성 (0~100)
		System.out.print("이름 > ");
		name = scanner.next();
		System.out.print("공격력 > ");
		attack = scanner.nextInt();
		System.out.print("방어력 > ");
		defense = scanner.nextInt();
		System.out.print("민첩성 > ");
		speed = scanner.nextInt();
//		#### (3단계) 메서드 작성 및 호출  
//		아래 기능을 각각 메서드로 작성하고, main 메서드에서 호출하세요:
//      public static 리턴값 메서드명 {처리}
//		public static int process_total(int attack, int defense, int speed) {return attack + defense + speed;}
//		public static float process_avg(int total) {return total/3f;}
//		public static String process_grade(float avg) {return avg>=90? "S등급": avg>=80? "A등급": avg>=70? "B등급": avg>=60? "C등급": "D등급}
//      public static String process_star(float avg) {String result ="";
//		for(int i=0; i<(int)(avg/10); i++){result+="★";}
//		return result;}}
//		public static String process_quest(float avg) {return avg>=90? "전설의 용 퇴치": avg>=80? "유적 탐사하기": avg>=70? "성 지키기": avg>=60? "고블린 잡기": "슬라임 퇴치"}
//		public static String process_type(int attack, int defense, int speed) {if(attack>defense,speed){return "마법사형";} else if(defense>attack,speed){return "전사형";} else {return "도적형"}}
//      public static String process_show(String name, int attack, int defense, int speed, int total, float avg, String grade, String star, String quest, String type){
//	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
//		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "캐릭터", "공격력", "방어력", "민첩성",
//		"총합", "평균", "등급", "랭킹", "추천 퀘스트", "캐릭터 타입");
//		System.out.println(
//			"--------------------------------------------------------------------------------------------\r\n");
//		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\t%-5s\n", name, attack, defense, speed, total, avg,
//			grade, star, quest, type);
//		System.out.println(
//				"--------------------------------------------------------------------------------------------");
//		}
//		| 기능 | 메서드명 | 설명 |
//		|------|----------|------|
//		| 총합 계산 | `process_total()` | 공격력 + 방어력 + 민첩성 |
//		| 평균 계산 | `process_avg()` | 총합 ÷ 3 |
//		| 등급 처리 | `process_grade()` | 평균에 따라 S~D 등급 |
//		| 별표 처리 | `process_star()` | 평균 점수대별 별 개수 |
//		| 퀘스트 추천 | `process_quest()` | 평균에 따라 추천 퀘스트 |
//		| 캐릭터 타입 | `process_type()` | 가장 높은 능력치 기준 |

		total = process_total(attack, defense, speed);
		avg = process_avg(total);
		grade = process_grade(avg);
		star = process_star(avg);
		quest = process_quest(avg);
		type = process_type(attack, defense, speed);
		process_show(name, attack, defense, speed,total, avg,
				grade, star, quest, type);
	}
	public static void process_show(String name, int attack, int defense, int speed, int total, float avg, String grade, String star, String quest, String type){
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "캐릭터", "공격력", "방어력", "민첩성",
		"총합", "평균", "등급", "랭킹", "추천 퀘스트", "캐릭터 타입");
		System.out.println(
			"--------------------------------------------------------------------------------------------\r\n");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\t%-5s\n", name, attack, defense, speed, total, avg,
			grade, star, quest, type);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		}

}
