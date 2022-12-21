package com.sparta.hbdstudy.homework;

import java.util.Arrays;
import java.util.Random;

public class homework01 {
    public static void main(String[] args) {
        // 최소값찾기 (숙제)
        // 랜덤으로 정수 10개 저장
        // 최소값을 찾아주세요!-> 몇개?
        int[] datas = new int[10];
        Random rand = new Random();
        for (int i = 0; i < datas.length; i++) {
            datas[i] = rand.nextInt(10) + 1;
            System.out.println(datas[i]);
        }
        System.out.println(Arrays.toString(datas));
        System.out.println("최소값 : " + Arrays.stream(datas).min().getAsInt());
        System.out.println("최대값 : " + Arrays.stream(datas).max().getAsInt());
    }
}
