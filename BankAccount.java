//Sa'Veon Hicks

//CISC 1115 Homework #2

//Suppose you deposit the same amount of money in a bank account each month at a given yearly interest rate and you want to know the value of the account at the end of each month. 
 
//Write JAVA program that prompts the user to enter a monthly amount you deposit in the account (could contain cents) and a yearly interest rate (e.g., 4.25). The program will first print the values you entered for monthly deposit and yearly interest rate, followed by the six, monthly calculations showing the month number and value of the account at the end of each month (with two decimal places) up to and including the 6th month. 
 
//Sample output for $200 monthly deposit and 10% interest rate: 
//monthly deposit: 200.0 yearly interest rate: 10.0
//month 1 value: 201.66
//month 2 value: 405.0
//month 3 value: 610.04
//month 4 value: 816.79
//month 5 value: 1025.26
//month 6 value: 1235.47
 
//Let's get started. Begin with using the following variables:
 
//double monthlyDeposit - the amount you put into your account each month. 
//Read in from the keyboard
//double yearlyIntRate - the yearly interest rate. Read in from the keyboard.
 
//double monthlyIntRate - computed as yearlyIntRate/100/12
//The monthly interest rate is the yearly rate divided by 100 and then divided by 12. For example, a 5% interest rate is converted to .05 for calculation purposes and then .05 is divided by 12 to get a monthly rate of 0.00417.
 
//double monthlyValue - initialized to 0. Stores the current value of the account at the end of the month using the formula:
                 
//           monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate); 
 
//After each calculation, print the month number and monthlyValue (see sample output above). Repeat the calculation for all six months
           
//To help you see what's going on with the calculations, here are the first three. 
//After the first month, the value of the account (initialzed to 0) becomes
//monthlyValue = (200 + 0)*(1+.00833333) which equals 201.66
//Note that the monthly interest rate is .00833333 which is 10/100/12
 
//After the second month, the value in the account becomes 
//monthlyValue =  (100 + 201.66) *(1+0.0083333) which equals 405.0 or
//(monthy deposit + value at the end of first month) *(1+ monthlyIntRate)
 
//After the third month the account now contains
//monthlyValue = (100 + 405.0) *(1+0.00833333) which equals 610.04 or
//(monthly deposit + value at the end of second month) *(1+ monthlyIntRate)
 
//and so on.
 
 
//DO NOT compute the value of the account for each month on paper and then plug it into the program. Write Java code to do the computations.

 
//Your assignment:
 
//Read in a monthly deposit of $100 and yearly interest rate of 5.0% and compute the account value for six months
 
//Using the same code as in part 1, run the program reading in a monthly deposit of $200.50 and yearly interest rate of 3.75%
 
 
//Suggestion (but not required) to structure your program:
//Declare your variables, initialize monthyValue to 0
//Read in monthly deposit and yearly interest rate
//Compute monthly interest rate  (divide yearly rate by 100 and by 12)
//Print monthly deposit amount and yearly interest rate
//Compute monthlyValue for the first month using the formula and print the month number and value
//Compute monthlyValue for the second month using the formula print the month number and value 
//Compute monthlyValue for the third month using the formula print the month number and value 
//Compute monthlyValue for the fourth month using the formula print the month number and value 
//Compute monthlyValue for the fifth month using the formula print the month number and value 
//Compute monthlyValue for the sixth month using the formula print the month number and value

package io.github.vikeshpandey.currency;

//Java Scanner Declared & Imported
import java.util.Scanner;

// Class Name
public class BankAccount {

	//Main Method
	public static void main(String[] args) {
		
		 //Scanner Inside Main Method
		 Scanner scanner = new Scanner(System.in);
		 
		 //Asking The User To Enter Monthly Deposit & Yearly Interest Rate
		//double monthlyDeposit - the amount you put into your account each month. 
	     System.out.println("Enter monthly deposit: ");
	     double monthlyDeposit = scanner.nextDouble();
	     
	     ////double yearlyIntRate - the yearly interest rate. Read in from the keyboard.
	     System.out.println("Enter yearly interest rate: ");
	     double yearlyIntRate = scanner.nextDouble();
	     
	     //Confirming The Users Input
	     System.out.println("monthly deposit: "+monthlyDeposit+ " yearly interest rate: " +yearlyIntRate);
	     
	     //Initialized To 0.
	     //double monthlyValue - initialized to 0. Stores the current value of the account at the end of the month using the formula:  
         //monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate); 
	     double monthlyValue = 0;
	     
	   //double monthlyIntRate - computed as yearlyIntRate/100/12
	   //The monthly interest rate is the yearly rate divided by 100 and then divided by 12. For example, a 5% interest rate is converted to .05 for calculation purposes and then .05 is divided by 12 to get a monthly rate of 0.00417.
	     double monthlyIntRate = yearlyIntRate/100/12;
	     
	     monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate);
	     monthlyValue = Math.floor(monthlyValue*100)/100;
	     System.out.println("month 1 value: " + monthlyValue);
	     
	     monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate);
	     monthlyValue = Math.floor(monthlyValue*100)/100;
	     System.out.println("month 2 value: " + monthlyValue);
	     
	     monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate);
	     monthlyValue = Math.floor(monthlyValue*100)/100;
	     System.out.println("month 3 value: " + monthlyValue);
	     
	     monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate);
	     monthlyValue = Math.floor(monthlyValue*100)/100;
	     System.out.println("month 4 value: " + monthlyValue);
	     
	     monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate);
	     monthlyValue = Math.floor(monthlyValue*100)/100;
	     System.out.println("month 5 value: " + monthlyValue);
	     
	     monthlyValue = (monthlyDeposit + monthlyValue) * (1 + monthlyIntRate);
	     monthlyValue = Math.floor(monthlyValue*100)/100;
	     System.out.println("month 6 value: " + monthlyValue);

	     
	}

}
