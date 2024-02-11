package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
	// 면적 : PI * 반지름 * 반지름
	public String calcArea(int x, int y, int radius) {
		return "면적 : " + x + ", " + y + ", " + radius + "/ " + (Math.PI * radius * radius);
	}

	// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환
	// 둘레 : PI * 반지름 * 2
	public String calcCircum(int x, int y, int radius) {
		return "둘레 : " + x + ", " + y + ", " + radius + "/ " + (Math.PI * radius * 2);
	}
}
