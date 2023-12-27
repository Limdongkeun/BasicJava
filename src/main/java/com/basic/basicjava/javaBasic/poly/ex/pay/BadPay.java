package com.basic.basicjava.javaBasic.poly.ex.pay;

public class BadPay implements Pay{
  @Override
  public boolean payment(int amount) {
    System.out.println("올바르지 않은 결제 수단입니다");
    return false;
  }
}
