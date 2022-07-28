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

import java.text.NumberFormat;
import java.util.Scanner;

public class Deposit3 {

	 public static double calculateMonthlyPayment(
		      int loanAmount, int termInYears, double interestRate) {
		
		 //Interest Rate Decimal  
	      interestRate /= 5.0;
	       
	      // Monthly interest rate 
	      // is the yearly rate divided by 12
	       
	      double monthlyRate = interestRate / 12.0;
	       
	      // The length of the term in months 
	      // is the number of years times 12
	       
	      int termInMonths = termInYears * 12;
	       
	      // Calculate the monthly payment
	      // Typically this formula is provided so 
	      // we won't go into the details
	       
	      // The Math.pow() method is used calculate values raised to a power
	       
	      double monthlyPayment = 
	         (loanAmount*monthlyRate) / 
	            (1-Math.pow(1+monthlyRate, -termInMonths));
	       
	      return monthlyPayment;
	   }
	    
	   public static void main(String[] args) {
	       	
		   // Scanner is a great class for getting 
		      // console input from the user
		       
		      Scanner scanner = new Scanner(System.in);
		 
		      // Prompt user for details of loan
		       
		      System.out.print("Enter loan amount: ");
		      int loanAmount = scanner.nextInt();
		       
		      System.out.print("Enter loan term (in years): ");
		      int termInYears = scanner.nextInt();
		       
		      System.out.print("Enter interest rate: ");
		      double interestRate = scanner.nextDouble();
		      
		   // Display details of loan
		       
		      double monthlyPayment = 
		         calculateMonthlyPayment(loanAmount, termInYears, interestRate);
		       
		 
		      // NumberFormat is useful for formatting numbers
		      // In our case we'll use it for 
		      // formatting currency and percentage values
		       
		      // Display details of the loan
		      
		      NumberFormat currencyFormat = 
		    	         NumberFormat.getCurrencyInstance();
		    	      NumberFormat interestFormat = 
		    	         NumberFormat.getPercentInstance();
		    	      
		    // Display details of the loan
		    	      
		    	      System.out.println("Loan Amount: "+
		    	    	         currencyFormat.format(loanAmount));
		    	    	      System.out.println("Loan Term: "+
		    	    	         termInYears+" years");
		    	    	      System.out.println("Interest Rate: "+
		    	    	         interestFormat.format(interestRate));
		    	    	      System.out.println("Monthly Payment: "+
		    	    	         currencyFormat.format(monthlyPayment));
		   
		   }
		 
		}    
	