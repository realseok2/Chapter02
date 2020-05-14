package com.javaex.ex04;

public class Ex04_Goods {

//===============================================================//

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
		System.out.println("*상품명 : " + name + "\t\t*가격 : " + price + "원\n");
	}

//===============================================================//

}
