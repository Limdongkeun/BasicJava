package com.basic.basicjava.javaBasic.construct.ex;

public class Book {
  String title;
  String author;
  
  int page;
  
  public Book() {
  }
  
  public Book(String title, String author) {
    this(title, author, 200);
  }
  
  public Book(String title, String author, int page) {
    this.title = title;
    this.author = author;
    this.page = page;
  }
  
  void bookInfo() {
    System.out.println(title + " " + author + " " + page);
  }
}
