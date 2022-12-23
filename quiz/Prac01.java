package com.sparta.hbdstudy.quiz;

import java.util.Scanner;

public class Prac01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 세개의 숫자를 각각 변수 선언하고 세수의 총합을 인쇄해보기
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b + c;
        System.out.println("a, b, c의 총합은 " + sum + "입니다.");
        System.out.println("a, b, c의 총합은 " + (a + b + c) + "입니다.");

        // 스캐너를 통해 가로와 세로를 입력받아 사각형의 넓이를 구해보기
        System.out.println("가로 길이를 입력해주세요.");
        int x = scanner.nextInt();
        System.out.println("세로 길이를 입력해주세요.");
        int y = scanner.nextInt();
        System.out.println("사각형의 넓이는 " + (x * y) +"입니다.");
        // 스캐너로 나이를 입력받아 내년 나이를 구해보기
        System.out.println("2022년 올해 당신의 나이는?");
        int nextYearAge = scanner.nextInt();
        System.out.println("2023년 내년 당신의 나이는 " + nextYearAge + "살 입니다.");

        // 두수를 입력받아 몫과 나머지 구하기
        System.out.println("첫번째 숫자를 입력해주세요.");
        int i = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요.");
        int j = scanner.nextInt();
        System.out.println("첫번째 숫자 ÷ 두번째 숫자의 몫 : " + i / j);
        System.out.println("첫번째 숫자 ÷ 두번째 숫자의 나머지 : " + i % j);

    }
}
