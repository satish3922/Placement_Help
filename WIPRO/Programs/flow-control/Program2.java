// program 2nd

/*
 Write a program to check if a given number is odd or even.
*/

import java.lang.*;
import java.io.*;

class Program2{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    if(n%2 == 0)
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
}
