//Sa'Veon Hicks

//CISC 1115 Lab 3

//A shipping company uses the following function to calculate the cost in dollars of shipping based on the weight of the package (in pounds)
//Note that if you already checked and the weight is NOT less than or equal 1 pound (say it’s 1.5 pounds), that means it’s automatically greater than one pound so you don’t have to check in the next if statement if it’s greater than 1 pound, since it must be otherwise you would not be testing if it’s less than or equal to 3 pounds. 
//Just check that it’s less than or equal to 3 pounds. No AND or OR conditions are required (which we haven’t learned yet).

//Weight
//Cost
//Less than or equal to 0 pounds display a message “Invalid input”
//Less than or equal to 1 pound
//$3.50
//Greater than 1 but less than or equal to 3 pounds
//$5.50
//Greater than 3 but less than or equal to 10 pounds
//$8.50
//Greater than 10 bit less than or equal to 20 pounds
//$10.50
//If the weight is greater than 20 pounds, display a message “The package can not be shipped”.

//Write a program that prompts the user to enter the weight of the package and displays the shipping cost or an appropriate error message.

//Test your program with the following inputs:
//-10
//0
//0.5
//1
//7.25
//20
//21

package io.github.vikeshpandey.currency;

//Scanner Class Imported
import java.util.Scanner;

//Class Name 
public class Pounds {

	//Main Method Declared
	public static void main(String[] args) {
		
		//Scanner Declared
		Scanner input = new Scanner(System.in);
		
		//Asking the user to enter the weight(lbs) of the package 
		System.out.print("How much does your package weigh ? lbs: ");
		
		//input.nextDouble = retrieves the user's input and converts it to Double
		double weight = input.nextDouble();
		
		//Closing Scanner
		input.close();
		
		//IfElse Statement - Determines the shipping cost of the package based on its weight.
		
		//Less than or equal to 0 pounds display a message 
		if(weight <= 0) {
		System.out.println("Invalid input");
		}
		//Less than or equal to 1 pound
		else if(weight <= 1) {
		System.out.println("Shipping cost $3.50");	
		}
		//Greater than 1 but less than or equal to 3 pounds
		else if(weight <= 3) {
		System.out.println("Shipping cost $5.50");	
		}
		//Greater than 3 but less than or equal to 10 pounds
		else if(weight <= 10) {
		System.out.println("Shipping cost $8.50");	
		}
		//Greater than 10 bit less than or equal to 20 pounds
		else if(weight <= 20) {
		System.out.println("Shipping cost $10.50");	
		}
		//If the weight is greater than 20 pounds, display a message “The package can not be shipped”.
		else {
		System.out.println("The package cannot be shipped");	
		}
	}

}
