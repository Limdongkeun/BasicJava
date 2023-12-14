package com.basic.basicjava.javaIntroductory.array.ex;

import java.util.Scanner;

public class ArrayEx4 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] numbers = new int[5];
    int total = 0;
    double avg = 0;
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
      total += numbers[i];
    }
    
    avg = (double) total / numbers.length;
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);
  }
}
