package com.javaex.ex01;

public class GoodsApp {															//		3.			Goods 클래스로 인스턴스화 한다.

	public static void main(String[] args) {

		Goods camera = new Goods();									//		4.			camera 변수 선언 & 주소 대입
		
		camera.name = "NIKON";												//		5.			camera.name 값 대입
		camera.price = 400000;													//		6. 		camera.price 값 대입
		
		System.out.println(camera.name);							//		 7.		camera 정보 출력
		System.out.println(camera.price);							//		 7.		camera 정보 출력
		
	}

}
