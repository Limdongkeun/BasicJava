package com.basic.basicjava.javaBasic.oop1;

public class MusicPlayerMain4 {
  public static void main(String[] args) {
    
    MusicPlayer musicPlayer = new MusicPlayer();
    
    musicPlayer.on();
    
    musicPlayer.volumeUp();
    musicPlayer.volumeUp();
    musicPlayer.volumeDown();
    
    musicPlayer.playerStatus();
    
    musicPlayer.off();
    
    musicPlayer.playerStatus();
    
  }
}
