package com.company.java014_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class IceCreamDTO {
	private String name;
	private int price;

	public IceCreamDTO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public IceCreamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name + "(" + price + "원)";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class ListEx003 {
	public static void main(String[] args) {
		List<IceCreamDTO> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("❄️🍦 Welcome to the Magical IceCream Land 🍦❄️  \r\n" + "✨ 오늘도 달콤한 하루가 시작됩니다! ✨  \r\n"
				+ "🛎️ 손님~ 어떤 아이스크림을 원하시나요? " + "--------------------------------------------------");
		while (true) {
			System.out.print("📋 메뉴판 \r\n" + "🍧 IceCream Menu 🍧  \r\n" + "1️ 아이스크림 추가\r\n" + "2️ 아이스크림 목록 보기\r\n"
					+ "3️ 아이스크림 제거\r\n" + "4️ 아이스크림 존재 확인\r\n" + "5️ 총 아이스크림 개수\r\n" + "0️ 종료\r\n" + "👉 선택:");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				// 아이스크림 추가: add() 메서드 사용
				System.out.print("🍨 아이스크림 이름: ");
				String name = scanner.next();
				System.out.print("💰 가격: ");
				int price = scanner.nextInt();
				list.add(new IceCreamDTO(name, price));
				System.out.println("✅ " + name + " 아이스크림이 추가되었습니다!\n");
				break;

			case 2:
				// 아이스크림 목록 보기: get() 메서드 사용
				System.out.println("📦 현재 아이스크림 목록:");
				if (list.size() == 0) {
					System.out.println("❌ 아이스크림이 없습니다.");
				} else {
					for (int i = 0; i < list.size(); i++) {
						System.out.println("- " + list.get(i));
					} // toString
				}
				System.out.println();
				break;
			// list.isEmpty() true false
			case 3:
				// 아이스크림 제거: removeIf() 사용
				System.out.print("🗑️ 제거할 아이스크림 이름 입력 (공백 없이): ");
				String removeName = scanner.next();
				boolean removed = list.removeIf(ice -> ice.getName().equalsIgnoreCase(removeName));
				if (removed) {
					System.out.println("🧹 아이스크림이 제거되었습니다!\n");
				} else {
					System.out.println("⚠️ 해당 이름의 아이스크림이 없습니다.\n");
				}
				break;
			// int find = -1;
			// for(int i = 0; i < list.size(); i++){
			// if(list.get(1).getName().equals(name)){find=i; break;}}
			// list.remove(find);
			case 4:
				// 아이스크림 존재 확인: stream().anyMatch() 사용
				System.out.print("🔍 확인할 아이스크림 이름 입력: ");
				String checkName = scanner.next();
				boolean exists = list.stream().anyMatch(ice -> ice.getName().equalsIgnoreCase(checkName));
				if (exists) {
					System.out.println("✅ 아이스크림이 존재합니다!\n");
				} else {
					System.out.println("❌ 아이스크림이 존재하지 않습니다.\n");
				}
				break;
			// boolean exists = false;
			// for(IceCreamDTO ice : list){
			// if(ice.getName().equals(name)) {exists=true;}}
			// System.out.println(exists? "✅ 아이스크림이 존재합니다!\n":"❌ 아이스크림이 존재하지 않습니다.\n");
			case 5:
				// 총 아이스크림 개수: size() 사용
				System.out.println("📊 총 아이스크림 개수: " + list.size() + "개\n");
				break;

			case 0:
				// 종료
				System.out.println("👋 아이스크림 가게를 닫습니다. 다음에 또 만나요!");
				break;

			default:
				System.out.println("⚠️ 잘못된 입력입니다. 다시 선택해 주세요.\n");
			}
			if (num == 0) {
				break;
			}
		}
	}

}



