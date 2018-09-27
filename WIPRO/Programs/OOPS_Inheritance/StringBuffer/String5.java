/*
 Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string length will be at least 2.
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String5{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String s = sc.nextLine();
    int len = s.length();
    if(len<3){
      System.out.println("null");
    }
    else{
      System.out.println(s.substring(1,len-1));
    }
  }
}
