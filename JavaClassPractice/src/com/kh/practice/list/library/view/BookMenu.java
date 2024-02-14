package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	// 사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행.
	// 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 선택 :");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				insertBook();
				break;
			case "2":
				selectList();
				break;
			case "3":
				searchBook();
				break;
			case "4":
				deleteBook();
				break;
			case "5":
				ascBook();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
			if(menu.equals("9")) {
				break;
			}
		}

	}

	// 도서 추가를 위해 정보를 받는 메소드
	public void insertBook() {
		System.out.println("=====새 도서 추가=====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 :");
		String titile = sc.nextLine();
		System.out.print("저자 명 :");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) :");
		String category = sc.nextLine();
		int categoryNum = Integer.parseInt(category);
		System.out.print("가격 :");
		String sPrice = sc.nextLine();
		int price = Integer.parseInt(sPrice);
		
		String tCate;
		switch (categoryNum) {
		case 1:
			tCate = "인문";
			break;
		case 2:
			tCate = "과학";
			break;
		case 3:
			tCate = "외국어";
			break;
		case 4:
			tCate = "기타";
			break;

		default:
			tCate = "";
			break;
		}
		
		bc.insertBook(titile, author, tCate, price);
		bc.insertBookList();
	}

	// 전체 도서 목록 출력 성공을 알리는 메소드
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		System.out.println(bc.selectList());
	}

	// 특정 도서 검색 결과를 보여주는 메소드
	public void searchBook() {

	}

	// 특정 도서 삭제 성공을 알리는 메소드
	public void deleteBook() {

	}

	// 책 명 오름차순 정렬 성공을 알리는 메소드
	public void ascBook() {

	}
}
