package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	// 삼각형과 사각형을 선택하게 하는 메소드
	public void inputMenu() {
		/*
		 * ===== 도형 프로그램 ===== 3. 삼각형 ==> triangleMenu() 4. 사각형 ==> squareMenu() 9. 프로그램
		 * 종료 => “프로그램 종료” 출력 후 프로그램 종료 메뉴 번호 : 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후
		 * 반복
		 */
		int falutCount = 0;

		while (true) { // 반드시 break가 필요
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
			
			if (menu == 9) {
				System.out.println("종료");
				break;
			} else {
				switch (menu) {
				case 3:
					falutCount = 0;
					triangleMenu();
					break;
				case 4:
					falutCount = 0;
					squareMenu();
					break;
				default:
					falutCount++;
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
					break;
				}
				
				if(falutCount > 5) {
					System.out.println("방법을 다시 확인해주세요.");
					falutCount = 0;
					break;
				}
			}
		}
	}

	// 삼각형 메뉴 출력 메소드
	public void triangleMenu() {
		/*
		 * ===== 삼각형 ===== 1. 삼각형 면적 ==> inputSize() 2. 삼각형 색칠 ==> inputSize() 3. 삼각형 정보
		 * ==> printInformation() 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로 메뉴 번호 : 잘못
		 * 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		 */

		while (true) { // 반드시 break가 필요
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 :");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				inputSize(3, 1);
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	// 사각형 메뉴 출력 메소드
	public void squareMenu() {
		/*
		 * ===== 사각형 ===== 1. 사각형 둘레 ==> inputSize() 2. 사각형 면적 ==> inputSize() 3. 사각형 색칠
		 * ==> inputSize() 4. 사각형 정보 ==> printInformation() 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력
		 * 후 inputMenu()로 메뉴 번호 : 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		 */
		while (true) { // 반드시 break가 필요
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 :");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				inputSize(4, 1);
				break;
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printInformation(4);
				scr.print();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	// 너비와 높이를 받아 요청 사항을 처리하거나 색깔 을 받아 요청사항을 처리 하는 메소드
	public void inputSize(int type, int menuNum) {
		// 매개변수로 들어온 type과 menuNum의 숫자에 따라 출력이 달라짐
		double height;
		double width;
		String color;

		if (type == 3) { // 삼각형일때
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
				break;
			case 2:
				System.out.print("색깔을 입력하세요 : ");
				color = sc.nextLine();
				color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				break;
			default:
				break;
			}
		} else if (type == 4) {// 사각형일때
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
				break;
			case 2:
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("사각형 면적 : " + scr.calcArea(height, width));
				break;
			case 3:
				System.out.print("색깔을 입력하세요 : ");
				color = sc.nextLine();
				color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				break;
			default:
				break;
			}
		}
	}

	// 매개변수에 따라 삼각형/ 사각형의 정보를 출력하 는 메소드
	public void printInformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(tc.print());
		}
	}
}
