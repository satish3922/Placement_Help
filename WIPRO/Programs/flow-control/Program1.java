// Program 1st

/*
Write a program to check if a given number is Positive, Negative, or Zero.
*/

import java.lang.*;
import java.io.*;

class Program1{
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if(num<0)
      System.out.println("Negative");
    else if(num==0)
      System.out.println("Zero");
    else
      System.out.println("Positive");
  }
}
