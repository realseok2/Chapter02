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
		System.out.println("- 상품이름 : \"" + homeDeco.name + "\", \t 가격 : " + homeDeco.price);

//		Goods[] homeCom = new Goods[3];
//		Goods[] homeDeco = new Goods[3];
//
//		homeCom[0].name = "LG그램";
//		homeCom[0].price = 900000;
//
//		homeCom[1].name = "맥북";
//		homeCom[1].price = 2900000;
//
//		homeCom[2].name = "삼성이온";
//		homeCom[2].price = 1200000;
//
//		homeDeco[0].name = "머그컵";
//		homeDeco[0].price = 2000;
//
//		homeDeco[1].name = "소주잔";
//		homeDeco[1].price = 1500;
//
//		homeDeco[2].name = "와인잔";
//		homeDeco[2].price = 4500;
//
//		for (int i = 0; i <= 3; i++) {
//			System.out.println("- 상품이름 : \"" + homeCom[i].name + "\", \t 가격 : " + homeCom[i].price);
//		}
//
//		for (int j = 0; j <= 3; j++) {
//			System.out.println("- 상품이름 : \"" + homeDeco[j].name + "\", \t \t 가격 : " + homeDeco[j].price);
//		}

	}

}
