package com.sparta.hbdstudy.homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        // 오답일 경우, 계속 문제 풀기
        // 정답일 경우, 코드 종료
        Scanner scanner = new Scanner(System.in);
        System.out.println("다음 중 프로그래밍 언어가 아닌것은?");
        System.out.println("1. Javascript\n2. Java\n3. 망둥어\n4. HTML");
        while (true) {
            int answer = scanner.nextInt();
            if (3 == answer) {
                System.out.println("정답입니다.");
                break;
            } else if (1 == answer || 2 == answer || 4 == answer) {
                System.out.println("오답입니다.");
                System.out.println("다시 입력해주세요.");
            } else {
                System.out.println("올바른 숫자가 아닙니다.");
                System.out.println("1~4까지의 숫자만 입력해주세요.");
            }
        }
//        while (true) {
//            int answer = scanner.nextInt();
//            switch (answer) {
//                case 3:
//                    System.out.println("정답입니다.");
//                    break;
//                case 1:
//                case 2:
//                case 4:
//                    System.out.println("오답입니다.\n다음 중 프로그래밍 언어가 아닌것은?");
//                    continue;
//                default:
//                    System.out.println("올바른 숫자를 입력해주세요.\n다음 중 프로그래밍 언어가 아닌것은?");
//                    continue;
//            }
//            break;
    }
}
