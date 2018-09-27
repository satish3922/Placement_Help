/*
 Given 2 strings, a and b, return a string of the
 form short+long+short, with the shorter string on
 the outside and the longer string on the inside.
 The strings will not be the same length, but
 they may be empty (length 0).If input is "hi"
 and "hello", then output will be "hihellohi".
*/


import java.lang.*;
import java.util.*;
import java.io.*;

class String6{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1st String :");
    String s1 = sc.nextLine();
    System.out.print("2nd String :");
    String s2 = sc.nextLine();
    int len1 = s1.length();
    int len2 = s2.length();
    if(len1==len2){
      System.out.println("null");
    }
    else if(len1==0){
      System.out.println(s1+s2+s1);
    }
    else if(len2==0){
      System.out.println(s2+s1+s2);
    }
    else{
      if(len1>len2){
        System.out.println(s2+s1+s2);
      }
      else{
        System.out.println(s1+s2+s1);
      }
    }

  }
}
