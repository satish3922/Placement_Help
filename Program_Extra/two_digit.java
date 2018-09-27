import java.lang.*;
import java.io.*;

class two_digit {
	public static void main(String[] args) {
		int n = 5271;
		String name = Integer.toString(n);
		String reverse = "";
		int i = 0;
		int s;
		int j = 0;
		int len = name.length();
		for(i=len-1;i>=0;i--){
			reverse = reverse + name.charAt(i);
			s = Character.getNumericValue(name.charAt(i));
			j = j + s;
			System.out.println(j);
		}
		System.out.println(reverse);
	}
} 
