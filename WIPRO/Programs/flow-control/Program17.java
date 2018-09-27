// Program 17th

/*
Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program17{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n =  sc.nextInt();
    String s = Integer.toString(n);
    int len = s.length();
    String res = "";
    for(int i=len-1;i>=0;i--){
      res  = res + s.charAt(i);
    }
    System.out.println(res);
  }
}
