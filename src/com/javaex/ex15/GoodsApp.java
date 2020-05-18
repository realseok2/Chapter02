package com.javaex.ex15;

public class GoodsApp {

	public static void main(String[] args) {

//		Goods computer = new Goods("LG그램", 400000);
//		computer.showInfo();
//		System.out.println(computer.toString());

		Goods[] goodsArray = new Goods[3];

		Goods camera = new Goods("NIKON", 400000);
		Goods cup = new Goods("MUG_CUP", 3000);
		Goods computer = new Goods("LG_Gram", 1000000);

		camera.showInfo();
		cup.showInfo();
		computer.showInfo();
		System.out.println("================================");
		
		goodsArray[0] = camera;
		goodsArray[1] = cup;
		goodsArray[2] = computer;
		
		for(int i = 0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
