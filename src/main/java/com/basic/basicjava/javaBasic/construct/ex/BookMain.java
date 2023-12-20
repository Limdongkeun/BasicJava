package com.basic.basicjava.javaBasic.construct.ex;

public class BookMain {
  public static void main(String[] args) {
    
    
    Book book1 = new Book();
    book1.title = "titl1";
    book1.author = "author1";
    book1.page = 100;
    
    
    Book book2 = new Book("title2", "author2");
    
    Book book3 = new Book("title3", "author3", 300);
    
    book1.bookInfo();
    book2.bookInfo();
    book3.bookInfo();
  }
}
