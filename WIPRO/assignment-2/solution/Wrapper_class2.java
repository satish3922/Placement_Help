package Assignment2;

public class Wrapper_class2 {
	public static void main(String[] args) {
		int val=Integer.parseInt(args[0]);
		System.out.println("Binary  equivalent: "+Integer.toBinaryString(val));
		System.out.println("Octal  equivalent: "+Integer.toOctalString(val));
		System.out.println("Hexadecimal  equivalent: "+Integer.toHexString(val));
		

	}
}
