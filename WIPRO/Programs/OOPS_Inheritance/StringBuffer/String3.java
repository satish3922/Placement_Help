/*
 Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
 If input is "Wipro" then output should be "WiWiWiWiWi".
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String s = sc.nextLine();
    int len = s.length();
    String result = "";
    if(len == 1){
      System.out.println(s);
    }
    else{
      String substr = s.substring(0,2);
      for(int i=0;i<len;i++){
        result = result + substr;
      }
      System.out.println(result);
    }


  }
}
