package com.basic.basicjava.javaBasic.poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
  
  @Override
  public void sound() {
    System.out.println("끼룩");
  }
  
  @Override
  public void fly() {
    System.out.println("날아가자");
  }
}
