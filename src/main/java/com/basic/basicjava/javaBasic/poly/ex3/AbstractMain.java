package com.basic.basicjava.javaBasic.poly.ex3;


public class AbstractMain {
  public static void main(String[] args) {
    //추상클래스 생성불가
    //AbstractAnimal animal = new AbstractAnimal();
    
    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    
    cat.sound();
    cat.move();
    
    soundAnimal(dog);
    soundAnimal(caw);
    soundAnimal(cat);
    
  }
  
  private static void soundAnimal(AbstractAnimal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 종료");
  }
}
