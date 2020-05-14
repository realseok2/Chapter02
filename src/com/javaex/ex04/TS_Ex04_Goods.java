package com.javaex.ex04;

public class TS_Ex04_Goods {

	private String name;
	private int price;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void showInfo() {
		System.out.println("제품명 :  " + name + "\t\t\n" + "가격 :\t" + price + "원\n\n");
	}

}
