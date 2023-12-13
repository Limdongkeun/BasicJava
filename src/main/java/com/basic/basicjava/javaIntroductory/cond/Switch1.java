package com.basic.basicjava.javaIntroductory.cond;

public class Switch1 {
  public static void main(String[] args) {
    int grade = 2;
    
    int coupon;
    
    if (grade ==1 ) {
      coupon = 100;
    } else if (grade == 2) {
      coupon = 200;
    } else if (grade == 3) {
      coupon = 300;
    } else {
      coupon = 500;
    }
    
    System.out.println("coupon = " + coupon);
  }
}
