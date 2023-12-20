package com.basic.basicjava.javaBasic.construct;
public class MemberConstruct {
  String name;
  int age;
  int grade;
  
  MemberConstruct(String name, int age) {
    this(name, age, 50);
  }
  MemberConstruct(String name, int age, int grade) {
    System.out.println("MemberConstruct{" + "name='" + name + '\'' + ", age=" + age + ", grade=" + grade + '}');
    this.name = name;
    this.age = age;
    this.grade = grade;
    
  }
  
}
