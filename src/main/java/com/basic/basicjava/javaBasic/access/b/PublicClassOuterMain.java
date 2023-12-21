package com.basic.basicjava.javaBasic.access.b;

//import com.basic.basicjava.javaBasic.access.a.DefaultClass1;
import com.basic.basicjava.javaBasic.access.a.PublicClass;

public class PublicClassOuterMain {
  public static void main(String[] args) {
    PublicClass publicClass = new PublicClass();
    
//    접근제어자가 default 이기 때문에 다른 패키지에서 사용할 수 없다
//    DefaultClass1 defaultClass1 = new DefaultClass1();
//    DefaultClass2 defaultClass2 = new DefaultClass2();
  }
}
