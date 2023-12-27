package com.basic.basicjava.javaBasic.poly.ex.pay;

import java.util.Scanner;

public class PayMain {
  public static void main(String[] args) {
    
    PayService service = new PayService();
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("결제 수단을 입력하세요 : | kakao | naver | default");
    String option = scanner.nextLine();
    
    System.out.print("결제 금액을 입력 해주세요 : ");
    int amount = scanner.nextInt();
    
    service.paymentService(option, amount);
  
  }
}
