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

public class Lab5BPart4 {

	public static void main(String[] args) {
		
		System.out.println("Welcome To CISC 1115 Lab 5B Part 1");

        //Declaration
        String str = "";
        int number = 0;
        char ch = 0;

        //Loop Declared & Inbound
        for(int i =1; i<=100; i++) {
            number = (int)(48 + Math.random()*(122-48+1));
            ch = (char)number;
            str = str + Character.toString(ch);
        }
        //Output Inbound
        System.out.println(str);
        System.out.println();

        //Another For Loop Deployed & Inbound
        int N = 0;
        int D = 0;
        int L = 0;
        int specchar = 0;
        int total = 0;

        for(int i=0; i<str.length(); i++) {
            total++;
            char ch1 = str.charAt(i);
            if(Character.isDigit(ch1)){
                D++;
            }
            else if(Character.isLetter(ch1)){
                L++;
            }
            else {
                specchar++;
            }
        }
        //Final Results Inbound
        System.out.println("Amount Of Characters: " + total);
        System.out.println("Amount Of Digits: " + D);
        System.out.println("Amount Of Letters:" + L);
        System.out.println("Amount Of Special Characters:" + specchar);
        System.out.println("Total: "+ total);	

	}

}
