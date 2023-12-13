package com.basic.basicjava.javaIntroductory.cond.ex;

import java.util.Random;

public class CondOpEx {
  public static void main(String[] args) {
    
    
    Random random = new Random();
    
    int num1 = random.nextInt(100);
    int num2 = random.nextInt(100);
    
    int num = (num1 > num2) ? num1 : num2;
    
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    System.out.println("더 큰 숫자는  = " + num);
  }
}
