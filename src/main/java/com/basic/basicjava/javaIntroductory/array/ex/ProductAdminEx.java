package com.basic.basicjava.javaIntroductory.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int maxProductCount = 10;
    String[] productNames = new String[maxProductCount];
    int[] productPrices = new int[maxProductCount];
    int productCount = 0;
    
    
    while (true) {
      
      System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료 메뉴를 선택하세요:");
      int menu = scanner.nextInt();
      scanner.nextLine();
      
      if (menu == 1) {
        
        if (productCount >= maxProductCount) {
          System.out.println("더 이상 상품을 등록할 수 없습니다.");
          
          continue;
        }
        
        System.out.print("상품의 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        
        productNames[productCount] = name;
        
        System.out.print(name + "의 가격을 입력하세요 : ");
        
        productPrices[productCount] = scanner.nextInt();
        
        productCount++;
        
      }else if (menu == 2) {
        
        if (productCount == 0) {
          System.out.print("등록된 상품이 없습니다");
          continue;
        }
        
        for (int i = 0; i < productCount;i++) {
          System.out.println("상품명 : " + productNames[i] + " 가격 : " + productPrices[i]);
        }
        
      }else if (menu == 3) {
        System.out.println("프로그램을 종료 합니다");
        break;
        
      }else {
        System.out.println("잘못 입력하였습니다");
      }
      
    }
    
  }
}
