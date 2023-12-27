package com.basic.basicjava.javaBasic.poly.ex.pay;

public class NaverPay implements Pay {
  @Override
  public boolean payment(int amount) {
    
    System.out.println("네이버페이 결제를 시작합니다");
    System.out.println("결제 금액은 : " + amount);
    return false;
    
  }
}
