package com.sparta.hbdstudy.quiz.prac06;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Prac06Tv t = new Prac06Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "번 입니다.");

		Prac06BookShop book = new Prac06BookShop();
		book.title = "타이탄의 도구들";
		book.author = "ABC";
		book.publisher = "교보문고";
		book.price = 23000;
		System.out.println(
			"내가 산 책은 " + book.publisher + " " + book.title + "이고, " + "작가는 " + book.author + "이다. 가격은 " + book.price
				+ "원 이다.");

		Scanner scanner = new Scanner(System.in);
		Prac06Card[] c = new Prac06Card[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("이름 : ");
			String name = scanner.next();
			System.out.print("비밀번호 : ");
			int password = scanner.nextInt();
			System.out.print("잔액 : ");
			int bal = scanner.nextInt();

			c[i] = new Prac06Card(name, password, bal);
		}
		// 결제
		//  pw 확인 > 5000원씩 결제
		for (int i = 0; i < 3; i++) {
			System.out.println(c[i].user + "님, 결제 진행 중입니다.");

			System.out.print("password 입력 : ");
			int password = scanner.nextInt();
			if (password == c[i].getPw()) {
				if (c[i].bal < 5000) {
					System.out.println("잔액 부족");
				} else {
					c[i].bal -= 5000;
					System.out.println("결제 완료!");
				}
			} else {
				System.out.println("비밀번호 불일치");
			}
		}
		//비밀번호 변경
		for (int i = 0; i < 3; i++) {
			System.out.print(c[i].user + "님, password 입력 : ");
			int password = scanner.nextInt();
			if (password == c[i].getPw()) {
				System.out.print("새로운 password 입력 : ");
				password = scanner.nextInt();
				if (password == c[i].getPw()) {
					System.out.println("기존 비밀번호와 동일합니다.");
				} else {
					c[i].setPw(password);
				}
			} else {
				System.out.println("비밀번호 불일치로 변경 불가");
			}
		}
	}
}

