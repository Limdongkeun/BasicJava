package com.basic.basicjava.javaBasic.oop1.ex;

public class Account {
  int balance = 0;
  
  
   void deposit(int amount) {

    System.out.println("입급하는 금액은 : " + amount);
    balance += amount;
    System.out.println("입금 후 잔액은 : " + balance);
//    return balance;
  }
  
  void withdraw(int amount) {
    
    if(amount > balance) {
      System.out.println("잔액 부족");
      System.out.println("잔액 : " +balance);
    } else{
      System.out.print( " 출금할 금액을 입력 하세요 : " + amount );
      System.out.println("출금 할 금액은 : " + amount);
      balance -= amount;
      System.out.println("잔액 : " +balance);
      
    }
//    return balance;
  }
}
