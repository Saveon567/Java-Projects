//Sa'Veon Hicks
//CISC 1115 TR11
//Homework 6

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
//2.	The outer loop is the same as above but the inner loop will use use indexOf to search for the ch from the outer loop and increase a counter by 1 each time indexOf returns a value greater than -1. A loop will continue searching with indexof, starting from the position after it just find ch, until it returns a -1. If the counter is greater than 0, then ch and the count are printed. Continue with the outer loop.
//
//countChars(text, '0','9'); will print the number of occurrences of each character from 0 to 9. 
//
//You can count any individual character, say period, by using a period for start and end countChars(text, '.','.');
//
//Write the code for and invoke the method countChars to count and print the number of each character from a to z, A , 0 to 9, , to , and . to . from the sample input below. 
//
//Use this text as your sample input
//Michael Mandel, an associate professor in the Computer Information Science Department, has just secured a five-year grant worth more than $500,000 from the National Science Foundation to analyze audio recordings from the Alaskan wilderness. This analysis will allow researchers to study the migration patterns of animals like songbirds, waterfowl, and caribou and assess how they are affected by climate change and noises generated by human activity. 
//
//
//4. Write a method that you can use in your homework and labs to print a header with your name, class/section, assignment type (HW or LAB), assignment number and due date. These will be parameters of your method which you will then plug-in to your code. This way, you can copy the code from assignment to assignment and reuse it by just changing the values you pass to the method. Your name and class/section can be hardcoded if you like or added as additional parameters.
//
//public static void header(String type, int num, String dueDate)
//
//would be invoked in main as header(“HW”, 5, “11/2/2017”);
//
//Sharing a PrintWriter object
//In order to use the same file for output in main and in any methods, declare the PrintWriter object in main and pass the name of the PrintWriter as a parameter to the method.
//
//Assuming the PrintWriter object identifier in main is called output the method header should be expanded as follows:
//
//public static void header(PrintWriter pw, String type, int num, String dueDate)
//
//Then print using pw.println(….); 
//
//The header method would be invoked in main as 
//  header(output, “HW”, 5, “11/2/2017”);
package io.github.vikeshpandey.currency;

//Importing I/O Streams Package
import java.io.*;

import java.util.*;

//Class Name
public class Homework6 {

	//Main Method & Exception Handling(throws) Declared
	public static void main(String[] args) throws IOException  {
		 
		//Sample input
		//Michael Mandel, an associate professor in the Computer Information Science Department, has just secured a five-year grant worth more than $500,000 from the National Science Foundation to analyze audio recordings from the Alaskan wilderness. This analysis will allow researchers to study the migration patterns of animals like songbirds, waterfowl, and caribou and assess how they are affected by climate change and noises generated by human activity. 
		//Read 4 to 5 sentences from a file, line by line, and concatenate them into one String called text. Print the entire String text. 
		 BufferedReader br = new BufferedReader(new FileReader("SampleInput.txt"));
		 StringBuilder sb = new StringBuilder();
	     String line = br.readLine();
	     while (line != null) {
	    	 sb.append(line).append("\n");
	         line = br.readLine();
	     }
	        String text = sb.toString();
	        System.out.println(text);
	        
	        //Variables Declared - letterCount,digitCount,otherCount
	        int letterCount = 0;
	        int digitCount = 0;
	        int otherCount = 0;
	        
	        //2. Count the total number letters (regardless of the case), the total number of digits (0 to 9) and the total number of all other characters. Do this by looping through the String text once, extracting the character at each position in the string and determining whether it’s a letter, digit or other and using three counters to accumulate the totals.
	        	        
	        for (int i = 0; i < text.length(); i++) {
	        	char ch = text.charAt(i);
	        	if (Character.isLetter(ch)) {
	        		letterCount++;	        		
	        	} else if (Character.isDigit(ch)) {
	        	   digitCount++;
	        	} else {
	        	otherCount++;	
	        	}
	        }
	        //
	        System.out.println("Letter count: " + letterCount);
	        System.out.println("Digit count: " + digitCount);
	        System.out.println("Other count: " + otherCount);
	        
	        }
	//countChars method - the first parameter, text, is the string to search, the second parameter, start, is the character to start searching for and the third parameter, end, is the last character to search for. These last two parameters will control a for loop. You have only one counter in the method. 
	//the method will search the string for all occurrences of each character from start to end, one at a time, and print the character and number of times it appeared in the string if it was greater than zero. It will count all a’s, then all b’s, etc. Note that we went over similar code in the chapter on Strings using nested loops.
	
	//For example, if you invoked the function by writing
	//countChars(text, 'a','z');
	
	//Here are two suggestions on how to do this:
	//1.	Use nested for loops where the outer loop goes from char ch=start to       ch <= end and the inner loop goes from int i=0 to text.length()-1 invoking the String method charAt() to extract the character at position i.   Compare that character to ch from the outer loop – match: increase a counter by 1; no match: continue looping on the inner loop. When the end of the String is reached, print ch and the count if it’s greater than 0. Continue with the outer loop.
	//2.	The outer loop is the same as above but the inner loop will use use indexOf to search for the ch from the outer loop and increase a counter by 1 each time indexOf returns a value greater than -1. A loop will continue searching with indexof, starting from the position after it just find ch, until it returns a -1. If the counter is greater than 0, then ch and the count are printed. Continue with the outer loop.

	public static void countChars(String text, char start, char end) {
		int count = 0;
		for (char ch = start; ch <= end; ch++) {
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ch) {
					count++;					
			}
		}
			 if (count > 0) {
				 System.out.println(ch + ": " + count); 
			 }
			 count = 0;
			 
			
		
		
		
		
		
		
		
		
	}
		
			
		}

}