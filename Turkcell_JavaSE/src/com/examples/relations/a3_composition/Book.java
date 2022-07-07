package com.examples.relations.a3_composition;

import java.io.Serializable;

// N
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String bookName;
	
	// empati kurmak
	Writer writer;
	
	// parametresiz constructor
	public Book() {
		
	}
	
	// parametreli constructor
	public Book(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}
	
	// getter and setter
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	// composition getter and setter
	public Writer getWriter() {
		return writer;
	}
	
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
}
