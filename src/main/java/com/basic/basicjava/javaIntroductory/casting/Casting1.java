package com.basic.basicjava.javaIntroductory.casting;

public class Casting1 {
  public static void main(String[] args) {
    int inValue = 10;
    long longValue;
    double doubleValue;

    longValue = inValue;
    System.out.println("longValue = " + longValue);

    doubleValue = inValue;
    System.out.println("doubleValue = " + doubleValue);

    doubleValue =  20L; //long -> double
    System.out.println("doubleValue = " + doubleValue);
  }
}
