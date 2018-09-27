// program 5th

/*
Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"
*/

import java.lang.*;
import java.io.*;

class Program5{
  public static void main(String[] args) {
    char ch = 'a';
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
      System.out.println("Alphabet");
    }
    else if(Character.isDigit(ch)){
      System.out.println("Digit");
    }
    else{
      System.out.println("Special Character");
    }
  }
}
