/*
 Given two strings, append them together (known as "concatenation")
 and return the result. However, if the concatenation creates a double-char,
 then omit one of the chars. If the inputs are “Mark” and “Kate” then the
 ouput should be “markate”.(The output should be in lowercase)
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1st String :");
    String first = sc.nextLine().toLowerCase();
    System.out.print("2nd String :");
    String second = sc.nextLine().toLowerCase();
    int n = first.length();
    if(first.charAt(n-1)==second.charAt(0)){
      second = second.substring(1);
      first = first.concat(second);
    }
    else{
      first = first.concat(second);
    }
    System.out.println(first);
  }
}
