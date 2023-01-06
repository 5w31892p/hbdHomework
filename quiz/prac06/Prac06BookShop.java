package com.sparta.hbdstudy.quiz.prac06;

public class Prac06BookShop {
	// 멤버변수로 4개 선언하기 (title, author, publisher, price)
	// public (접근제어자) 으로 하기
	// 기본생성자 만들기
	// 파라미터 4개짜리 생성자 만들기

	public String title;
	public String author;
	public String publisher;
	public int price;

	public Prac06BookShop(){}

	public Prac06BookShop(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
}
