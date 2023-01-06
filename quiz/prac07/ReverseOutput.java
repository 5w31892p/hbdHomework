package com.sparta.hbdstudy.quiz.prac07;

import java.util.Scanner;

// 100개 정수 저장할 배열 선언
// 0 입력 받으면 입력 종료
// 0 제외 입력 받은 수를 가장 나중에 입력된 정수부터 차례대로 출력
public class ReverseOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[100];
		System.out.println("숫자를 입력하세요.");
		// 입력 받기
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			if (num[i] == 0) {
				break;
			}
		}
		// 출력하기
		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				System.out.println(num[i] + " ");
			}
	}
}
}
