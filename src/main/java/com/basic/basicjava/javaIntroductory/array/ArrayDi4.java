package com.basic.basicjava.javaIntroductory.array;

public class ArrayDi4 {
  public static void main(String[] args) {
    
    int[][] arr = new int[2][3];
    
   int i = 1;
   
   for (int row = 0; row < arr.length; row++) {
     for(int column = 0; column < arr[row].length; column++) {
       arr[row][column] = i++;
     }
   }
    
    for (int row = 0; row < arr.length; row++) {
      for (int colum = 0; colum < arr[row].length; colum++) {
        System.out.print(arr[row][colum] + " "); //0열 출력
      }
      System.out.println(); //한 행이 끝나면 라인을 변경한다.
    }
  }
}
