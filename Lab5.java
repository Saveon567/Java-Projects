//A. Write code to generate a random character between 48 and 122 (inclusive). You can do this by first generating an integer value between 48 and 122 and then cast it as a char. Do this in a loop 100 times, concatenating each character to a String as each character is generated. When the loop completes, the string will contain 100 characters. Print the string of 100 characters.
//Remember that to generate a random number between a start and end value, the formula is:
//                  (int)(start + Math.random()*(end-start+1))       
//Loop through the string you just created, character by character using charAt(i), to count and print the following:
//System.out.println(“”);
//The total number of characters in the string (better be 100)
//The total number of digits
//The total number of letters
//The total number of upper-case letters
//The total number of lower-case letters
//The total number of characters not a letter or digit

//Sa'veon Hicks
//CISC 1115-MY11 
//Lab 5th
//March 28th
 

package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;
import java.util.Random;

public class Lab5 {
	
	

	public static void main(String[] args) {
		
	}
	//Scanner & Random Class Declared
	Random random = new Random();
	Scanner input = new Scanner (System.in);
	
	char genRandChar(char character1, char character2)	
	{
		//Getting Random Character
		char retVal;
		for(int i = min; i <=max; i++) {
		int getRandomValue = (int) (Math.random()*(max-min)) + min;
		System.out.println(getRandomValue);
		
		int value1 = (int) character1;
		int value2 = (int) character2;
		retVal=(char)(val1+(int)(Math.random()* ((value2-value1)+1));
		return retVal;
		
		System.out.println(“The total number of characters in the string”);
		System.out.println(“The total number of digits”);
		System.out.println(“The total number of letters”);
		System.out.println(“The total number of uppercase letters”);
		System.out.println(“The total number of lowercase letters”);
		System.out.println(“The total number of characters not a letter or digit
”);
	}
	
	

	}

}
