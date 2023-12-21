package com.basic.basicjava.javaBasic.access.ex;

public class CountMain {
  
  public static void main(String[] args) {
    
    MaxCounter maxCounter = new MaxCounter(3);
    
    maxCounter.increment();
    maxCounter.increment();
    maxCounter.increment();
    maxCounter.increment();
    maxCounter.increment();
    maxCounter.increment();
    int max = maxCounter.getCount();
    
    System.out.println("max = " + max);
  }
}
