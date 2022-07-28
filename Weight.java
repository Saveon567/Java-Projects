//Sa'veon Hicks




//CISC 1115-MY11 Lab 2
//Professor Ira Rudowsky
//Feb 7th 2022

//A shipping company uses the following function to calculate the cost in dollars of shipping based on the weight of the package (in pounds)
//Note that if you already checked and the weight is NOT less than or equal 1 pound (say it’s 1.5 pounds), that means it’s automatically greater than one pound so you don’t have to check in the next if statement if it’s greater than 1 pound, since it must be otherwise you would not be testing if it’s less than or equal to 3 pounds. Just check that it’s less than or equal to 3 pounds. No AND or OR conditions are required (which we haven’t learned yet).

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

// -10
// 0
// 0.5
// 1
// 7.25
// 20
// 21

package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) 
	{
		//Declarations
		double pounds = 0.0;
		double cost = 0.0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How much does your package weigh?");
		pounds = input.nextDouble();
		
		//Shipping Cost
		if (pounds <= 0) {
			System.out.println("Invalid input"  );
		} else if (pounds <= 1) {
			cost = 3.50;
			System.out.println("Your Total is : " +  3.50);
		} else if (pounds >= 1 && pounds <= 3) {
			cost =5.50;
			System.out.println("Your Total is : " + 5.50 );
		} else if (pounds >= 3 && pounds <= 10) {
			cost =8.50;
			System.out.println("Your Total is : " + 8.50);
		} else if (pounds >= 10 && pounds <=20) {	
			cost =10.50;
			System.out.println("Your Total is : " + 10.50 );
		} else if (pounds > 20) {
			System.out.println("The Package can not be shipped");
		} else if (pounds > 20)
			System.out.println("The Package can not be shipped");
		   
		
		
		
		
	}
}
