package com.basic.basicjava.javaBasic.access;

public class SpeakerMain {
  public static void main(String[] args) {
    
    Speaker speaker = new Speaker(60);
    speaker.showVolume();
    
    speaker.volumeUp();
    speaker.volumeUp();
    speaker.volumeUp();
    speaker.volumeUp();
    speaker.volumeUp();
    speaker.volumeUp();
    speaker.volumeUp();
    
    speaker.volumeDown();
    speaker.showVolume();
    
//    //필드에 직접 접근
//    System.out.println("필드에 직접 접근");
//    speaker.volume = 200;
//    speaker.showVolume();
  }
}
