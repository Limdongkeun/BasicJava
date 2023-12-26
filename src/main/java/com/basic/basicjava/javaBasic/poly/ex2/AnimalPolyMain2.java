package com.basic.basicjava.javaBasic.poly.ex2;


public class AnimalPolyMain2 {
  public static void main(String[] args) {
    
    Animal[] animalArr = {new Dog(), new Cat(), new Caw()};
    
    
    for (Animal animal : animalArr) {
      soundAnimal(animal);
    }
    
  }
  
  private static void soundAnimal(Animal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 종료");
  }
  
}
