package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
			return;
		}
		System.out.println("양수가 아니다");
	}

	public void practice2() {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
			return;
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
	}

	public void practice3() {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수다");
			return;
		}
		System.out.println("홀수다");
	}
	
	public void practice4() {
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : "+ (candy % people));
	}
}
