package com.basic.basicjava.javaBasic.extends1.ex;

public class Movie extends Item{
  public String director;
  public String actor;
  
  public Movie(String name, int price, String director, String actor) {
    super(name, price);
    this.director = director;
    this.actor = actor;
  }
  
  @Override
  public void print() {
    super.print();
    System.out.println("- director: " + director + " actor: " + actor);
  }
}
