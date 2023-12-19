package com.basic.basicjava.javaBasic.ref;

public class MethodChange1 {
  public static void main(String[] args) {
    int a = 10;
    System.out.println("호출 전");
    System.out.println("a = " + a);
    
    System.out.println("호출 후");
    changeMethod(a);
    System.out.println("a = " + a);
    
  }
  
  public static int changeMethod(int x) {
    x = 20;
    return x;
  }
}
