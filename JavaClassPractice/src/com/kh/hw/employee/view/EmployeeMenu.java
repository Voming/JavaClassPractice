package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	// 메인 메뉴를 출력하는 기본 생성자
	public EmployeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가 ");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 누르세요 :");

			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				insertEmp();
				break;
			case "2":
				updateEmp();
				break;
			case "3":
				deleteEmp();
				break;
			case "4":
				printEmp();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("번호를 잘못입력했습니다.");
				break;
			}
			if (menu.equals("9")) {
				break;
			}
		}
	}

	// 저장할 데이터를 사용자에게 받는 메소드
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		String empNo = sc.nextLine();
		int iempNo = Integer.parseInt(empNo);

		System.out.print("사원 이름 :");
		String name = sc.nextLine();

		System.out.print("사원 성별 :");
		String gender = sc.nextLine();
		char cgender = gender.charAt(0);

		System.out.print("전화 번호 :");
		String phone = sc.nextLine();

		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		String pick = sc.nextLine();

		if (pick.equals("y") || pick.equals("Y")) {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();

			System.out.print("사원 연봉 :");
			String salary = sc.nextLine();
			int isalary = Integer.parseInt(salary);

			System.out.print("보너스 율 :");
			String bonus = sc.nextLine();
			double dbonus = Double.parseDouble(bonus);

			ec.add(iempNo, name, cgender, phone, dept, isalary, dbonus);
		} else {
			ec.add(iempNo, name, cgender, phone);
		}
	}

	// 수정할 데이터를 사용자에게 받는 메소드
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 메인메뉴 이동");
		System.out.println("메뉴 번호를 누르세요 :");

		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			System.out.print("수정할 전화번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case "2":
			System.out.print("수정할 사원 연봉 : ");
			String salary = sc.nextLine();
			int isalary = Integer.parseInt(salary);
			ec.modify(isalary);
			break;
		case "4":
			System.out.print("수정할 보너스 율 : ");
			String bonus = sc.nextLine();
			double dbonus = Double.parseDouble(bonus);
			ec.modify(dbonus);
			break;
		case "9":
			System.out.println("메인메뉴로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	// 데이터 삭제하는 메소드
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까? (y/n) :");
	
		String pick = sc.nextLine();

		if (pick.equals("y") || pick.equals("Y")) {
			ec.remove();
			if(ec.inform() == null) {
				System.out.println("데이터 삭제에 성공하였습니다.");
			}
		}
	}

	// 데이터 출력하는 메소드
	public void printEmp() {
		if(ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		}else {
			System.out.println(ec.inform());
		}
		
	}

}
