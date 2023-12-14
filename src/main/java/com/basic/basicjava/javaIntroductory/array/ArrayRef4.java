package com.basic.basicjava.javaIntroductory.array;

public class ArrayRef4 {
  public static void main(String[] args) {
    
    int[] students = {10, 20, 30, 40, 50};
    
    for (int i=0; i<students.length; i++) {
      System.out.println("학생 " + (i + 1) +  " 번째는 : " + students[i]);
      
    }
  }
}
