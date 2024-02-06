package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public int x;
	Scanner sc = new Scanner(System.in);
	//메소드를 만들고 run에서 실행할 것
	public void method1(String name, char sex, int age, float height) {
		System.out.println("이름을 입력하세요 : " + name);
		System.out.println("성별을 입력하세요(남/여) : " + sex);
		System.out.println("나이를 입력하세요 : " + age);
		System.out.println("키를을 입력하세요(cm) : " + height);
		System.out.println("키 " + height + "cm인 " + age + "살" + sex + name + "님 반갑습니다^^");
	}
	
	public void method2() {
	
		System.out.print("첫 번째 정수 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int num2 = sc.nextInt();
		System.out.print("두 번째 정수 :");
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
	}
	
	public void method4() {
		System.out.println("4번 문제 실행중");
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
		
	}
}
