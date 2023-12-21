package com.basic.basicjava.javaBasic.static1;

public class DataCountMain3 {
  public static void main(String[] args) {
    
    Data3 data1 = new Data3("A");
    System.out.println("A counter = " + Data3.count);
    
    Data3 data2 = new Data3("B");
    System.out.println("B counter = " + Data3.count);
    
    Data3 data3 = new Data3("C");
    System.out.println("C counter = " + Data3.count);
    
    
    //추가
    //인스턴스를 통안 접근 권장하지 않음
    Data3 data4 = new Data3("D");
    System.out.println(data4.count);
    
    System.out.println(Data3.count);
  }
}
