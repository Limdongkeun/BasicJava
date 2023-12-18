package com.basic.basicjava.javaIntroductory.method.ex;

public class MethodEx1 {
  public static void main(String[] args) {
    
    int a = 1;
    int b = 2;
    int c = 3;
    
    System.out.println("avg(a,b,c) = " + avg(a,b,c));
  }
  
  
  public static double avg(int a, int b, int c) {
    return (a + b + c) / 3;
  }
}
