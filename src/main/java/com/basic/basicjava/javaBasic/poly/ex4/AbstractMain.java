package com.basic.basicjava.javaBasic.poly.ex4;


public class AbstractMain {
  public static void main(String[] args) {
    //추상클래스 생성불가
    //AbstractAnimal animal = new AbstractAnimal();
    
    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    
    
    soundAnimal(dog);
    moveAnimal(dog);
    
    soundAnimal(caw);
    moveAnimal(caw);
    
    soundAnimal(cat);
    moveAnimal(cat);
    
  }
  
  private static void soundAnimal(AbstractAnimal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 종료");
  }
  private static void moveAnimal(AbstractAnimal animal) {
    System.out.println("동물 움직임 시작");
    animal.move();
    System.out.println("동물 움직임 종료");
  }
}
