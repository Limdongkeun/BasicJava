package com.basic.basicjava.javaIntroductory.operator;

public class Logical1 {
  public static void main(String[] args) {

    System.out.println("&&: AND 연산");
    System.out.println("true && true : " + (true && true)); //true
    System.out.println("true && false : " + (true && false));//false
    System.out.println("false && false : " + (false && false));//false


    System.out.println("||: OR 연산");
    System.out.println("true || true : " + (true || true)); //true
    System.out.println("true || false : " + (true || false));//true
    System.out.println("false || false : " + (false || false));//false


    System.out.println("! 연산");
    System.out.println("!true : " + !true); //false
    System.out.println("!false : " + !false); //true


    System.out.println("변수 활용");
    boolean a = true;
    boolean b = false;
    System.out.println("a && b : " + (a && b)); // false
    System.out.println("a || b : " + (a || b)); // true
    System.out.println("!a : " + !a); // false
    System.out.println("!b : " + !b); // true
  }
}
