package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods homeCom = new Goods();
		Goods homeDeco = new Goods();

		homeCom.name = "LG그램";
		homeCom.price = 900000;
		

		homeDeco.name = "머그컵";
		homeDeco.price = 2000;

		System.out.println("- 상품이름 : \"" + homeCom.name + "\", \t 가격 : " + homeCom.price);
		System.out.println("- 상품이름 : \"" + homeDeco.name + "\", \t \t 가격 : " + homeDeco.price);

	}

}
