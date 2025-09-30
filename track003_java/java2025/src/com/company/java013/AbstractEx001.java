package com.company.java013;
/*
 Abstract: 일반 클래스 + 설계
                    Object
                      ↑
                    Robot {abstract charge(), move(), speak()}
        ↑             ↑            ↑
  CleaningRobot SecurityRobot CookingRobot
  {@charge(),      {@charge(),   {@charge(),
    @move(),         @move(),      @move(),
    @speak()}        @speak()}     @speak()}
 
 */
abstract class Robot{
	String model; int batteryLevel;
	abstract void charge();
	abstract void move();
	abstract void speak();
}
class CleaningRobot extends Robot{

	@Override
	void charge() {
		// TODO Auto-generated method stub
		System.out.print("청소로봇 충전 중... 배터리 ");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("청소로봇: 먼지를 제거합니다!");
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println("청소 로봇: 청소 중입니다...");
	}
	
}
class SecurityRobot extends Robot{

	@Override
	void charge() {
		// TODO Auto-generated method stub
		System.out.print("경비로봇 태양광 충전 중... 배터리 ");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("경비로봇: 이상 없음. 안전 확보!");
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println("경비 로봇: 현재 이상 없습니다.");
	}
	
}
class CookingRobot extends Robot{

	@Override
	void charge() {
		// TODO Auto-generated method stub
		System.out.print("요리로봇 인덕션 충전 중... 배터리 " );
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("요리로봇: 오늘의 메뉴는 파스타입니다!");
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println("요리 로봇: 요리 만드는 중...");
	}
	
}
public class AbstractEx001 {
	public static void main(String[] args) {
		// Robot robot = new Robot(); 실행 불가능 이유: 구현부가 없어서
		System.out.println("--- 로봇 배열 시뮬레이션 ---");
		Robot [] bots = {new CleaningRobot(), new SecurityRobot(), new CookingRobot()};
		int [] levels = {50, 75, 90};
		for(int i=0; i<bots.length; i++) {
			bots[i].model = "Robo" + (i+1);
			bots[i].batteryLevel = levels[i];
			bots[i].charge(); System.out.println(bots[i].batteryLevel + "%");
			bots[i].speak();
		}
		// bots[0] = 1번지 CleaningRobot{@charge(), @move(), @speak()} -
		// Robot{model,batteryLevel/charge(), move(), speak()}
		// bots[1] = 2번지 SecurityRobot{@charge(), @move(), @speak()} -
		// Robot{model,batteryLevel/charge(), move(), speak()}
		// bots[2] = 3번지 CookingRobot{@charge(), @move(), @speak()} -
		// Robot{model,batteryLevel/charge(), move(), speak()}
	}

}
/*
  method area: 클래스 정보
  heap area: 동적, 배열               stack area: 암시
  1번지{model, battery, charge()X} ← robot(1번지)
 
 */
 