package Assignment2;
import java.util.Scanner;

public class Wrapper_class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String bin=Integer.toBinaryString(n);
		
		 
		if(bin.length()<=8)
			bin=String.format("%0"+ (8 - bin.length() )+"d%s",0 ,bin);
		System.out.println(bin);
	}

}
