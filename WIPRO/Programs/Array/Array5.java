// Program 5th
/*
 Write a program to find the largest 2 numbers and
 the smallest 2 numbers in the given array.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Array5{
  public static void main(String[] args) {
    int[] arr = {2,1,6,5,9,12};
    int max1 = 0;
    int max2 = 0;
    int min1 = 9999;
    int min2 = 9999;

    for(int i : arr){
        if(max1<i){
          max2 = max1;
          max1 = i;
        }
        else{
          max2 = i;
        }
    }
    for(int i : arr){
        if(min1>i){
          min2 = min1;
          min1 = i;
        }
        else if(min2>i && min1!=i){
          min2 = i;
        }
    }
    System.out.println(max1);
    System.out.println(max2);
    System.out.println(min1);
    System.out.println(min2);

  }
}
