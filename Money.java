//Sa'veon Hicks CISC 1115 Lab #2

//CISC 1115-MY11
//Professor Ira Rudowsky
//Feb 9th 2022

//This program begin by printing, as part of the output, in addition to the comment at the beginning of my code, a header for the lab (or homework) that looks like the following:
// ------------------------------------------------------------------
// --------
// Sa'veon Hicks
// CISC 1115 MY11
// Lab2
// -------------------------------------------------------------------
// -------

//Write a program that will read an integer from the keyboard, which represents a dollar and cents amount, such as 732567 and prints out:
//732567 is 7 thousand 3 hundred 2 tens 5 dollars and 67 cents

//Input of 12354 would print
//12354 is 0 thousand 1 hundred 2 tens 3 dollars and 54 cents

//Or, for input of 10000 the program will print
//10000 is 0 thousand 1 hundred 0 tens 0 dollars and 0 cents

//Input of 1254 would print
//1254 is 0 thousand 0 hundred 1 tens 2 dollars and 54 cents

//Another example,
//054 is 0 thousand 0 hundred 0 tens 0 dollars and 54 cents

//One way to do this is to use integer division and the mod operator (%) as we discussed in the lecture but, if you have another way, go for it.
// One set of code should work for any amount read in as a double. Assume the input amount is never greater than 9999999
//Run a number of examples like those above to test your code.

package io.github.vikeshpandey.currency;

//Importing Scanner Class From Java.Util Package
import java.util.Scanner;

//Class Name Is Named After The Lab Assignment Number
public class Money {
	
	//Main Method Declared
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("--------------------------------------------------------------------------");
	        System.out.println("-------");
	        System.out.println("Sa'Veon Hicks");
	        System.out.println("Feb 9th");
	        System.out.println("CISC 1115 MY11");
	        System.out.println("Lab2");
	        System.out.println("--------------------------------------------------------------------------");
	        System.out.println("-------");
		 
		 //Asking The User To Enter A Amount $0.00
		 //The Amount Will Be Saved In --> int amount and then broken down into thousands, hundreds, tens, dollars, and cents.
	     System.out.print("Enter an integer dollar and cents amount: ");
	     int amount = input.nextInt();
	     
	     //Dividing The Total Amount Into Thousands,Hundreds,Tens,Dollars, & Cents
	     int thousands = amount / 1000;
	     
	     int hundreds = (amount % 1000) / 100;
	     
	     int tens = ((amount % 1000) % 100) / 10;
	     
	     int dollars = ((amount % 1000) % 100) % 10;
	     
	     int cents = amount % 100;
	     
	     //Output
	     System.out.print(amount + " is " + thousands + " thousand " + hundreds + " hundred " + tens + " tens " + dollars + " dollars and " + cents + " cents");

	}

}
