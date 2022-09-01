package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Book;
import com.tns.jpacrud.service.BookService;
import com.tns.jpacrud.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service = new BookServiceImpl();
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 1*************");
		System.out.println("Book with ID 1:"+service.getBookById(1));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
			
		System.out.println("************Listing book written by Abdul Kalam*************");
		for(Book book:service.getAuthorBooks("Abdul Kalam") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on Java*************");
		for(Book book:service.getBookByTitle("The Complete Reference")) {
			System.out.println(book);
		}
			
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(book);
		}		

	}

}
