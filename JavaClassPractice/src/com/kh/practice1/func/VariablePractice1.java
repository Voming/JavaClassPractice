package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public Scanner sc = new Scanner(System.in);

	public void method1() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다^^", height, age, gender, name);
	}

	public void method2() {
		System.out.print("첫번째 변수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 변수 : ");
		int num2 = sc.nextInt();

		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2)); // 자동으로 int로 형변한되어 소수점은 보이지 않음
		System.out.println("나누기 결과 : " + ((double) num1 / num2)); // 소수점이 보임
	}

	public void method3() {
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();

		System.out.println("면적 : " + (width * height));
		System.out.println("빼기 결과 : " + (width * 2 + height * 2));
	}
	
	public void method4() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫번째 문자 : "+str.charAt(0));
		System.out.println("두번째 문자 : "+str.charAt(1));
		System.out.println("세번째 문자 : "+str.charAt(2));
	}
}
