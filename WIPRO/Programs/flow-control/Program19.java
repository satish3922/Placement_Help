// Program 19th

/*
 Write a program to print first 5 values which are divisible by 2, 3, and 5.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program19{
  public static void main(String[] args) {
    int n=200;
    int j=0;
    int a[] = new int[5];
    for(int i=30;i<n;i++){
      if(i%2==0 && i%3==0 && i%5==0){
        System.out.print(i);
        System.out.print(" ");
        j=j+1;
      }
      if(j==5){
        break;
      }
    }
    System.out.println();
  }
}
