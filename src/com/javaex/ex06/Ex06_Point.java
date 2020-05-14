package com.javaex.ex06;

public class Ex06_Point {

	private int x;
	private int y;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

//	public void showInfo() {
//		System.out.println("점 [ x = " + x + ",\ty = " + y + " ] 을 그렸습니다.");
		
	public void draw() {
		System.out.println("점 [ x = " + x + ",\ty = " + y + " ] 을 그렸습니다.");
	}

}
