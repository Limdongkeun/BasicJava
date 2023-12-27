package com.basic.basicjava.javaBasic.poly.ex.pay;

public abstract class PayStore {
  
  public static Pay findPay(String option) {
    
    if (option.equals("kakao")) {
      
      return new KaKaoPay();
      
    } else if (option.equals("naver")) {
      
      return new NaverPay();
      
    } else if(option.equals("default")){
      
      return new DefaultPay();
      
    } else {
      
      return new BadPay();
    }
  }
}
