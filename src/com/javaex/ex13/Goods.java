package com.javaex.ex13;

public class Goods {

	private String name;
	private int price;
	private static int countGoods;
	
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.countGoods = this.countGoods + 1;
	}

	
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

	private int getCountGoods() {
		return countGoods;
	}

	private void setCountGoods(int countGoods) {
		this.countGoods = countGoods;
	}

	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countGoods=" + countGoods + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
