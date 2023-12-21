package com.basic.basicjava.javaBasic.static2.ex;

public class Car {
  private String name;
  private static int count;
  
  
  public Car(String name) {
    System.out.println("구입한 차량의 이름은 : " + name);
    this.name = name;
    count++;
  }
  
  public static void showTotalCars() {
    System.out.println("총 구매한 차량의 개수는 : " + count);
  }
}
