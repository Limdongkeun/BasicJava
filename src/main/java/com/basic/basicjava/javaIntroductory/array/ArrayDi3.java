package com.basic.basicjava.javaIntroductory.array;

public class ArrayDi3 {
  public static void main(String[] args) {
    
    int[][] arr = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    
    System.out.println("arr.length = " + arr.length);
    for (int row = 0; row < arr.length; row++) {
      for (int colum = 0; colum < arr[row].length; colum++) {
        System.out.print(arr[row][colum] + " "); //0열 출력
      }
      System.out.println(); //한 행이 끝나면 라인을 변경한다.
      System.out.println("arr[row].length = " + arr[row].length);
    }
  }
}
