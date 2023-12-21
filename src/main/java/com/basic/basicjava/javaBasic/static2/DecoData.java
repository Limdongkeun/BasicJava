package com.basic.basicjava.javaBasic.static2;

public class DecoData {
  
  private int instanceValue;
  private static int staticValue;
  
  public static void staticCall(){
//    instanceValue++; 인스턴스 변수 접근 못 함
//    instanceMethod() 인스턴스 메서드 접근 못 함
    staticValue++; //정적 변수 접근
    staticMethod(); //정적 메서드 접근 가능
  }
  
  
  //어차피 인스턴스를 생성하고 부르기 때문에 본인 인스턴스에 접근 가능
  public void instanceCall() {
    instanceValue++; //인스턴스 변수 접근
    instanceMethod(); //인스턴스 메서드 접근
    staticValue++; //정적 변수 접근
    staticMethod(); //정적 메서드 접근 가능
  }
  private void instanceMethod() {
    System.out.println("instanceValue = " + instanceValue);
  }
  
  private static void staticMethod() {
    System.out.println("staticValue = " + staticValue);
  }
}
