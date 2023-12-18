package com.basic.basicjava.javaIntroductory.method;

public class MethodReturn1 {
  
  public static void main(String[] args) {
    
    
    boolean result = odd(1);
    System.out.println("result = " + result);
    
  }
  
  public static boolean odd(int i) {
    if(i == 0) {
      return true;
    }
    return false;
  }
}
