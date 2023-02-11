//Sa'Veon Hicks 
//CISC 1115 Lab #5 Part 1

//A. Write JAVA code to generate a random character between 48 and 122 (inclusive).  The first step is to generate an integer value between 48 and 122 and then cast it as a char in a loop 100 times, concatenating each character to a String as each character is generated. When the loop completes, the string will contain 100 
//characters. Print the string of 100 characters. Remember that to generate a random number between a start and end value, the formula is: (int)(start + Math.random()*(end-start+1))Loop through the string you just created, character by character using charAt(i), to count and print the following:
//1.The total number of characters in the string (better be 100)
//2.The total number of digits
//3.The total number of letters
//4.The total number of upper-case letters
//The total number of lower-case letters
//The total number of characters not a letter or digit

package io.github.vikeshpandey.currency;

//The class is named after the Lab assignment 
public class Lab5 {

	//Main Method
	public static void main(String[] args) {
		
		//Variables Declared
		String randomChars = "";
		int digits = 0;
		int letters = 0;
		int upperCaseLetters = 0;
	    int lowerCaseLetters = 0;
	    int otherChars = 0;
	    
	    // For Loop Deployed - Used to generate a random character between 48 and 122
	    for (int i=0; i<100; i++) {
	    	int randomNum = (int)(48 + Math.random()*(122-48+1));
	    	char randomChar = (char)randomNum;
	    	randomChars += randomChar;
	    	
	    	//If Else Statement
	    	if (Character.isDigit(randomChar)) {
	    		 digits++;
	    	}  else if (Character.isLetter(randomChar)) {
	    	   letters++;
	    	   if (Character.isUpperCase(randomChar)) {
	    		   upperCaseLetters++;
	    	   } else {
	    		   lowerCaseLetters++;
	    	   }
	    	} else {
	    		otherChars++;
	    	}
	    }
	    //Output Results
	    
	    //String of 100 characters
	    System.out.println("String of 100 characters: " + randomChars);
	    
	    //Total number of characters
	    System.out.println("Total number of characters: 100");
	    
	    //Total number of digits:
	    System.out.println("Total number of digits: " + digits);
	    
	    //Total number of letters:
	    System.out.println("Total number of letters: " + letters);
	    
	    //Total number of upper-case letters:
	    System.out.println("Total number of upper-case letters: " + upperCaseLetters);
	    
	    //Total number of lower-case letters:
	    System.out.println("Total number of lower-case letters: " + lowerCaseLetters);
	    
	    //Total number of characters not a letter or digit:
	    System.out.println("Total number of characters not a letter or digit: " + otherChars);
	}

}
