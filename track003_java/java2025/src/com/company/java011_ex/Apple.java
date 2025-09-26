package com.company.java011_ex;

public class Apple {
	private String name;
	private String order;
	private int num;
	private int price;

	public void show() {
		System.out.println("Apple [name=" + this.name + "," + "order=" + this.order + "," + "num=" + this.num + ","
				+ "price=" + this.price + "]");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Apple(String name, String order, int num, int price) {
		super();
		this.name = name;
		this.order = order;
		this.num = num;
		this.price = price;
	}

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";
	}

		}
