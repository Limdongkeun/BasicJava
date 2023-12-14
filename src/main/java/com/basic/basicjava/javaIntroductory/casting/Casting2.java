package com.basic.basicjava.javaIntroductory.casting;

public class Casting2 {
  public static void main(String[] args) {
    double doubleValue = 1.5;
    int intValue = 0;
    //intValue = doubleValue; //컴파일 오류 발생
    intValue = (int) doubleValue; // 직접 앞에 어떤 걸로 바꿔줄지 쓰는게 명시적 형변환
    System.out.println(intValue); //출력:1
  }
}
