// Program 1st
/*
Write a program to initialize an integer array
and print the sum and average of the array.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Array1{
  public static void main(String[] args) {
    int[] arr = {2,5,6,4,3};
    int sum = 0;
    double avg = 0.0;

    for(int i : arr){
      sum = sum + i;
    }
    avg = avg + ((double)sum/arr.length);
    System.out.format("Sum is : %d",sum);
    System.out.println();
    System.out.format("Average is : %.1f",avg);
    System.out.println();

  }
}
