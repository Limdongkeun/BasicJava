package com.basic.basicjava.javaBasic.final1;

public class FinalLocalMain {
  public static void main(String[] args) {
    
    //final 지역변수1
    final int data1;
    data1 = 10;
    
//    data1 = 20; final 은 값을 최초에 한 번만 넣기 때문에 그 이후에 넣으면 컴파일 에러
    
    //final 지역변수1
    final int data2;
    data2 = 10;
    
    method(10);
  }
  
  static void method(final int parameter) {
//    final 은 값을 최초에 한 번만 넣기 때문에 그 이후에 넣으면 컴파일 에러
//    parameter = 20;
  }
}
