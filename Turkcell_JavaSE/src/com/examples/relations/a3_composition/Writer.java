package com.examples.relations.a3_composition;

import java.io.Serializable;
import java.util.List;

// 1
public class Writer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String writerName;
	
	// empati kurmak
	List<Book> bookList;
	
	// parametresiz constructor
	public Writer() {
		
	}
	
	// parametreli constructor
	public Writer(String writerName) {
		this.writerName = writerName;
	}
	
	@Override
	public String toString() {
		return "Writer [writerName=" + writerName + "]";
	}
	
	// getter and setter
	public String getWriterName() {
		return writerName;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
	// composition getter and setter
	public List<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}
