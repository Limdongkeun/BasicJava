package com.basic.basicjava.javaBasic.poly.ex.pay;

public class PayService {
  
  
  public void paymentService(String option, int amount) {
    
    
    Pay pay = PayStore.findPay(option);
    
    boolean result = pay.payment(amount);
    
    if (result == true) {
      System.out.println("결제가 성공하였습니다");
    } else {
      System.out.println("결제가 실패하였습니다");
    }
  }
}
