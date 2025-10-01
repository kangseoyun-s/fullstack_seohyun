package com.company.java013_ex;

import java.time.LocalDate;

interface Launch {
    int MONEY = 10000;
    void eat();
}
class Burger      implements Launch{ 
   int price;
   public Burger() { this.price = 3900; }
   @Override public String toString() { return "Burger"; }
   @Override public void eat() { System.out.println("Burger 냠냠!"); } 
}
class KimchiStew  implements Launch{ 
   int price;
   public KimchiStew() { this.price = 4000; }
   @Override public String toString() { return "KimchiStew"; }
   @Override public void eat() { System.out.println("KimchiStew 냠냠!"); } 
}
class User {  
    int money;
    int cnt;
    Launch[] plate;
    public void order(Launch a) {
        int price =0;
        if (a instanceof Burger) {
            price = ((Burger) a).price;
        } else if (a instanceof KimchiStew) {
            price = ((KimchiStew) a).price;
        }

        if (money < price) {
            System.out.println("잔액 부족으로 주문할 수 없습니다: " + a.toString());
        } else {
            plate[cnt] = a;
            money -= price;
            cnt++;
            System.out.println("주문 성공: " + a.toString());
        }
    }

    public void show() {
        System.out.println("===== 주문 내역 =====");
        int total = 0;
        for (int i = 0; i < cnt; i++) {
            Launch item = plate[i];
            System.out.println("- " + item.toString());
            item.eat();

            if (item instanceof Burger) {
                total += ((Burger) item).price;
            } else if (item instanceof KimchiStew) {
                total += ((KimchiStew) item).price;
            }
        }

        System.out.println("총 주문 금액: " + total + "원");
        System.out.println("잔액: " + money + "원");

        LocalDate today = LocalDate.now();
        System.out.println("주문 날짜: " + today);
    }
}

//- order(Launch a) 메서드로 메뉴 주문
//  주문 시 메뉴 종류에 따라 가격 확인
//  잔액 부족 시 주문 거절
//  주문 성공 시 배열에 저장
//- show() 메서드로 주문 내역 출력
//  주문한 메뉴 목록
//  총 주문 금액
//  잔액
//  오늘 날짜
//  각 메뉴의 eat() 호출

// }
public class InterfaceEx003 {
	public static void main(String[] args) {
		 User launch_order = new User();
         //리턴값 메서드명(파라미터)
         launch_order.order(new Burger());   //void order(Launch a){}
         launch_order.order(new KimchiStew());   //Launch a = new Kimchi()  부모=자식
         launch_order.order(new Burger());   //Launch a = new Burger()  부모=자식
       
         launch_order.show();//리턴값 메서드명(파라미터)

	}

}
