// Program 15th

/*
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program16{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n =  sc.nextInt();
    for (int i=0;i<n;i++){
      for (int j=0;j<i+1;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
