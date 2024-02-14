package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController  {
	private List<Book> list = new ArrayList<Book>();
	private Book book = new Book();

	// 초기 값을 넣어줄 기본 생성자
	public void insertBook(String title, String author, String category, int price) {
		book.setTitle(title);
		book.setAuthor(author);
		book.setCategory(category);
		book.setPrice(price);
	}

	// 리스트에 값 저장 메소드
	public void insertBookList() {
		list.add(book);
	}

	// 모든 리스트를 출력하는 메소드
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>) list;
	}

	// 키워드로 책을 검색하는 메소드
	public ArrayList<Book> searchBook(String keyword) {
		for()
		return ;

	}

	// 책 제목과 저자 명으로 책을 삭제하는 메소드
	public Book deleteBook(String title, String author) {
		return null;

	}

	// 책 명 오름차순 정렬하는 메소드
	public int ascBook() {
		return 0;

	}
}
