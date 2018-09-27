import java.lang.*;
import java.io.*;

class string_length {
	public static void main(String[] args) {
		String name = "madam";
		String reverse = "";
		int i = 0;
		int j = 0;
		int len = name.length();
		for(i=len-1;i>=0;i--){
			reverse = reverse + name.charAt(i);
		}
		if(name.equals(reverse)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
} 
