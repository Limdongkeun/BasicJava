package com.basic.basicjava.javaBasic.ref;

public class MethodChange2 {
  public static void main(String[] args) {
    
    Data x = new Data();
    x.value = 10;
    System.out.println("호출 전");
    System.out.println("x.value = " + x.value);
    
    changeMethod(x);
    System.out.println("호출 후");
    System.out.println("x.value = " + x.value);
  }
  
  public static void changeMethod(Data a) {
    a.value = 20;
  }
}
