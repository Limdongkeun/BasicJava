package com.basic.basicjava.javaBasic.poly.diamond;

public class DiamondMain {
  public static void main(String[] args) {
    Child child = new Child();
    
    
    child.methodA();
    child.methodB();
    child.methodCommon();
    
    InterfaceA interfaceA = new Child();
    interfaceA.methodA();
    interfaceA.methodCommon();
    
    InterfaceB interfaceB = new Child();
    interfaceB.methodB();
    interfaceB.methodCommon();
  }
}
