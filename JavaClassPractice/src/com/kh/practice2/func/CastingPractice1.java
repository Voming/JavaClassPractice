package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	Scanner sc = new Scanner(System.in);

	public void method1() {
		System.out.print("문자 : ");
		char c = sc.next().charAt(0); // char 형식으로 받아오는 법
		System.out.println("A unicode : " + (int) c);
	}

	public void method2() {
		System.out.print("국어 : ");
		double score1 = sc.nextInt();
		System.out.print("영어 : ");
		double score2 = sc.nextInt();
		System.out.print("수학 : ");
		double score3 = sc.nextInt();

		System.out.println("총점 : " + (score1 + score2 + score3));
		System.out.println("편균 : " + ((score1 + score2 + score3) / 3));
	}

	public void method3() {
		int iNum1 = 10;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A';

		System.out.println((int) dNum); // 2
		System.out.println((double) iNum1); // 10.0
		System.out.println(dNum); // 2.5
		System.out.println((int) fNum); // 3
		System.out.println((double) iNum1 / fNum); // 3.3333333333333335
		System.out.println(ch); // A
		System.out.println((int) ch); // 65
		System.out.println((int) ch + iNum1);// 75
		System.out.println((char) ((int) ch + iNum1));// K
	}
}
