/*
 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged. If the input is "xHix", then output is "Hi".
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String7{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1st String :");
    String s = sc.nextLine();
    int len = s.length();
    if(s.charAt(0)=='x' && s.charAt(len-1)=='x'){
      System.out.println(s.substring(1,len-1));
    }
    else if(s.charAt(len-1)=='x'){
      System.out.println(s.substring(0,len-1));
    }
    else if(s.charAt(0)=='x'){
      System.out.println(s.substring(1,len));
    }
    else{
      System.out.println(s);
    }
  }
}
