// Program 11th

/*
Write a program to print even numbers between 23 and 57, each number should be printed in a separate row.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program11{
  public static void main(String[] args) {
    for (int i = 24; i <= 56; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}
