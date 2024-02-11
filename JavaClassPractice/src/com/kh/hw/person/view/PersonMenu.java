package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	//메인 메뉴를 출력하는 메소드
	public void mainMenu() {
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			int count[] = pc.personCount();
			System.out.println("현재 저장된 학생은 " + count[0]+ "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + count[1]+ "명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			
			String menu = sc.nextLine();
		
			switch (menu) {
			case "1":
				studentMenu();
				break;
			case "2":
				employeeMenu();
				break;
			case "9":
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
			if(menu.equals("9")) {
				break;
			}
		}	
	}

	//학생 메뉴를 출력하는 메소드
	public void studentMenu() {
		while(true) {
			System.out.println("====학생 메뉴====");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 :");
			
			int count[] = pc.personCount();
			if(count[0] >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			
			String menu = sc.nextLine();
		
			switch (menu) {
			case "1":
				if(count[0] >= 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				insertStudent();
				break;
			case "2":
				printStudent();
				break;
			case "9":
				System.out.println("메인으로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
			if(menu.equals("9")) {
				break;
			}
		}	
	}

	//사원 메뉴를 출력하는 메소드
	public void employeeMenu() {
		while(true) {
			System.out.println("====사원 메뉴====");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 :");
			
			int count[] = pc.personCount();
			if(count[1] >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			
			String menu = sc.nextLine();
		
			switch (menu) {
			case "1":
				if(count[1] >= 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				insertEmployee();
				break;
			case "2":
				printEmployee();
				break;
			case "9":
				System.out.println("메인으로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
			if(menu.equals("9")) {
				break;
			}
		}	
	}

	//사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 :");
			String name = sc.nextLine();
			System.out.print("학생 나이 :");
			String sage = sc.nextLine();
			int age = Integer.parseInt(sage);
			System.out.print("학생 키 :");
			String sheight = sc.nextLine();
			double height = Double.parseDouble(sheight);
			System.out.print("학생 몸무게 :");
			String sweight = sc.nextLine();
			double weight = Double.parseDouble(sweight);
			System.out.print("학생 학년 :");
			String sgrade = sc.nextLine();
			int grade = Integer.parseInt(sgrade);
			System.out.print("학생 전공 :");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0] >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고\r\n" + "학생 메뉴로 돌아갑니다.");
				break;
			}
			else {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				String check = sc.nextLine();
				if(check.equals("N") || check.equals("n")) {
					break;
				}
			}
		}
	}
	
	//객체배열에 저장된 학생 데이터를 출력하는 메소드
	public void printStudent() {
		for(int i = 0; i < pc.personCount()[0]; i++) {
			System.out.println(pc.printStudent()[i]);
		}
	}

	//사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
	public void insertEmployee() {
		while(true) {
			System.out.print("사원 이름 :");
			String name = sc.nextLine();
			System.out.print("사원 나이 :");
			String sage = sc.nextLine();
			int age = Integer.parseInt(sage);
			System.out.print("사원 키 :");
			String sheight = sc.nextLine();
			double height = Double.parseDouble(sheight);
			System.out.print("사원 몸무게 :");
			String sweight = sc.nextLine();
			double weight = Double.parseDouble(sweight);
			System.out.print("사원 급여 :");
			String ssalary = sc.nextLine();
			int salary = Integer.parseInt(ssalary);
			System.out.print("사원 부서 :");
			String dept = sc.nextLine();
			
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1] >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고\r\n" + "사원 메뉴로 돌아갑니다.");
				break;
			}
			else {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				String check = sc.nextLine();
				if(check.equals("N") || check.equals("n")) {
					break;
				}
			}
		}
	}

	//객체배열에 저장된 사원 데이터를 출력하는 메소드
	public void printEmployee() {
		for(int i = 0; i < pc.personCount()[1]; i++) {
			System.out.println(pc.printStudent()[i]);
		}
	}
}
