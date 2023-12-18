package com.basic.basicjava.javaIntroductory.method;

public class MethodReturn2 {
  
  public static void main(String[] args) {
    
    checkAge(14);
    
  }
  
  public static void checkAge(int age) {
    if(age < 18) {
      System.out.println("미성년자는 저리 가");
      return;
    }
    System.out.println("입장하세요");
  }
}
