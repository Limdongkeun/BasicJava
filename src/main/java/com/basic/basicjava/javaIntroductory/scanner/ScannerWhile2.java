package com.basic.basicjava.javaIntroductory.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.print("첫번째 숫자를 입력하세요 : ");
      int num1 = scanner.nextInt();
      
      System.out.print("두번째 숫자를 입력하세요 : ");
      int num2 = scanner.nextInt();
      
      if(num1 == 0 && num2 == 0) {
        System.out.println("프로그램이 종료되었습니다");
        break;
      } else {
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
        
      }
    }
  }
}
