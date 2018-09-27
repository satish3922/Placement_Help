// Program 7th

/*
 Write a program to convert from upper case to lower case
 and vice versa of an alphabet and print the old character
 and new character as shown in example (Ex: a->A, M->m).
*/


import java.lang.*;
import java.io.*;

class Program7{
  public static void main(String[] args) {
    char ch = 'A';
    if (ch>='a' && ch<='z'){
      char c = (char)(ch-32);
      System.out.println(c);
    }
    else{
      char c = (char)(ch+32);
      System.out.println(c);
    }
  }
}
