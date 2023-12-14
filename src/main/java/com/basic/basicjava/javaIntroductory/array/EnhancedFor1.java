package com.basic.basicjava.javaIntroductory.array;

public class EnhancedFor1 {
  public static void main(String[] args) {
    
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
    
    
    
    //일반 for
    for (int i = 0; i < numbers.length; i++) {
      int number = numbers[i];
      System.out.println("일반 number = " + number);
    }
    
    
    for (int number : numbers) {
      System.out.println("향상된 number = " + number);
    }
    
    
  }
}
