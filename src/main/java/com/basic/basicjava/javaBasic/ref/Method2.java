package com.basic.basicjava.javaBasic.ref;

public class Method2 {
  public static void main(String[] args) {
    
    Student student1 = createStudent("Student1", 16, 90);
    Student student2 = createStudent("Student2", 15, 80);
    
//    initStudent(student1, "학생1", 15, 90);
//    initStudent(student2, "학생2", 16, 80);
    
    printStudent(student1);
    printStudent(student2);
  }
  
  public static void printStudent(Student student){
    System.out.println("이름 : " + student.name + " : " + student.age + " : " + student.grade);
    
  }
  
  static Student createStudent(String name, int age, int grade) {
    Student student = new Student();
    student.name = name;
    student.age = age;
    student.grade = grade;
    return student;
  }
  
  static void initStudent(Student student, String name, int age, int grade){
    student.name = name;
    student.age = age;
    student.grade = grade;
  }
}
