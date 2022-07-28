//Write a program that plays the game rock-scissor-paper. The rules are as follows

//The program, using a method you write (call it roll012), generates a random number between 0 and 2 for the “computer”. 
//The user (you) is asked to enter a number between 0 and 2. 
//Based on those numbers and the rules above, the program says what each player “selected”, who won or if it’s a draw. Play the game 10 times. Keep track of the number of times each “player” won and how many draws there were. Print this information after the game ends.

//NOTE: (↲ means hit the Enter key)

//Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >> 2 ↲
//The computer is paper, you are paper, it’s a draw.

//Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >>1 ↲
//The computer is rock, you are scissor, rock breaks scissor – computer wins.

//Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >>2 ↲
//The computer is rock, you are paper, paper covers rock - you win.


//Part II. (optional, but fun)
//Run the game with the program generating random numbers for both the “user” and “computer”. 
//(a) Loop 100 times and print the number of games won by each “player” and the number of draws. Don’t print any prompts or individual game results; just the summary statistics.
//(b) Run the game 1,000 times and print the summary statistics
//(c) Run the game 10,000 times and print the summary statistics.

//You can do this in one program with nested loop: outer one looping from 2 to 4, inner one looping on 102, 103 and 104

//Sa'veon Hicks
//CISC 1115 Homework 7
// April 25th
package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;

public class Homework7 {
	
	public static void main(String[] args) {
		
		//Scanner & String Inbound
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 0 for rock, 1 for Scissors, or 2 for Paper:");
		int userChoice = input.nextInt();
		int compRand = roll012();
		int rock = 0;;
		int scissor = 1;
		int paper = 2;
		int draws = 0;
		int uWin = 0;
		int compWin = 0;
		//roll012();
		
		for(int i = 0; )
		
	}

}
