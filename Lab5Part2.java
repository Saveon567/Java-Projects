//Sa'Veon Hicks
//CISC 1115 Lab 5 Part 2

//B. Write a program that prompts the user to enter an enhanced Social Security number as a string in the format DDD-DD-DDDX where D is a digit from 0 to 9. The rightmost character, X, is legal if it’s between 0 and 9 or between A to Z.
//The program should check whether the input is valid and in the correct format. There’s a dash after the first 3 digits and after the second group of 2 digits.
//If an input is invalid, print the input and the position in the string (starting from position 0) where the error occurred.
//If the input is valid, print a message that the Social Security number is valid.
//Continue to ask for the next Social Security number but stop when a string of length 1 is entered.

//Test cases
//ABC
//123-A8-1234
//12-345-6789
//12345-6789
//123-45-678A
//123-45-678AB
//A

package io.github.vikeshpandey.currency;

//Scanner Declared
import java.util.Scanner;

//The Class Is Named After The Hw Assignment
public class Lab5Part2 {

	//Main Method
	public static void main(String[] args) {
		
		 //Scanner Deployed
		 Scanner scanner = new Scanner(System.in);
		 
		 //Asking The User To Enter A Enhanced Social Security Number 
		 System.out.print("Please Enter A Social Security Number(DDD-DD-DDDX Format)");
		 
		 //While & If Else Statement Declared
		 //Checking whether the input is valid and in the correct format
		 while(true) {
			   String socialSecurityNum = scanner.nextLine();
			   if (socialSecurityNum.length() == 1) {
				   break;
			   }
			   ////If an input is invalid, it will print the input and the position in the string (starting from position 0) where the error occurred.
			   if (socialSecurityNum.length() != 11) {
			   System.out.println("Error: The Social Security Numbered You Entered Has A Invalid Length. Input: " + socialSecurityNum);  
			   continue;
			   }
			   if (!Character.isDigit(socialSecurityNum.charAt(0)) ||
		               !Character.isDigit(socialSecurityNum.charAt(1)) ||
		               !Character.isDigit(socialSecurityNum.charAt(2)) ||
		               socialSecurityNum.charAt(3) != '-' ||
		               !Character.isDigit(socialSecurityNum.charAt(4)) ||
		               !Character.isDigit(socialSecurityNum.charAt(5)) ||
		               socialSecurityNum.charAt(6) != '-' ||
		               !Character.isDigit(socialSecurityNum.charAt(7)) ||
		               !Character.isDigit(socialSecurityNum.charAt(8)) ||
		               !Character.isDigit(socialSecurityNum.charAt(9)) ||
		               !((Character.isDigit(socialSecurityNum.charAt(10))) || 
		               (socialSecurityNum.charAt(10) >= 'A' && socialSecurityNum.charAt(10) <= 'Z'))) {
				   //This Output Will Be Displayed When A 
				   System.out.println("Error: The Social Security Numbered You Entered Has A Invalid format. Input: " + socialSecurityNum);
			   	   } else {
			   		///If the input is valid, print a message that the Social Security number is valid.   
			   	   System.out.println("The Social Security number you entered is valid: " + socialSecurityNum);      
			   }
			   System.out.print("Please Enter A Social Security Number(DDD-DD-DDDX Format) ");
		 }
	           
		 
		

	}

}
