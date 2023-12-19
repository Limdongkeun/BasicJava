package com.basic.basicjava.javaBasic.ref;

public class NullMain2 {
  public static void main(String[] args) {
    
    Data data = null;
    data.value = 10; // 참조 값이 없기 때문에 NullPointerException
    
    System.out.println("data.value = " + data.value);
  }
}
