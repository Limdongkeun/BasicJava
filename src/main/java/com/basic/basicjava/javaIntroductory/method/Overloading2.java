package com.basic.basicjava.javaIntroductory.method;

public class Overloading2 {
  public static void main(String[] args) {
    
    
    
    myMethod(1,1.5);
    myMethod(1.5,5);
  }
  // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
  public static void myMethod(int a, double b) {
    System.out.println("int a double b");
  }
  // 두 번째 add 메서드: 세 정수를 받아서 합을 반환한다.
// 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
  public static void myMethod(double b, int a) {
    System.out.println("double a int b");
  }
}
