package com.basic.basicjava.javaBasic.static2.ex;

public class MathArrayUtilsMain {
  public static void main(String[] args) {
    
    int[] array = {1, 2, 3, 4, 5};
    
    System.out.println(" sum = " + MathArrayUtils.sum(array));
    System.out.println(" avg = " + MathArrayUtils.average(array));
    System.out.println(" min = " + MathArrayUtils.min(array));
    System.out.println(" max = " + MathArrayUtils.max(array));
  }
}
