package com.basic.basicjava.javaIntroductory.array;

public class ArrayRef2 {
  public static void main(String[] args) {
    int[] students;
    
    students = new int[5];
    
    students[0] = 50;
    students[1] = 40;
    students[2] = 30;
    students[3] = 20;
    students[4] = 10;

    for (int i=0; i<students.length; i++) {
      System.out.println("학생 " + (i + 1) +  " 번째는 : " + students[i]);
      
    }
  }
}