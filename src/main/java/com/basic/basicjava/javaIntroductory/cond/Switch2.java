package com.basic.basicjava.javaIntroductory.cond;

public class Switch2 {
  public static void main(String[] args) {
    
    int grade = 2;
    
    int coupon;
    
    switch (grade) {
      case 1 :
        coupon = 100;
        break;
      case 2 :
        coupon = 200;
        break;
      case 3 :
        coupon = 300;
        break;
        
      default:
        coupon = 400;
    }
    
    System.out.println("coupon = " + coupon);
  }
}
