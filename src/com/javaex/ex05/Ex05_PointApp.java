package com.javaex.ex05;

public class Ex05_PointApp {

	public static void main(String[] args) {

		Ex05_Point camera = new Ex05_Point();
		Ex05_Point netbook = new Ex05_Point();
		Ex05_Point cup = new Ex05_Point();

		camera.setName("NIKON DSLR_380D");
		camera.setPrice(400000);
		camera.showInfo();

		netbook.setName("MacBook_Pro");
		netbook.setPrice(2980000);
		netbook.showInfo();

		cup.setName("와인잔");
		cup.setPrice(12900);
		cup.showInfo();

	}

}
