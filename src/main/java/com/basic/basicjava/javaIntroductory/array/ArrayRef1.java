package com.basic.basicjava.javaIntroductory.array;

public class ArrayRef1 {
  public static void main(String[] args) {
    int[] students;
    
    students = new int[5];
    
    students[0] = 50;
    students[1] = 40;
    students[2] = 30;
    students[3] = 20;
    students[4] = 10;
    
    System.out.println("student[0] = " + students[0]);
    System.out.println("student[1] = " + students[1]);
    System.out.println("student[2] = " + students[2]);
    System.out.println("student[3] = " + students[3]);
    System.out.println("student[4] = " + students[4]);
  }
}
