package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController  {
	private List<Book> list = new ArrayList<Book>();
	

	// 초기 값을 넣어줄 기본 생성자
	public BookController(){
	}

	// 리스트에 값 저장 메소드
	public void insertBook(Book bk) {
		list.add(bk);
	}

	// 모든 리스트를 출력하는 메소드
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>) list;
	}

	// 키워드로 책을 검색하는 메소드
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchlist = new ArrayList<Book>();
		for(int i = 0; i < list.size() ; i++) {
			Book haveBook = list.get(i);
			if(haveBook.getTitle().contains(keyword)) {
				searchlist.add(haveBook);
			}
		}
		return searchlist;
	}

	// 책 제목과 저자 명으로 책을 삭제하는 메소드
	public boolean deleteBook(String title, String author) {
		for(int i = 0; i < list.size() ; i++) {
			Book haveBook = list.get(i);
			if(haveBook.getTitle().contains(title) && haveBook.getAuthor().contains(author)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	// 책 명 오름차순 정렬하는 메소드
	public void ascBook() {
		for(int i = 0; i < list.size()-1 ; i++) {
			for(int j = 0; j <list.size()-1 -i; j++);
			Book haveBook = list.get(i);
			Book haveBooknext = list.get(i+1);
			if(haveBook.getTitle().compareTo(haveBooknext.getTitle()) > 0) {
				Book temp = new Book();
				temp = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, temp);
			}
		}
	}
}
