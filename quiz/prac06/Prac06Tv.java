package com.sparta.hbdstudy.quiz.prac06;

public class Prac06Tv {

    public String color;
    public boolean power;
    public int channel;

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }
}
