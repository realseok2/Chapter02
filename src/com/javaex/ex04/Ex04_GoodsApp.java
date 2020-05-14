package com.javaex.ex04;

public class Ex04_GoodsApp {

	public static void main(String[] args) {

		Ex04_Goods camera = new Ex04_Goods();
		Ex04_Goods cup = new Ex04_Goods();
		Ex04_Goods netbook = new Ex04_Goods();
		Ex04_Goods car = new Ex04_Goods();
		Ex04_Goods phone = new Ex04_Goods();


		camera.setName("NiKON DSLR_860X");
		camera.setPrice(1200000);
		camera.showInfo();
		
		cup.setName("소주잔");
		cup.setPrice(1500);
		cup.showInfo();
		
		netbook.setName("Mac Book");
		netbook.setPrice(2980000);
		netbook.showInfo();
		
		car.setName("Audi A7");
		car.setPrice(72900000);
		car.showInfo();
		
		phone.setName("iphone12Pro");
		phone.setPrice(1590000);
		phone.showInfo();
		
//		System.out.println(showInfo);
		
		System.out.println("=======================================");
		
		System.out.println("제품명 : " + camera.getName() + "\t\t가격 : " + camera.getPrice() + "원\n");
		System.out.println("제품명 : " + cup.getName() + "\t\t\t\t\t가격 : " + cup.getPrice() + "원\n");
		System.out.println("제품명 : " + netbook.getName() + "\t\t\t\t가격 : " + netbook.getPrice() + "원\n");
		System.out.println("제품명 : " + car.getName() + "\t\t\t\t\t가격 : " + car.getPrice() + "원\n");
		System.out.println("제품명 : " + phone.getName() + "\t\t\t가격 : " + phone.getPrice() + "원");
	
	}

}
