package com.sparta.hbdstudy.quiz;

import java.util.Scanner;

// 1. 가로세로 입력 받아 f1()으로 넓이 리턴
// 2. 실수 1개 입력 받아 f2()으로 절대값 리턴
// 3. 정수 1개 입력 받아 f3()으로 홀 짝 판별 후 리턴
public class Prac05ScannerMethod {
    public static int f1(int i, int j) {
        return i * j;
    }

    public static double f2(double i) {
        return Math.abs(i);

        // 아래는 튜터님 풀이
//        if (i < 0.0) {
//            i *= (-1.0);
//        }
//        System.out.println("절대값은 " + i);
    }

    public static void f3(int i) {
        if (i % 2 == 0) {
            System.out.println("짝수");
        }
        System.out.println("홀수");
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 넓이
        System.out.println("넓이를 구하고자 하는 사각형의 가로, 세로 값을 입력해주세요.");
        System.out.println("가로");
        int x = scanner.nextInt();
        System.out.println("세로");
        int y = scanner.nextInt();
        System.out.println("입력해주신 사각형의 넓이는 " + f1(x, y) + "입니다.");

        // 절대값
        System.out.println("절대값을 알고 싶은 실수를 입력해주세요.");
        double i = scanner.nextDouble();
        double result = Math.abs(i);
        System.out.println("입력해주신 실수 " + i + "의 절대 값은 " + f2(result) + "입니다.");

        // 홀짝
        System.out.println("정수를 입력하세요.");
        int j = scanner.nextInt();
        f3(j);
    }
}
