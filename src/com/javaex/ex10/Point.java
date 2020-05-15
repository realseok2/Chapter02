package com.javaex.ex10;

public class Point {

	private int x;
	private int y;

//=================================================================	
	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//=================================================================
	// getter , setter

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

//=================================================================
	// 일반메소드
	public void draw() {
		System.out.println("점 [ x = " + x + ",\t y = " + y + " ] 을 그렸습니다.draw");
	}

	public void draw(boolean action) {
		if (action == true) {
			System.out.println("점 [ x = " + x + ",\t y = " + y + " ] 을 그렸습니다.boolean1");
		} else {
			System.out.println("점 [ x = " + x + ",\t y = " + y + " ] 을 지웠습니다.boolean2");
		}
	}

//=================================================================
	// toString
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
