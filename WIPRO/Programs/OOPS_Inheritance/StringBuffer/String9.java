/*
 Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String9{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String s = sc.nextLine();
    int len = s.length();
    StringBuffer sb = new StringBuffer();
    int j = 0;
    for(int i=0;i<len;i++){
      if(s.charAt(i)!='*'){
        if(i==0 && s.charAt(i+1)!='*'){
          sb.append(s.charAt(i));
        }
        else if(i==len-1 && s.charAt(len-1)!='*'){
          sb.append(s.charAt(i));
        }
      }
    }
    System.out.println(sb);
  }
}
