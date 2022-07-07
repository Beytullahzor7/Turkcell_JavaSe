package com.examples.relations.a3_composition;

import java.util.ArrayList;

public class CompositionMainClass {
	
	public static void main(String[] args) {
		
		// Olmazsa olmaz olan yapi yazar oldugu icin once yazari olusturmamiz lazim
		Writer writer = new Writer("George Orwell");
		
		// Null Pointer Exception almamak icin (1) olan yapida List olusturmaliyiz
		writer.setBookList(new ArrayList<Book>());
		
		Book book = new Book();
		book.setBookName("1984");
		book.setWriter(writer);
		
		Book book2 = new Book();
		book2.setBookName("Hayvan Ciftligi");
		book2.setWriter(writer);
		
		// book sinifi icerisindeki writer instancesinden bookListe ulasip ekleme
		// yaptik
		book.getWriter().bookList.add(book);
		book2.getWriter().bookList.add(book2);
		
		for (Book books : book.getWriter().getBookList()) {
			System.out.println(books);
		}
		
	}
	
}
