package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		default:
			System.out.println("알맞은 값을 입력하세요/");
			break;
		}
	}

	public void practice3(){
		System.out.print("국어점수 : ");
		int score1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int score2 = sc.nextInt();
		System.out.print("영어점수 : ");
		int score3 = sc.nextInt();
		
		double average = (double)(score1 + score2 + score3)/3;
		
		System.out.println("합계 : " + (score1 + score2 + score3));
		System.out.println("평균 : " + average);
		
		if(score1 < 40 || score2 < 40 || score3 <40) {
			System.out.println("불합격입니다");
			return;
		}
		if(average > 60) {
			System.out.println("축하합니다 합격입니다.");
		}else {
			System.out.println("불합격입니다");
		}
	}
	
	public void practice5() {
		System.out.print("A연봉 : ");
		int score1 = sc.nextInt();
		System.out.print("B연봉 : ");
		int score2 = sc.nextInt();
		System.out.print("C연봉 : ");
		int score3 = sc.nextInt();
		
		System.out.println("a 연봉 + a: " + score1*1.4);
		System.out.println("a 연봉 + a: " + score2*1.15);
		System.out.println("a 연봉 + a: " + score3*1.15);
	}

}
