/*
 Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive. For example if the inputs are “Wipro” and 3, then the output should be “propropro”.
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String12{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String s = sc.nextLine();
    System.out.print("Enter Num :");
    int n = sc.nextInt();
    // char[] ch = new char[n];
    String sub = s.substring(s.length()-n);
    String res = "";
    for(int i=0;i<sub.length();i++){
      res = res + sub;
    }
    System.out.println(res);

    // System.out.println(res.replace('\u0000',sub));
  }
}
