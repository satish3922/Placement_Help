// Program 1st
/*
Write a program to initialize an array and print them in a sorted fashion
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Array6{
  public static void main(String[] args) {
    int[] arr = {5,23,6,4,8,9,12};
    int temp = 0;

    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i : arr){
      System.out.print(i);
      System.out.print(" ");
    }
    System.out.println();
  }
}
