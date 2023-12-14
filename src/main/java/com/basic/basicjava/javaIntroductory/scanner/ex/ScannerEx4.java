package com.basic.basicjava.javaIntroductory.scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int startNum = scanner.nextInt();
    
    for (int i = 1; i <= 9; i++) {
      System.out.println(startNum + "단은 " + startNum  + " * " + i + " = " +startNum * i);
    }
    
  }
}
