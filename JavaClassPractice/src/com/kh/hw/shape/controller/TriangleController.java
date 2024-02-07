package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	Shape s = new Shape();

	public double calcArea(double height, double width) {
		/*
		 * 모양 타입 번호와 받은 매개변수를 매개변수 있 는 생성자로 초기화 시킨 후 넓이 반환 넓이 : 너비 * 높이 / 2
		 */
		s.setHeight(height);
		s.setWidth(width);
		return height*width /2 ;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "삼각형 " + s.information();
	}

}
