package com.basic.basicjava.javaBasic.poly.overriding;

public class OverridingMain {
  
  public static void main(String[] args) {
    //쟈식 변수가 자식 인스턴스 참조
    Child child = new Child();
    System.out.println("Child -> Child");
    
    System.out.println("value : " + child.value);
    child.method();
    
    System.out.println();
    
    //부모 변수가 부모 인스턴스 참조
    Parent parent = new Parent();
    System.out.println("Parent -> Parent");
    System.out.println("value : " + parent.value);
    parent.method();
    
    System.out.println();
    
    //부모 변수가 자식 인스턴스 참조
    Parent poly = new Child();
    System.out.println("Parent -> child");
    System.out.println("value : " + poly.value); //변수는 overriding X
    poly.method(); //메서드는 overriding O
  }
}
