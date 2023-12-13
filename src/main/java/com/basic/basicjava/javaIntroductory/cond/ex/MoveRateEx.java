package com.basic.basicjava.javaIntroductory.cond.ex;

import java.util.Random;

public class MoveRateEx {
  public static void main(String[] args) {
    
    Random rand = new Random();
    
    double rate = Math.round((rand.nextDouble() * 9.9 + 0.1) * 10.0) / 10.0;
    String movie;
    
    if (rate > 9) {
      movie = "어바웃타임";
    } else if (rate > 7) {
      movie = "토이스토리";
    } else if (rate > 5.5) {
      movie = "고질라";
    } else {
      movie = "불꽃소방대";
    }
    
    System.out.println("추천하는 영화는 : " + movie + "/" + rate);
  }
}
