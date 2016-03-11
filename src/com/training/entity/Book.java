package com.training.entity;

import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
private long bookNumber;
private String bookName;
public long getBookNumber() {
	return bookNumber;
}
public void setBookNumber(long bookNumber) {
	this.bookNumber = bookNumber;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Book(long bookNumber, String bookName) {
	super();
	this.bookNumber = bookNumber;
	this.bookName = bookName;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
}

}
