// Program 18th

/*
Write a Java program to find if the given number is palindrome or not
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program18{
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
    if(s.equals(res)){
      System.out.println(s+" is a Palindrome");
    }
    else{
      System.out.println(s+" is not a Palindrome");
    }
  }
}
