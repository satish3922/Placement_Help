/*
Given two strings, word and a separator, return a big string made of count occurrences of the word, separated by the separator string.
if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".
*/


import java.lang.*;
import java.util.*;
import java.io.*;

class String8{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Word String :");
    String word = sc.nextLine();
    System.out.print("Sep String :");
    String sep = sc.nextLine();
    System.out.print("Counter  :");
    int c = sc.nextInt();
    String res = word;
    for(int i=0;i<c-1;i++){
      res = res + sep + word;
    }
    System.out.println(res);
  }
}
