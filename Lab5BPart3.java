//B. Write a program that the The program Test cases ABC 123-A8-1234 12-345-6789 12345-6789 123-45-678A 123-45-678AB A


//. There’s a dash after
//prompts the user to enter an enhanced Social Security number as a string in
//format DDD-DD-DDDX where D is a digit from 0 to 9.The rightmost character, X, is legal if it’s
//between 0 and 9 or between A to Z.  should check whether the input is valid and in the correct format
// the first 3 digits and after the second group of 2 digits.
// If an input is invalid, print the input and the position in the string (starting from position 0) where the
// error occurred.
// If the input is valid, print a message that the Social Security number is valid
//cast it as a char
// Continue to ask for the next Social Security number but stop when a string of length 1 is entered.

//Sa'veon Hicks
//CISC 1115-MY11 Lab 5B Part 1 Redone Version
//Professor Ira Rudowsky
//April  11
package io.github.vikeshpandey.cisc1115hw;


public class Lab5BPart3 {

	public static void main(String[] args) {
		
		//Declaration
		String character = "";
		int number = 0;
		char chrctr = 0;
		int N = 0;
		int D;
		int L;
		int specchar;
		int total;
		
		
		//Introduction To Lab 5 Part 1
		System.out.println("Welcome To CISC 1115 Lab 5B Part 1");
		
		//Loop Inbound
		for(int i = 1; i<=100; i++) {
		number = (int)(48 + Math.random()*(122-48+1));
		chrctr = (char)number;
		character = character + Character.toString(chrctr);
		}
		//Output
		System.out.println(chrctr);
		System.out.println();
		
		for(int i=0; i<character.length(); i++) {
			total++;
			chrctr = character.charAt(i);
			if(Character.isDigit(chrctr)) {
			D++;
		}
		else if(Character.isLetter(chrctr)){
			L++;
		}
		else {
		specchar++;
		}
		
	total = N+D+L+specchar;
	System.out.println("Amount Of Characters: " + total);
	System.out.println("Amount Of Digits: " + D);
	System.out.println("Amount Of Letters:" + L);
	System.out.println("Amount Of Special Characters:" + specchar);
	System.out.println("Total: "+ total);
	}
 }				
}

