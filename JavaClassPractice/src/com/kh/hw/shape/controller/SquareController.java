package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	Shape s = new Shape();

	public double calcPerimeter(double height, double width) {
		/*
		 * 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 둘레 반환 둘레: 너비*2 + 높이*2
		 */
		s.setHeight(height);
		s.setWidth(width);
		return width * 2 + height * 2;
	}

	public double calcArea(double height, double width) {
		// 넓이 : 너비 * 높이
		s.setHeight(height);
		s.setWidth(width);
		return height * width;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "사각형 " + s.information();
	}

}
