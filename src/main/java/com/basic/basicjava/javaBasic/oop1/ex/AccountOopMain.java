package com.basic.basicjava.javaBasic.oop1.ex;

import java.util.Scanner;

public class AccountOopMain {
  public static void main(String[] args) {
    
    Account account = new Account();
    
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.println("항목을 선택하세요 | 1.입금 | 2. 출금 ㅣ 3. 종료");
      
      int choice = scanner.nextInt();
      
      if (choice == 1) {
        System.out.print("입금 할 금액을 입력 하세요 : " );
        int amount = scanner.nextInt();
        account.deposit(amount);
        
      } else if (choice == 2) {
        System.out.print("출금 할 금액을 입력 하세요 : " );
        int amount = scanner.nextInt();
        account.withdraw(amount);
        
      } else if (choice == 3) {
        System.out.println("종료합니다 안녕히 가세요");
        break;
      }
    }
  }
}
