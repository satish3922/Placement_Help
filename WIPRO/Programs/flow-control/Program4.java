// Program 4th

/*
Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e
*/

import java.lang.*;
import java.io.*;

class Program4{
  public static void main(String[] args) {
    char first = 'a';
    char second = 'e';
    if(first>second){
      System.out.print(second);
      System.out.print(",");
      System.out.println(first);
    }
    else{
      System.out.print(first);
      System.out.print(",");
      System.out.println(second);
    }
  }
}
