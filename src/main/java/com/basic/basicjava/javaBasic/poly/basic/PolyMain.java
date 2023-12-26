package com.basic.basicjava.javaBasic.poly.basic;

public class PolyMain {
  public static void main(String[] args) {
    
    //부모 변수가 부모 인스턴스 참조
    System.out.println("Parent -> parent");
    Parent parent = new Parent();
    parent.parentMethod();
    
    System.out.println();
    
    //자식 변수가 자식 인스턴스 참조
    System.out.println("child -> child");
    Child child = new Child();
    child.parentMethod();
    child.childMethod();
    
    System.out.println();
    
    //부모 변수가 자식 인스턴스 참조
    System.out.println("parent -> child");
    Parent poly = new Child();
    poly.parentMethod();
    //자식의 기능을 호출 할 수 없다
//    poly.childMethod();
    
    
    //ㅏ자식은 부모를 담을 수 없다
//    Child child2 = new Parent();
  }
}
