package com.basic.basicjava.javaBasic.access.a;

public class AccessData {
  public int publicField;
  int defaultField;
  
  private int privateField;
  
  public void publicMethod() {
    System.out.println("publicMethod 호출 : " + publicField);
    
  }
  
  void defaultMethod() {
    System.out.println("defaultField = " + defaultField);
  }
  
  private void privateMethod() {
    System.out.println("privateField = " + privateField);
  }
  
  public void innerAccess() {
    //본인 안에서는 다 접근 가능
    System.out.println("내부 호출");
    publicField = 100;
    defaultField = 200;
    privateField = 300;
    publicMethod();
    defaultMethod();
    privateMethod();
  }
}
