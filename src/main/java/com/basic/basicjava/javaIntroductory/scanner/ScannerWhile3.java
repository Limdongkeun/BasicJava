package com.basic.basicjava.javaIntroductory.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    
    while (true) {
      System.out.println("정수를 입력하세요");
      int num = scanner.nextInt();
      
      if(num == 0) {
        System.out.println("프로그램이 종료됩니다");
        break;
      }
      
      sum += num;
    }
    System.out.println("sum = " + sum);
  }
}
