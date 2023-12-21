package com.basic.basicjava.javaBasic.extends1.ex;

public class Item {
  private String name;
  private int price;
  
  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }
  
  public void print() {
    System.out.println("name: " + name + " price: " + price);
  }
  
  public int price() {
    return price;
  }
}
