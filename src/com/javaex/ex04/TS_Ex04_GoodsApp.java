package com.javaex.ex04;

public class TS_Ex04_GoodsApp {

	public static void main(String[] args) {

		TS_Ex04_Goods camera = new TS_Ex04_Goods();
		TS_Ex04_Goods netbook = new TS_Ex04_Goods();
		TS_Ex04_Goods cup = new TS_Ex04_Goods();

		camera.setName("NIKON");
		camera.setPrice(400000);
		camera.showInfo();

		netbook.setName("LG Gram");
		netbook.setPrice(900000);
		netbook.showInfo();

		cup.setName("와인잔");
		cup.setPrice(2500);
		cup.showInfo();

	}

}
