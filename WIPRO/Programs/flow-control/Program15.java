// Program 15th

/*
 Write a program to add all the values in a given number and print.
 Example: 1234 -> 10
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program15{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n =  sc.nextInt();
    int n1 = n;
    int rem;
    int sum = 0;
    while(n!=0){
      rem = n%10;
      sum  = sum + rem;
      n = n/10;
    }
    System.out.format("%d -> %d",n1,sum);
    System.out.println();
  }
}
