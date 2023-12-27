package com.basic.basicjava.javaBasic.poly.ex.pay;

public class DefaultPay implements Pay {
  @Override
  public boolean payment(int amount) {
    System.out.println("일반 결제를 시작합니다");
    System.out.println("결제 금액은 : " + amount);
    return true;
  }
}
