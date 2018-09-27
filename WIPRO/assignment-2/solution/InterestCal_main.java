package project4;
import java.util.Scanner;
abstract class Account{
double interestRate;
double amount;
Account(int amount){
	this.amount=amount;
}
abstract double calculateInterest();
}
class FDAccount extends Account{
	int noOfDays;
	int ageOfACHolder;
	FDAccount(int amount,int noOfDays,int ageOfACHolder){
		super(amount);
		this.noOfDays=noOfDays;
		this.ageOfACHolder=ageOfACHolder;
	}
	double calculateInterest() {
		if(amount<10000000) {
			if(noOfDays>=7 && noOfDays<=14) {
				if(ageOfACHolder<60) {
					return (double)(amount*4.50/100);
				}
				else
					return (amount*5.00/100);
			}
			else if(noOfDays>=15 && noOfDays<=29) {
				if(ageOfACHolder<60) {
					return (amount*4.75/100);
				}
				else
					return (amount*5.25/100);
			}
			else if(noOfDays>=30 && noOfDays<=45) {
				if(ageOfACHolder<60) {
					return (amount*5.50/100);
				}
				else
					return (amount*6.00/100);
			}
			else if(noOfDays>=45 && noOfDays<=60) {
				if(ageOfACHolder<60) {
					return (amount*7.0/100);
				}
				else
					return (amount*8.0/100);
			}
			else if(noOfDays>=61 && noOfDays<=184) {
				if(ageOfACHolder<60) {
					return (amount*7.50/100);
				}
				else
					return (amount*8.00/100);
			}
			else if(noOfDays>=185 && noOfDays<=365) {
				if(ageOfACHolder<60) {
					return (amount*8.00/100);
				}
				else
					return (amount*8.50/100);
			}
		}
		else {
			if(noOfDays>=7 && noOfDays<=14)
				return (amount*6.50/100);
			else if(noOfDays>=15 && noOfDays<=29)
				return (amount*6.75/100);
			else if(noOfDays>=30 && noOfDays<=45)
				return (amount*6.75/100);
			else if(noOfDays>=45 && noOfDays<=60)
				return (amount*8.0/100);
			else if(noOfDays>=61 && noOfDays<=184)
				return (amount*8.50/100);
			else
				return amount*10.0/100;
		}
		return 0.0;
	}
}
		
	
class SBAccount extends Account{
	String type;
	SBAccount(int amount,String type){
		super(amount);
		this.type=type;
	}
	double calculateInterest() {
		if(type.equals("Normal"))
			super.interestRate=4.0;
		else
			super.interestRate=6.0;
		return amount*interestRate/100;
	}
}
class RDAccount extends Account{
	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
	RDAccount(int noOfMonths,int monthlyAmount,int ageOfACHolder){
		super(monthlyAmount*12);
		this.noOfMonths=noOfMonths;
		this.ageOfACHolder=ageOfACHolder;
	}
	double calculateInterest() {
		if(noOfMonths<=6 && ageOfACHolder<60 )
			super.interestRate=7.50;
		else
			super.interestRate=8.00;
		if(noOfMonths<=9 && ageOfACHolder<60 )
			super.interestRate=7.75;
		else
			super.interestRate=8.25;
		if(noOfMonths<=12 && ageOfACHolder<60 )
			super.interestRate=8.00;
		else
			super.interestRate=825;
		if(noOfMonths<=15 && ageOfACHolder<60 )
			super.interestRate=8.25;
		else
			super.interestRate=8.75;
		if(noOfMonths<=18 && ageOfACHolder<60 )
			super.interestRate=8.50;
		else
			super.interestRate=9.00;
		if(noOfMonths<=21 && ageOfACHolder<60 )
			super.interestRate=8.75;
		else
			super.interestRate=9.25;
		return amount*interestRate/100;
		
	}
}


public class InterestCal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println();
		System.out.println("MAIN MENU");
		System.out.println("----------");
		System.out.println("   1.Interest Calculator - SB");
		System.out.println("   2.Interest Calculator - FD");
		System.out.println("   3.Interest Calculator - RD");
		System.out.println("   4.Exit");
		System.out.print("enter your option (1..4):");
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.print("Enter the type of  SB Account:");
			String type=sc.next();
			if(!type.equals("Normal") && !type.equals("NRI")) {
				System.out.println("Invalid type of account Please enter valid type under SB");
				break;
			}
			System.out.print("Enter the Average amount in your account:");
			int amount =sc.nextInt();
			Account sb=new SBAccount(amount,type);
			System.out.println("Interest gain ="+sb.calculateInterest());
			break;
		case 2:
			System.out.print("Enter the FD amount:");
			amount=sc.nextInt();
			System.out.print("Enter the number of days:");
			int days=sc.nextInt();
			System.out.print("Enter your age:");
			int age=sc.nextInt();
			if(days<0 || days >365 ||age <0) {
				System.out.println("Invalid Input . Please enter correct values.");
				break;
			}
			Account fd=new FDAccount(amount,days,age);
			System.out.println("Interest gain = "+fd.calculateInterest());
			break;
		case 3:
			System.out.print("Enter the RD amount:");
			amount=sc.nextInt();
			System.out.print("Enter the number of months:");
			int month=sc.nextInt();
			System.out.print("Enter your age:");
			 age=sc.nextInt();
			 if(month<0 ||age <0) {
					System.out.println("Invalid input. Please enter non-negative values.");
					break;
				}
			Account rd=new RDAccount(amount,month,age);
			System.out.println("Interest gain = "+rd.calculateInterest());
			break;
		case 4:
			System.out.println("Existing .....");
			System.exit(0);
		}
	}

	}

}
