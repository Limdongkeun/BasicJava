package com.basic.basicjava.javaBasic.oop1.ex;

public class RectangleOoplMain {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    
    rectangle.width = 10;
    rectangle.height = 25;
    
    
    rectangle.rectangleArea();
    
    rectangle.rectangleRound();
    
    rectangle.isSquare();
    
    rectangle.makeSquare();
    
    rectangle.isSquare();
  }
}
