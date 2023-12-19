package com.basic.basicjava.javaBasic.ref;

public class NullMain4 {
  public static void main(String[] args) {
    
    BigData bd = new BigData();
    
    System.out.println("bd.count = " + bd.count);
    System.out.println("bd.data = " + bd.data);
    
    
    bd.data = new Data(); // 초기화 안 해주면 밑에 NullPointException
    System.out.println("bd.data.value = " + bd.data.value);// NullPointException
  }
}
