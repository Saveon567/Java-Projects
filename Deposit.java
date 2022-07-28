//Write a program that prompts the user to enter a monthly amount you deposit in the account (could contain cents) and a yearly interest rate (e.g., 4.25). The program will first print the values you entered for monthly deposit and yearly interest rate, followed by the six, monthly calculations showing the month number and value of the account at the end of each month (with two decimal places) up to and including the 6th month.


//Let’s get started. Begin with using the following variables:

//double monthlyDeposit - the amount you put into your account each month. 
//Read in from the keyboard

//double yearlyIntRate – the yearly interest rate. Read in from the keyboard.

//double monthlyIntRate – computed as yearlyIntRate/100/12

//The monthly interest rate is the yearly rate divided by 100 and then divided by 12.
//For example, a 5% interest rate is converted to .05 for calculation purposes and then .05 is divided by 12 to get a monthly rate of 0.00417.

//double monthlyValue – initialized to 0. Stores the current value of the account at the end of the month using the formula:                
//monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate); 

//After each calculation, print the month number and monthlyValue (see sample output above). Repeat the calculation for all six months

//To help you see what’s going on with the calculations, here are the first three. 
//After the first month, the value of the account (initialzed to 0) becomes

//monthlyValue = (200 + 0)*(1+.00833333) which equals 201.66

//Note that the monthly interest rate is .00833333 which is 10/100/12

//After the second month, the value in the account becomes 
//monthlyValue =  (100 + 201.66) *(1+0.0083333) which equals 405.0 or
//(monthly deposit + value at the end of first month) *(1+ monthlyIntRate)

//After the third month the account now contains
//monthlyValue = (100 + 405.0) *(1+0.00833333) which equals 610.04 or
//(monthly deposit + value at the end of second month) *(1+ monthlyIntRate)
//and so on.

package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;
public class Deposit {
	public static void main(String[] args) {
		
		//Declaring Variables
		
		double monthlyDeposit, yearlyIntRate, monthlyIntRate,monthlyValue = 0, currentbalance;
		
		int months;
		
		//Formulas
		yearlyIntRate = 100/12;
		monthlyValue = (200 + 0)*(1+.00833333);
		monthlyValue =  (100 + 201.66) *(1+0.0083333);
		monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate); 
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount" + monthlyDeposit );
		monthlyDeposit =in.nextDouble();
		System.out.print("Enter the annual interest rate in percentage: " + yearlyIntRate);
		yearlyIntRate = in.nextDouble();
		System.out.print("Enter number of savings months: " + months );
		months = in.nextInt();
		for (int i =6; i <= months; i++) {
		
		
		
	}

  }
}
