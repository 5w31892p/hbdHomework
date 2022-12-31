package com.sparta.hbdstudy.quiz;

import java.util.Scanner;

public class Prac04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1~10까지 더하기
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);
        // for-each문
        String [] seasons = {"봄", "여름", "가을", "겨울"};
        for (String season : seasons) {
            System.out.println(season);
        }
        // 정수를 입력받아 홀수의 갯수를 구하는 프로그램
        System.out.println("정수를 입력해주세요.");
        int num = scanner.nextInt();
        System.out.println("-----------------");
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                cnt++;
            }
        }
        System.out.println("입력해주신 정수 " + num + " 홀수의 갯수는 " + cnt + "개 입니다.");

        int i = 0;
        while (i <= num) {
            if (i % 2 == 1) {
                cnt++;
            }
            i++;
        }
        System.out.println("입력해주신 정수 " + num + " 홀수의 갯수는 " + cnt + "개 입니다.");


        // 자연수 n을 입력받아 n까지 짝수의 합을 구하는 프로그램을 구현하세요.
        System.out.println("자연수 n을 입력해주세요.");
        int n = scanner.nextInt();
        System.out.println("--------------------");
        int ssum = 0;
        for (int j = 0; j <= n; j++) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println("입력해주신 자연수 " + n + " 짝수의 합은 " + ssum + "입니다.");

        int k = 0;
        while (k <= n) {
            k++;
            if (k % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("입력해주신 자연수 " + n + " 짝수의 합은 " + sum + "입니다.");


        // 숫자 10개를 입력받아 짝수와 홀수의 개수를 구하는 프로그램
        System.out.println("숫자 10개를 입력해주세요.");
        int even = 0;
        int odd = 0;
        for (int x = 0; x < 10; x++) {
            System.out.println((x + 1) + "번째 숫자");
            int nums = scanner.nextInt();
            if (nums % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            System.out.println("입력해주신 10개 숫자 중 짝수의 개수 : " + even + "개, 홀수의 개수 : " + odd + "개 입니다.");
        }


        int y = 0;
        while (y < 10) {
            System.out.println((y + 1) + "번째 숫자");
            int numm = scanner.nextInt();
            if (numm % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            i++;
        }
        System.out.println("입력해주신 10개 숫자 중 짝수의 개수 : " + even + "개, 홀수의 개수 : " + odd + "개 입니다.");


        // 구구단 (2~9단) 까지 출력
        for (int w = 2; w < 10; w++) {
            for (int q = 1; q < 10; q++) {
                System.out.print( w + " * " + q + " = " + (w*q) + "\t");
            }
            System.out.println("");
        }


        int h = 2;
        while (true) {
            if (h >= 10) {
                break;
            }
            for (int j = 1; j < 10; j++) {
                System.out.print(h + " * " + j + " = " + (h * j) + "\t");
            }
            h++;
            System.out.println("");
        }
    }
}
