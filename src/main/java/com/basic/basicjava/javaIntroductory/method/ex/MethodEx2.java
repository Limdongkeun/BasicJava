package com.basic.basicjava.javaIntroductory.method.ex;

public class MethodEx2 {
  public static void main(String[] args) {
    
    printMessage("hello", 5);
    
  }
  
  
  public static void printMessage(String message, int offset){
    for (int i = 0; i <offset; i++) {
      System.out.println("message = " + message);
    }
  }
}
