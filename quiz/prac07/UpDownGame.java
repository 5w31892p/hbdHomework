package com.sparta.hbdstudy.quiz.prac07;

import java.util.Random;
import java.util.Scanner;

// 컴퓨터가 생각한 숫자 맞추기 (1~100사이)
// 정답보다 크다면 up, 작다면 down, 같다면 몇번째 정답 출력
public class UpDownGame {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		while (true) {
			System.out.println("숫자를 입력하세요.");
			// System.out.println(num); // cpu가 생성한 숫자 확인 가능

			int i = scanner.nextInt();
			if (num > i) {
				count++;
				System.out.println("up");
			}
			if (num < i) {
				count++;
				System.out.println("down");
			}
			if (num == i) {
				count++;
				System.out.println(count + "회째 정답!");
				break;
			}
		}
	}
}
