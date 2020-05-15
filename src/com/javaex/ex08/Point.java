package com.javaex.ex08;

public class Point {

	private int x;
	private int y;

	// 생성자
	public Point() {
		
	}

	public Point(int x, int y) {
		// 메모리에 올리기
		this.x = x;
		this.y = y;
	}

	// g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 일반메소드
	public void showInfo() {
		System.out.println("점 [ x = " + x + ", \t y =" + y + " ] 을 그렸습니다.");
	}

	// toString()
	public String toString() {
		return "Point 점 [ x = " + x + ", \t y =" + y + " ] 을 그렸습니다.";
	}
}

//alt + shift + s -> genrate getter and setter ->select all 하면 getter setter 생성
//
// 출력값 생성규칙 alt + shift + s -> generate toString() -> All select
//
//생성자규칙
//public TS_Ex07_Song() {
//			생성자는 메소드라고 생각하면 안되고
//			틀을 읽어서 메모리에 올리는 작업을 하는 역할을 맡고 있다.
//}
