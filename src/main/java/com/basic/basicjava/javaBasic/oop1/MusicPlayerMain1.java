package com.basic.basicjava.javaBasic.oop1;

public class MusicPlayerMain1 {
  public static void main(String[] args) {
    int volume = 0;
    boolean isOn = false;
    
    
    //켜기
    isOn = true;
    System.out.println("시작");
    
    //볼륨 증가
    volume++;
    System.out.println("볼륨" + volume);
    
    //볼륨 증가
    volume++;
    System.out.println("볼륨" + volume);
    
    //볼륨 감소
    volume--;
    System.out.println("볼륨" + volume);

    //플레이어 상태
    System.out.println("플레이어 상태 확인");
    
    if (isOn) {
      System.out.println("ON " + volume);
    }else {
      System.out.println("OFF" + volume);
    }
    
    //끄기
    isOn = false;
    System.out.println("플레이어 꺼짐");
  }
}
