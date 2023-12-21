package com.basic.basicjava.javaBasic.static2.ex;

public class CarMain {
  public static void main(String[] args) {
    
    Car car1 = new Car("제네시스");
    Car car2 = new Car("테슬라 Y");
    Car car3 = new Car("벤츠");
    
    Car.showTotalCars();
  }
}
