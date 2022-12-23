package com.sparta.hbdstudy.quiz;

import java.util.*;
import java.util.stream.Stream;

public class Prac02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 문자를 숫자로
        System.out.println("아스키코드를 알고 싶은 문자를 입력하세요.");
        char str = scanner.nextLine().charAt(0);
        int intstr = (int) str;

        System.out.println("입력해주신 문자 '" + str + "'의 아스키 코드는 " + intstr + "입니다.");

        // 과일 목록 차례대로 인쇄하기 - 반복문과 함께
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }
        // 숫자 5개 띄어쓰기로 입력 받아 거꾸로 출력
        System.out.println("숫자 5개를 띄어쓰기로 구분하여 입력하여 주세요.");
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            System.out.println(num[i]);
        }
        System.out.println(Arrays.toString(num));

        for (int i = num.length -1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        // 랜덤으로 정수 10개 저장 후 최소값 출력, 몇개?

        int[] datas = new int[10];
        Random rand = new Random();
        for (int i = 0; i < datas.length; i++) {
            datas[i] = rand.nextInt(10) + 1;
            System.out.println(datas[i]);
        }
        System.out.println(Arrays.toString(datas));
        System.out.println("최소값 : "+Arrays.stream(datas).min().getAsInt());
        System.out.println("최대값 : "+Arrays.stream(datas).max().getAsInt());
    }
}
