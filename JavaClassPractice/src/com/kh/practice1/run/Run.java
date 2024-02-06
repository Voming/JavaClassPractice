package com.kh.practice1.run;

//import com.kh.practice1.func.VariablePractice1;

public class Run {

	public static void main(String[] args) {
		/*String name = "아무개";
		char sex = '남';
		int age = 20;
		float height = 180.5f;
		new VariablePractice1().method1(name, sex, age, height);   //func 패키지의 함수를 가져와서 실행
		
		VariablePractice1 m1 = new VariablePractice1();
		m1.method1(name, sex, age, height);

		m1.x = 30;
		
		m1.method2();
		m1.method4();*/
		int a = 10;
		int b = ++a;
		System.out.println(a + ", " + b);

		int a2 = 10;
		int b2 = a2++;
		System.out.println(a2 + ", " + b2);
		System.out.println(a2 + b2);
	
	}
}
