package com.basic.basicjava.javaIntroductory.method;

public class Overloading3 {
  public static void main(String[] args) {
    
    
    System.out.println(add(1,1));
    System.out.println(add(1.5,5.5));
  }
  // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
  public static int add(int a, int b) {
    System.out.println("int a int b");
    return a + b;
  }
  // 두 번째 add 메서드: 세 정수를 받아서 합을 반환한다.
// 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
  public static double add(double b, double a) {
    System.out.println("double a double b");
    return a + b;
  }
}
