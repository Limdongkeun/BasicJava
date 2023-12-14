package com.basic.basicjava.javaIntroductory.array.ex;

public class ArrayEx1 {
  public static void main(String[] args) {
    
    int[] array = {90, 80, 70, 60, 50};
    
    int total = 0;
    
//    for (int i = 0; i < array.length; i++) {
//      total += array[i];
//    }
    for (int i : array) {
      total += i;
    }
    
    double average = (double) total / 5;
    System.out.println("점수 총합: " + total);
    System.out.println("점수 평균: " + average);
  }
}
