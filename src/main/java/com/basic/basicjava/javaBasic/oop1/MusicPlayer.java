package com.basic.basicjava.javaBasic.oop1;

public class MusicPlayer {
  int volume = 0;
  boolean isOn = false;
  
  void on() {
    isOn = true;
    System.out.println("시작");
  }
  void off() {
    isOn = false;
    System.out.println("꺼짐");
  }
  
  void volumeUp() {
    volume++;
    System.out.println("볼륨 : " + volume);
  }
  void volumeDown() {
    volume--;
    System.out.println("볼륨 : " + volume);
  }
  
  void playerStatus() {
    //플레이어 상태
    System.out.println("플레이어 상태 확인");
    
    if (isOn) {
      System.out.println("ON : " + volume);
    } else {
      System.out.println("OFF : " + volume);
    }
  }
}
