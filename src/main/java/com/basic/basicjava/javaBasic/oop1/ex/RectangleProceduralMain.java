package com.basic.basicjava.javaBasic.oop1.ex;

public class RectangleProceduralMain {
  public static void main(String[] args) {
    int width = 5;
    int height = 8;
    
    
    int area = rectangleArea(width, height);
    System.out.println("area = " + area);
    
    int round = rectangleRound(width, height);
    System.out.println("round = " + round);
    
    isSquare(width, height);
    
    int changeHeight = makeSquare(width, height);
    
    isSquare(width, changeHeight);
    
    
  }
  
  static int rectangleArea(int width, int height) {
    return width * height;
  }
  
  static int rectangleRound(int width, int height) {
    return (width + height) * 2;
  }
  
  static void isSquare(int width, int height) {
    if (width == height) {
      System.out.println("정사각형입니다");
    }else {
      System.out.println("직사각형입니다");
    }
  }
  
  static int makeSquare(int width, int height) {
    int temp = 0;
    if (width != height) {
      height = width;
    }
    return height;
  }
}
