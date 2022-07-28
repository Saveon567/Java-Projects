//Sa'veon Hicks

//CISC 1115 MY11
//April 11th

//Write a Java program to do the following. Note: all output should be written to a file using PrintWriter and that file should be printed and handed in with your code. 
//
//1. Read 4 to 5 sentences from a file, line by line, and concatenate them into one String called text. Print the entire String text. (See sample text below)
//
//2. Count the total number letters (regardless of the case), the total number of digits (0 to 9) and the total number of all other characters. Do this by looping through the String text once, extracting the character at each position in the string and determining whether it’s a letter, digit or other and using three counters to accumulate the totals.
//
//3. Next write a method called countChars which is defined as follows:
//
//public static void countChars(String text, char start, char end)
//
//the first parameter, text, is the string to search, the second parameter, start, is the character to start searching for and the third parameter, end, is the last character to search for. These last two parameters will control a for loop. You have only one counter in the method. 
//
//For example, if you invoked the function by writing
//countChars(text, 'a','z');
//
//the method will search the string for all occurrences of each character from start to end, one at a time, and print the character and number of times it appeared in the string if it was greater than zero. It will count all a’s, then all b’s, etc. Note that we went over similar code in the chapter on Strings using nested loops.
//
//Here are two suggestions on how to do this:
//1.	Use nested for loops where the outer loop goes from char ch=start to       ch <= end and the inner loop goes from int i=0 to text.length()-1 invoking the String method charAt() to extract the character at position i.   Compare that character to ch from the outer loop – match: increase a counter by 1; no match: continue looping on the inner loop. When the end of the String is reached, print ch and the count if it’s greater than 0. Continue with the outer loop.
//2.	The outer loop is the same as above but the inner loop will use use indexOf to search for the ch from the outer loop and increase a counter by 1 each time indexOf returns a value greater than -1. A loop will continue searching with indexof, starting from the position after it just find ch, until it returns a -1. If the counter is greater than 0, then ch and 
package io.github.vikeshpandey.cisc1115hw;

import java.io.FileWriter;
import java.io.IOException;

public class Homework6 {

	public static void main(String[] args) {
		
		try {
		FileWriter fw = new File Writer();
		fw.write("");
		fw.close();
		
		 System.out.println("");
		 catch (IOException e) {
			 System.out.println("");	 
		 }
		}
		

	}

}
