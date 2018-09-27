package Assignment2;

class Calculator {
	static int  powerInt(int num1,int num2) {
		if(num2==0)return 1;
		else if(num1==1)return 1;
		else  {
			return(num1*powerInt(num1,num2-1));
		}
	}
		static double powerDouble(double num1,double num2) {
			return Math.pow(num1, num2);
		}
}

class A2Q2{
	public static void main(String [] args) {
		// TODO Auto-generated constructor stub
	
	int pint=Calculator.powerInt(4, 5);
	double pdbl=Calculator.powerDouble(2.5, 3);
	System.out.println("Integer power = "+pint);
	System.out.println("double power = "+pdbl);
	}
	
}
