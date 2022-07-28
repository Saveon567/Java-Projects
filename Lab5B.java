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

package io.github.vikeshpandey.cisc1115hw;
import java.util.Scanner;

public class Lab5B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Please Enter Your Social Security Number: ");
	    Input.nextInt();
	    
	    
		
	    public static boolean checkSSN(String social) {
	        boolean valid = false;
	        // 9 digits and 2 hyphens. First three characters, 5 and 6, and 8, 9,
	        // 10, 11 are digits
	 
	        // Check that the length is valid
	        if (social.length() == 11) {
	            valid = true;
	        } else {
	            valid = false;
	        }
	 
	        // Check that the characters are valid
	        // Valid as digits
	        char index0 = social.charAt(0);
	        char index1 = social.charAt(1);
	        char index2 = social.charAt(2);
	        char index4 = social.charAt(4);
	        char index5 = social.charAt(5);
	        char index7 = social.charAt(7);
	        char index8 = social.charAt(8);
	        char index9 = social.charAt(9);
	        char index10 = social.charAt(10);
	        // Valid as hyphen
	        char index3 = social.charAt(3);
	        char index6 = social.charAt(6);
	 
	        if (Character.isDigit(index0) && Character.isDigit(index1)
	                && Character.isDigit(index2) && Character.isDigit(index4)
	                && Character.isDigit(index5) && Character.isDigit(index7)
	                && Character.isDigit(index8) && Character.isDigit(index9)
	                && Character.isDigit(index10)) {
	            valid = true;
	        } 
	        else
	            valid = false;
	 
	        if (index3 == '-' && index6 == '-') {
	                valid = true;
	        }
	        else
	            valid = false;
	        return valid;
	    }
	}

	}

}
