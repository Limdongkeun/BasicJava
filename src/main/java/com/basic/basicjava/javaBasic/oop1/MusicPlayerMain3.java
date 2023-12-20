package com.basic.basicjava.javaBasic.oop1;

public class MusicPlayerMain3 {
  public static void main(String[] args) {
    
    MusicPlayerData musicPlayerData = new MusicPlayerData();
    
    
    //켜기
    on(musicPlayerData);
    
    //볼륨 증가
     volumeUp(musicPlayerData);
    
    //볼륨 증가
    volumeUp(musicPlayerData);
  
    //볼륨 감소
    volumeDown(musicPlayerData);
    
    playerStatus(musicPlayerData);
    
    //끄기
    off(musicPlayerData);
    
    playerStatus(musicPlayerData);
    
  }
  
  
  static void on(MusicPlayerData musicPlayerData) {
    musicPlayerData.isOn = true;
    System.out.println("시작");
  }
  static void off(MusicPlayerData musicPlayerData) {
    musicPlayerData.isOn = false;
    System.out.println("꺼짐");
  }
  
  static void volumeUp(MusicPlayerData musicPlayerData) {
    musicPlayerData.volume++;
    System.out.println("볼륨" + musicPlayerData.volume);
  }
  static void volumeDown(MusicPlayerData musicPlayerData) {
    musicPlayerData.volume--;
    System.out.println("볼륨" + musicPlayerData.volume);
  }
  
  static void playerStatus(MusicPlayerData musicPlayerData) {
    //플레이어 상태
    System.out.println("플레이어 상태 확인");
    
    if (musicPlayerData.isOn) {
      System.out.println("ON " + musicPlayerData.volume);
    }else {
      System.out.println("OFF" + musicPlayerData.volume);
    }
  }
}
