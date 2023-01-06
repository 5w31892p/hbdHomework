package com.sparta.hbdstudy.quiz.prac06;

public class Prac06Card {
	// 카드 생성 프로그램  예제
	// 3장의 카드를 발급함
	// 발급, 결제, 비밀번호 변경의 기능을 넣은 프로그램

	public String user;
	public int pw;
	public int bal;

	public Prac06Card() {}

	public Prac06Card(String user, int pw, int bal) {
		this.user = user;
		this.pw = pw;
		this.bal = bal;
		System.out.println(this.user + "님, 카드등록완료");
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
		System.out.println("비밀번호 변경 완료");
	}
}
