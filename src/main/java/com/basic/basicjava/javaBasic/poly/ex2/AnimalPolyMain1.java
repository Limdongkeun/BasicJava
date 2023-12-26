package com.basic.basicjava.javaBasic.poly.ex2;


public class AnimalPolyMain1 {
  public static void main(String[] args) {
    
    Dog dog = new Dog();
    Caw caw = new Caw();
    Cat cat = new Cat();
    
    soundAnimal(dog);
    soundAnimal(caw);
    soundAnimal(cat);
  }
  
  
  private static void soundAnimal(Animal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 종료");
  }
}
