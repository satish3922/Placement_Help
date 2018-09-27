// Program 13th

/*
Write a program to print prime numbers between 10 and 99.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program13{
  boolean prime(int n){
    int flag = 0;
    int l = n/2;
    if(n==0 || n==1){
      return (false);
    }
    else{
      for(int i=2;i<l;i++){
        if(n%i==0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        return (true);
      }
      else{
        return (false);
      }
    }
  }
  public static void main(String[] args) {
    Program13 o = new Program13();
    for(int i=11;i<99;i++){
      if(o.prime(i)){
        System.out.print(i);
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
