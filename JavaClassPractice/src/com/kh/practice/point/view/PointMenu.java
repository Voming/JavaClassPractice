package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	// 메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
	public void mainMenu() {
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");

			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				circleMenu();
				break;
			case "2":
				rectangleMenu();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("올바른 번호를 입력하세요.");
				break;
			}
			
			if(menu.equals("9")) {
				break;
			}
		}
	}

	// 원 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 :");

		String menu = sc.nextLine();

		switch (menu) {
		case "1":
			calcCircum();
			break;
		case "2":
			calcCircleArea();
			break;
		case "9":
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("올바른 번호를 입력하세요. 메인으로 돌아갑니다.");
			break;
		}
	}

	// 사각형 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 :");

		String menu = sc.nextLine();

		switch (menu) {
		case "1":
			calcPerimeter();
			break;
		case "2":
			calcRectArea();
			break;
		case "9":
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("올바른 번호를 입력하세요. 메인으로 돌아갑니다.");
			break;
		}
	}

	// X, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
	public void calcCircum() {
		System.out.print("X 좌표 : ");
		String sx = sc.nextLine();
		int x = Integer.parseInt(sx);
		System.out.print("Y 좌표 : ");
		String sy = sc.nextLine();
		int y = Integer.parseInt(sy);
		System.out.print("반지름 : ");
		String srd = sc.nextLine();
		int rd = Integer.parseInt(srd);

		System.out.println(cc.calcCircum(x, y, rd));
	}

	// X, y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
	public void calcCircleArea() {
		System.out.print("X 좌표 : ");
		String sx = sc.nextLine();
		int x = Integer.parseInt(sx);
		System.out.print("Y 좌표 : ");
		String sy = sc.nextLine();
		int y = Integer.parseInt(sy);
		System.out.print("반지름 : ");
		String srd = sc.nextLine();
		int rd = Integer.parseInt(srd);

		System.out.println(cc.calcArea(x, y, rd));
	}

	// X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 둘레 출력
	public void calcPerimeter() {
		System.out.print("X 좌표 : ");
		String sx = sc.nextLine();
		int x = Integer.parseInt(sx);
		System.out.print("Y 좌표 : ");
		String sy = sc.nextLine();
		int y = Integer.parseInt(sy);
		System.out.print("높이 : ");
		String sh = sc.nextLine();
		int h = Integer.parseInt(sh);
		System.out.print("너비 : ");
		String sw = sc.nextLine();
		int w = Integer.parseInt(sw);

		System.out.println(rc.calcPerimeter(x, y, h, w));
	}

	// X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 넓이 출력
	public void calcRectArea() {
		System.out.print("X 좌표 : ");
		String sx = sc.nextLine();
		int x = Integer.parseInt(sx);
		System.out.print("Y 좌표 : ");
		String sy = sc.nextLine();
		int y = Integer.parseInt(sy);
		System.out.print("높이 : ");
		String sh = sc.nextLine();
		int h = Integer.parseInt(sh);
		System.out.print("너비 : ");
		String sw = sc.nextLine();
		int w = Integer.parseInt(sw);

		System.out.println(rc.calcArea(x, y, h, w));
	}

}
