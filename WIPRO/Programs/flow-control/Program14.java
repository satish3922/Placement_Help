// Program 14th
/*
Write a program to check if a given number is prime or not
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program14{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int flag = 0;
    int l = n/2;
    if(n==0){
      System.out.format("%d is neither prime nor composite",n);
    }
    else if(n==1){
      System.out.format("%d is neither prime nor composite",n);
    }
    else{
      for(int i=2;i<l;i++){
        if(n%i==0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        System.out.format("%d is a prime number",n);
      }
      else{
        System.out.format("%d is not a prime number",n);
      }
    }
    System.out.println();
  }
}
