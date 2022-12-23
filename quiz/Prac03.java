package com.sparta.hbdstudy.quiz;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Prac03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 나이 25, 19 이상이면 성인, 미만이면 청소년입니다.
        //if문으로
        int age = 25;
        if (age >= 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("청소년입니다.");
        }

        // 위 질문을 삼항연산자로
        String result = age >= 19 ? "성인" : "애기";
        System.out.println(result);

        // 점수 입력 받아 100이하 90초과 A, 90이하 80초과 B, 80이상 70초과 C, 나머지 F
        // if문으로
        System.out.println("점수를 입력하세요.");
        int score = scanner.nextInt();
        if (score <= 100 && score > 90) {
            System.out.println("A");
        } else if (score <= 90 && score > 80) {
            System.out.println("B");
        } else if (score <= 80 && score > 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        // switch문으로
        switch (score/10) {
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
        }

        // 윤년 평년 판별하기
        // 4로 나눠 떨어지고, 100으로 나눴을 때 나눠떨어지지 않거나, 400으로 나눴을 때 나눠떨어지는 것이 윤년 -> isLeapYear
        System.out.println("평년인지 윤년인지 판별할 년도를 입력해주세요.");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (isLeapYear) {
            System.out.println("입력해주신 " + year + "년도는 윤년입니다.");
        } else {

            System.out.println("입력해주신 " + year + "년도는 평년입니다.");
        }


        // 년도와 월을 입력 받아 그 달의 마지막 날짜 출력
        System.out.println("출력하고 싶은 마지막 날짜의 연도와 달을 입력해주세요.");
        System.out.println("연도");
        int year = scanner.nextInt();
        System.out.println("달");
        int month = scanner.nextInt();
        int day;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    day = 29;
                } else {
                    day = 28;
                }
                // 아래는 삼항연산자로
//                day = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
                break;
            default:
                day = 0;
                break;
        }
        if (day == 0) {
            System.out.println("존재하지 않는 달 입니다.");
        } else {
            System.out.println("입력해주신 " + year + "년 " + month + "월의 마지막 날짜는 " + day + "일 입니다.");
        }

        // 오답일 경우 계속 문제 풀기 및 정답일 경우 코드 종료
        System.out.println("다음 중 프로그래밍 언어가 아닌것은?");
        System.out.println("1. Javascript\n2. Java\n3. 망둥어\n4. HTML");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == 1 || answer == 2 || answer == 4) {
                System.out.println("오답\n다시입력해주세요.");
            } else if (answer == 3) {
                System.out.println("정답");
                break;
            } else {
                System.out.println("보기에 있는 숫자를 입력해주세요.");
            }
        }
    }
}
