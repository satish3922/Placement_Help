/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
If the inputs are "Hello" and "World", then the output is "HWeolrllod".
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1st String :");
    String s1 = sc.nextLine();
    System.out.print("2nd String :");
    String s2 = sc.nextLine();
    StringBuffer sb = new StringBuffer();
    for(int i=0;i<s1.length();i++){
      sb.append(s1.charAt(i));
      sb.append(s2.charAt(i));
    }
    System.out.println(sb.toString());;
  }
}
