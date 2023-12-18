package com.basic.basicjava.javaIntroductory.method;

public class Method1Ref {
  public static void main(String[] args) {
    
    int sum1 = add(4, 5);
    
    System.out.println("sum1 = " + sum1);
    
    int sum2 = add(10, 20);
    
    System.out.println("sum2 = " + sum2);
  }
  
  public static int add(int a, int b) {
    int result = a + b;
    return result;
  }
}
