// Program 4th
/*
 Initialize an integer array with ascii values and
 print the corresponding character values in a single row.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Array4{
  public static void main(String[] args) {
    int[] arr = {83,65,84,73,83,72};
    for(int i : arr){
      System.out.print((char)i);
      System.out.print(" ");
    }
    System.out.println();
  }
}
