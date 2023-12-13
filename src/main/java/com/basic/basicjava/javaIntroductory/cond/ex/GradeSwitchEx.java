package com.basic.basicjava.javaIntroductory.cond.ex;

import java.util.Random;

public class GradeSwitchEx {
  public static void main(String[] args) {
    
    Random rand = new Random();
    
    char randomLetter = (char) ('A' + rand.nextInt(6));
    
    String status = switch(randomLetter) {
      case 'A' -> "탁월한 성과 입니다";
      case 'B' -> "좋은 성과 입니다";
      case 'C' -> "준수한 성과 입니다";
      case 'D' -> "향상이 필요 합니다";
      default -> "불합격입니다";
    };
    
    System.out.println("학점은 " + randomLetter + "이며 " + status);
  }
}
