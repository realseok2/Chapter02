package com.javaex.ex08;

public class PointApp {

	public static void main(String[] args) {

		// default 생성자를 이용해서 인스턴스 생성 --> set, get 이용
		// setter로 데이터 입력
		// toString() 확인
		Point p1 = new Point();
		
		p1.setX(5);
		p1.setY(5);
		System.out.println(p1.toString());

//======================================================================

		// x, y 같이 세팅하는 생성자를 이용 --> 추가로 만들어야 함
		// toString() 확인 <-- default 생성자 오류 확인
		Point p2 = new Point(10, 10);
		System.out.println(p2.toString());

		// 오류제거 --> default 생성자를 만든다

	}

}
