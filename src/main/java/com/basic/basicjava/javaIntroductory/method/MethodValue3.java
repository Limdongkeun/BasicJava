package com.basic.basicjava.javaIntroductory.method;

public class MethodValue3 {
  public static void main(String[] args) {
    int number = 5;
    
    System.out.println("1. ChangeNum 호출 전 " + number);
    
    number = changeNum(number);
    
    System.out.println("2. ChangeNum 호출 후 " + number);
    
  }
  
  /*
  * main 영역에 있는 number 와 메서드의 파라미터로 받는 number는 다른 값이다
   */
  
  public static int changeNum(int number) {
    System.out.println("변경 전 " + number);
    number = number * 2;
    System.out.println("변경 후 " + number);
    return number;
  }
}
