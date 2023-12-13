package com.basic.basicjava.javaIntroductory.cond.ex;

import java.util.Random;

public class DistanceEx {
  public static void main(String[] args) {
    Random rand = new Random();
    
    int distance = rand.nextInt(10);
    
    String transportation = switch (distance) {
      case 2,3 -> "도보";
      case 4,5 -> "자전거";
      case 6,7 -> "오토바이";
      case 8,9 -> "자동차";
      case 10 -> "비행기";
      default -> "걸어";
    };
    
    System.out.println(distance +" 정도 거리면 " + transportation + "로 가");
  }
}
