package com.basic.basicjava.javaBasic.oop1;

public class MusicPlayerMain2 {
  public static void main(String[] args) {
    
    MusicPlayerData musicPlayerData = new MusicPlayerData();
    
    
    //켜기
    musicPlayerData.isOn = true;
    System.out.println("시작");
    
    //볼륨 증가
    musicPlayerData.volume++;
    System.out.println("볼륨" + musicPlayerData.volume);
    
    //볼륨 증가
    musicPlayerData.volume++;
    System.out.println("볼륨" + musicPlayerData.volume);
    
    //볼륨 감소
    musicPlayerData.volume--;
    System.out.println("볼륨" + musicPlayerData.volume);

    //플레이어 상태
    System.out.println("플레이어 상태 확인");
    
    if (musicPlayerData.isOn) {
      System.out.println("ON " + musicPlayerData.volume);
    }else {
      System.out.println("OFF" + musicPlayerData.volume);
    }
    
    //끄기
    musicPlayerData.isOn = false;
    System.out.println("플레이어 꺼짐");
  }
}
