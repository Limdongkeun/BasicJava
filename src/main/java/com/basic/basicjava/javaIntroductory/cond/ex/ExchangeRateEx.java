package com.basic.basicjava.javaIntroductory.cond.ex;

import java.util.Random;

public class ExchangeRateEx {
  public static void main(String[] args) {
    
    Random rand = new Random();
    
    int dollar  = rand.nextInt(10);
    
    int KR = 0;
    
    if (dollar == 0) {
      System.out.println("환전 할 금액이 없습니다");
    } else  {
      KR = dollar * 1300;
    }
    
    System.out.println("dollar는 " + dollar +"이며 환전하면 " + KR + "입니다");
  }
}
