package com.basic.basicjava.javaBasic.poly.ex5;



public class InterfaceAnimalMain {
  public static void main(String[] args) {
    
    Cat cat = new Cat();
    Dog dog = new Dog();
    Caw caw = new Caw();
    
    soundAnimal(cat);
    moveAnimal(cat);
  }
  
  private static void soundAnimal(InterfaceAnimal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 종료");
  }
  private static void moveAnimal(InterfaceAnimal animal) {
    System.out.println("동물 움직임 시작");
    animal.move();
    System.out.println("동물 움직임 종료");
  }
}
