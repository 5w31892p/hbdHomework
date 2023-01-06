package com.sparta.hbdstudy.quiz.prac05;

import java.util.Scanner;

// n을 입력받아 1~n까지의 합 리턴
public class Prac05SumReturn {
    public static void sum(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += i;
        }
        System.out.println("1부터 입력해주신 " + n + "까지의 합은 " + ret + "입니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n값을 입력해주세요.");
        int k = scanner.nextInt();
        sum(k);
    }
}
