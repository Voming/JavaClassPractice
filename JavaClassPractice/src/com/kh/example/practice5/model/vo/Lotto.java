package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int[] lotto;

	{// 초기화 블럭 사용
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			/*
			 * Random rand = new Random(); //nextInt 은 멤버 메소드이기 때문에 new로 호출해주어야함 int su =
			 * rand.nextInt(45);		   //static이 아니기 때문
			 */
			int su = new Random().nextInt(45);

			if (i == 0) {
				lotto[i] = su;
			} else if (lotto[i] != lotto[i - 1]) { // 중복제거
				lotto[i] = su;
			}

			/*
			 * 랜덤 범위 지정 (int) (Math.random() * (최대값 - 최소값 +1) + 최소값 또는 (int) (Math.random()
			 * * 최대값) + 최소값 lotto[i] = (int) (Math.random() * (45 - 1 + 1)) + 1;
			 */

		}
	}

	public Lotto() {

	}

	public void information() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
