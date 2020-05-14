package com.javaex.ex01;

public class Ex01_GoodsApp {

	public static void main(String[] args) {													//		2.			main함수 스토리 쓰기

		
		Ex01_Goods camera = new Ex01_Goods();										//		3.			Goods 클래스로 인스턴스화 한다.

		
		camera.name = "NIKON";																			//		5.			camera.name 값 대입
		camera.price = 400000;																				//		4.			camera 변수 선언 & 주소 대입
																																		//		6. 		camera.price 값 대입
		
		
		System.out.println(camera.name);														//		 7.		camera 정보 출력
		System.out.println(camera.price);														//		 7.		camera 정보 출력
			
	}

}
