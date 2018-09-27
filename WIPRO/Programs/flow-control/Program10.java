// Program 10th

/*
Write a program to print numbers from 1 to 10 in a single row with one tab space.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program10{
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++){
      System.out.print(i);
      System.out.print("\t");
    }
    System.out.println();
  }
}
