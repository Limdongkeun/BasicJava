package com.basic.basicjava.javaBasic.class1;

public class ClassStart2 {
  public static void main(String[] args) {
    
    
    String[] students = {"학생1", "학생2", "학생3"};
    int[] studentsAge = {15, 16, 17};
    int[] studentsGrade = {90, 80, 70};
    
    
    for (int i = 0; i < students.length; i++) {
      System.out.println("이름은 :" + students[i] + " 나이는 : " + studentsAge[i] + " 점수는 : " + studentsGrade[i]);
      
    }
    
  }
}
