package com.sparta.hbdstudy.quiz.prac05;
// 계산기 구현
// long타입  + - * , double타입  /
public class Prac05Calculator {
    public static long sum(long i, long j) {
        return i + j;
    }

    public static long minus(long i, long j){
        return i - j;
    }

    public static long mul(long i, long j) {
        return i * j;
    }

    public static double div(double i, double j) {
        return i / j;
    }
    public static void main(String[] args) {
        System.out.println(sum(10L, 5L));
        System.out.println(minus(10L, 5L));
        System.out.println(mul(10L, 5L));
        System.out.println(div(10, 5));

    }
}
