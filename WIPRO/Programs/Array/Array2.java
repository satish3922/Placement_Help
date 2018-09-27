// Program 2nd
/*
Write a program to initialize an integer array and
find the maximum and minimum value of an array.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Array2{
  public static void main(String[] args) {
    int[] arr = {2,5,6,45,1};
    int max = arr[0];
    int min = arr[0];
    int len = arr.length;
    for(int i=0;i<len;i++){
      if (arr[i]>max){
        max = arr[i];
      }
      else if(arr[i]<min){
          min = arr[i];
      }
      else{
          continue;
      }
    }
    System.out.print("Array is : ");
    for(int i:arr){
      System.out.print(i);
      System.out.print(" ");
    }
    System.out.println();
    System.out.format("Maximum : %d\n",max);
    System.out.format("Minimum : %d\n",min);
  }
}
