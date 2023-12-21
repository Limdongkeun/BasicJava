package com.basic.basicjava.javaBasic.extends1.access.child;

import com.basic.basicjava.javaBasic.extends1.access.parent.Parent;

public class Child extends Parent {
  
  public void call() {
    publicValue = 1;
    protectedValue = 1;
    // defaultValue = 1; 다른 패키지라 접근 불가
    // privateValue = 1; 접근 불가
    
    publicMethod();
    protectedMethod(); // 다른 패키지 이지만 상속이기 때문에
    //defaultMethod();
    //privateMethod();
    
    printParent();
  }
}
