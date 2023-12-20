package com.basic.basicjava.javaBasic.oop1.ex;

public class Rectangle {
  int width = 0;
  int height = 0;
  
  
  void rectangleArea() {
    System.out.println("넓이는 : " + width * height);
  }
  
  void rectangleRound() {
    System.out.println("둘레는 : " + (width + height) * 2);
  }
  
  void isSquare() {
    if (width == height) {
      System.out.println("정사각형입니다");
    }else {
      System.out.println("직사각형입니다");
    }
  }
  
  int makeSquare() {
    if (width != height) {
      height = width;
    }
    return height;
  }
}
