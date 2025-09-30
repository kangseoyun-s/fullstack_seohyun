package com.company.java013_ex;

abstract class Astronaut{
	protected String name;
    protected int stamina;
    public void setName(String name) { this.name = name; }
    public void setStamina(int stamina) { this.stamina = stamina; }
    public void getName(String name) { this.name = name; }
    public int getStamina() { return stamina; }

    abstract void explore();
    abstract void report();
    abstract void rest();
}
class Engineer extends Astronaut{

	@Override
	void explore() {
		// TODO Auto-generated method stub
		System.out.print(name + " 엔지니어 탐사: 기계 장치 점검 완료!");
	}

	@Override
	void report() {
		// TODO Auto-generated method stub
		System.out.println(name + " 보고서: 에너지 시스템 안정적");
	}

	@Override
	void rest() {
		// TODO Auto-generated method stub
		 System.out.println(name + " 휴식: 공구 정리하며 재충전 중...");}
	
}
class Biologist extends Astronaut{

	@Override
	void explore() {
		// TODO Auto-generated method stub
		System.out.print(name + " 생물학자 탐사: 외계 식물 샘플 채취!");
	}

	@Override
	void report() {
		// TODO Auto-generated method stub
		System.out.println(name + " 보고서: 생명체 흔적 발견");
	}

	@Override
	void rest() {
		// TODO Auto-generated method stub
		System.out.println(name + " 휴식: 생체 리듬 조절 중...");
	}
	
}
class Pilot extends Astronaut{

	@Override
	void explore() {
		// TODO Auto-generated method stub
		System.out.print(name + " 파일럿 탐사: 항로 재설정 및 우주선 조종!");
	}

	@Override
	void report() { stamina -= (int)(Math.random() * 20 + 5);
		// TODO Auto-generated method stub
		 System.out.println(name + " 보고서: 궤도 진입 성공");
	}

	@Override
	void rest() {
		// TODO Auto-generated method stub
		System.out.println(name + " 휴식: 조종석에서 짧은 명상...");
	}
	
}
public class AbstractEx002 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Astronaut astro = new Astronaut();  // Q1. 왜 객체 생성이 불가능한가?
		// Astronaut에 구현부{}가 없어서
        System.out.println("\n--- 우주 탐사 대원 시뮬레이션 ---");
        Astronaut[] crew = { new Engineer(), new Biologist(), new Pilot() };
        String[] names = { "Nova", "Flora", "Jet" };
        int[] stamina = { 75, 60, 85 };
        
        // Q2. 체력이 낮은 대원만 휴식  70미만이 휴식을 취하게 만들기 
        for(int i=0; i<crew.length; i++) {
        	int stamina1 = stamina[i] -= (int)(Math.random() * 20 + 5); stamina[i] += 10;
        	crew[i].name = names[i];
        	crew[i].explore(); 
        	crew[i].stamina = stamina[i]; System.out.println(" 체력 " + stamina[i]);
        	crew[i].report();
        	if(stamina[i]>=70) {
        	 System.out.println(crew[i].name + "는 충분한 체력을 유지 중입니다.");
        	}
        	else {crew[i].rest();}
        }
	}

}

