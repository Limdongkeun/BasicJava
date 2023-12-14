package com.basic.basicjava.javaIntroductory.scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("숫자를 입력 하세요 : ");
    int num = scanner.nextInt();
    
    if(num % 2 == 0) {
      System.out.println(num + "은 짝수 입니다");
    } else {
      System.out.println(num + "은 홀수 입니다");
    }
    
  }
}
