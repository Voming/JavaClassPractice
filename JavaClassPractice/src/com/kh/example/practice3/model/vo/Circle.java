package com.kh.example.practice3.model.vo;

public class Circle {
	//static과 final이 둘다 있으면 반드시 명시적 초기화 해야함. 생성자 초기화 붚가
	private static final double PI = 3.14;
	private static int radius = 1;

	public Circle() {
	}
	
	public Circle(int radius) {
		Circle.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		Circle.radius = radius;
	}

	public void incrementRadius() {
		radius++;
	}

	public void getAreaOfCircle() {
		System.out.println("넓이 : " + (radius * radius * PI));
	}

	public void getSizeOfCircle() {
		System.out.println("둘레 : " + (radius * 2 * PI));
	}

}
