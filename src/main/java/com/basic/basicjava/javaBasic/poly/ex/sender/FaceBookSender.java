package com.basic.basicjava.javaBasic.poly.ex.sender;

public class FaceBookSender implements Sender{
  @Override
  public void sendMessage(String message) {
    System.out.println("페이스북 메세지를 전송합니다 : " + message);
  }
}
