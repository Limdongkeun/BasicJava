package com.basic.basicjava.javaBasic.extends1.overriding;

public class Car {
  
  public void move() {
    System.out.println("차를 이동 합니다");
  }
  
  //final .있으면 override 못 함
  public final void openDoor() {
    System.out.println("문을 엽니다");
  }
}
