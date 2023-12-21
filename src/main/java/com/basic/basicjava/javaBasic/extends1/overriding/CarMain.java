package com.basic.basicjava.javaBasic.extends1.overriding;

public class CarMain {
  public static void main(String[] args) {
    
    ElectricCar electricCar = new ElectricCar();
    electricCar.openDoor();
    electricCar.move();
    electricCar.charge();
    
    GasCar gasCar = new GasCar();
    gasCar.openDoor();
    gasCar.move();
    gasCar.fillUp();
    
    HydrogenCar hydrogenCar = new HydrogenCar();
    hydrogenCar.openDoor();
    hydrogenCar.move();
    hydrogenCar.fillHydrogen();
  }
}
