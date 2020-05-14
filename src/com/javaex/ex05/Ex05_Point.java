package com.javaex.ex05;

public class Ex05_Point {

	private String name;
	private int price;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public void showInfo() {
		System.out.println("상품이름 : \t" + name + "\n" + "가격 : \t\t" + price + "원\n");
	}

}
