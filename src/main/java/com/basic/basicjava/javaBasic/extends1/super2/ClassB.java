package com.basic.basicjava.javaBasic.extends1.super2;

public class ClassB extends ClassA{
  
  public ClassB(int a) {
    super(); //부모 기본 생성자 생략 가능
    System.out.println("ClassB 생성자 a = " + a);
  }
  
  
  public ClassB(int a, int b) {
    super(); //부모 기본 생성자 생략 가능
    System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
  }
  
}
