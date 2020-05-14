package com.javaex.ex05;

public class TS_Ex05_Point {

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

	public void draw() {
		System.out.println("점 [ x = " + x + ", \ty =" + y + " ] 을 그렸습니다.");
	}

}
