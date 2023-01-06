package com.sparta.hbdstudy.quiz.prac07;

// 가위 1, 바위 2, 보 3

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Random random = new Random();
		int cpu = random.nextInt(3) + 1;
		System.out.println("CPU : " +cpu);

		Scanner scanner = new Scanner(System.in);
		System.out.print("가위[1], 바위[2], 보[3] : " );
		int user = scanner.nextInt();

		if (cpu == 1 && user == 2 || cpu == 2 && user == 3 || cpu == 3 && user == 1) {
			System.out.println("이겼습니다.");
		} else if (cpu == user) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
	}
}
