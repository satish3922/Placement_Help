// Program 12th

/*
Write a program to check if a given number is prime or not
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program12{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int flag = 0;
    int l = n/2;
    if(n==0){
      System.out.println("not prime");
    }
    else{
      for(int i=2;i<l;i++){
        if(n%i==0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        System.out.println("prime");
      }
      else{
        System.out.println("not prime");
      }
    }
  }
}
