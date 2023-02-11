//Sa'Veon Hicks

//CISC 1115 TR11
//Homework #7 Part 1

//Develop a JAVA program that plays the game rock-scissor-paper. The rules are as follows
//This program will have you create the game Rock-Scissor-Paper using arrays. You will play against the computer and see who does a better job.
//The optional part involves palying the computer against itself and seeing the results. Based on the rules of the game, what you expect the outcome to be? Do you get different results when you run the game 1,000, 10,000 and 100,000 times?
//Computer
//User
//Rock (0)
//Scissor (1)
//Paper (2)
//Rock (0)
//Draw
//Rock breaks scissor: user wins
//Paper covers rock: computer wins
//Scissor (1)
//Rock breaks scissor: computer wins
//Draw
//Scissor cuts paper: user wins
//Paper (2)
//Paper covers rock: user wins
//Scissor cuts paper: computer wins
//Draw
// 
//The program, using a method you write (call it roll012), generates a random number between 0 and 2 for the "computer". 
//The user (you) is asked to enter a number between 0 and 2. 
//Based on those numbers and the rules above, the program says what each player "selected", who won or if it's a draw. Play the game 10 times. Keep track of the number of times each "player" won and how many draws there were. Print this information after the game ends.
// 
//NOTE: (↲ means hit the Enter key)
// 
//Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >> 2 ↲
//The computer is paper, you are paper, it's a draw.
// 
//Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >>1 ↲
//The computer is rock, you are scissor, rock breaks scissor - computer wins.
// 
//Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >>2 ↲
//The computer is rock, you are paper, paper covers rock - you win.
// 
// 
//Part II. (optional, but fun)
//Run the game with the program generating random numbers for both the "user" and "computer". 
//(a) Loop 100 times and print the number of games won by each "player" and the number of draws. Don't print any prompts or individual game results; just the summary statistics.
//(b) Run the game 1,000 times and print the summary statistics
//(c) Run the game 10,000 times and print the summary statistics.
// 
//You can do this in one program with nested loop: outer one looping from 2 to 4, inner one looping on 102, 103 and 104

package io.github.vikeshpandey.currency;

//Imported Scanner Class
import java.util.Scanner;

//Imported Random Class
import java.util.Random;

//Class Name
public class Homework7 {
	//Main Method
	public static void main(String[] args) {
		
		//Scanner Declared Inside Main
		Scanner input = new Scanner(System.in);
		  
		
	      Random random = new Random();
	      
	      //Variables Declared - UserWin,ComputerWin, and Draw
	      int userWin = 0;
	      int computerWin = 0;
	      int draw = 0;
	      
	      //roll012() method - generate a random number between 0 and 2, representing the computer's choice of rock, paper, or scissors.
	      
	      
	      for (int i = 0; i < 10; i++) {
	    	  //Ask the user to input a number between 0 and 2 to represent their choice of rock, paper, or scissors.
	    	  //Rock (0)- Rock vs Rock = Draw, Rock vs Scissor == Computer Win , Rock vs Paper =  User Wins
	    	  //Scissor - Scissor vs Rock = Computer Wins, Scissor vs Scissor = Draw, Scissor vs Paper = User Wins
	    	  //Paper -  Paper vs Rock = User Wins , Paper vs Scissor = Computer Wins, Paper vs Paper = Draw
	    	  
	    	  //Asking user to input a number between 0 and 2 to represent their choice of rock, paper, or scissors.
	    	  System.out.print("Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >> ");
	    	  
	    	  //Reading in input for userChoice & computerChoice
	    	  int userChoice = input.nextInt();
	          int computerChoice = random.nextInt(3);
	          
	          //If Else Statement - Compare  computer's choice and user's choice to determine who wins or  draw.
	          System.out.print("The computer is ");
	          if (computerChoice == 0) {
	        	  System.out.print("rock, ");  
	          } else if (computerChoice == 1) {
	        	  System.out.print("scissor, ");
	          } else {
	        	  System.out.print("paper, ");
	          }
	          
	          System.out.print("you are ");
	          if (userChoice == 0) {
	        	  System.out.print("rock, "); 
	          } else if (userChoice == 1) {
	        	  System.out.print("scissor, ");
	          } else {
	        	  System.out.print("paper, ");
	          }
	          if (userChoice == computerChoice) {
	        	  System.out.println("it's a draw.");
	        	  draw++;	        
	          } else if ((userChoice == 0 && computerChoice == 1) || (userChoice == 1 && computerChoice == 2) ||
	          (userChoice == 2 && computerChoice == 0))	{
	        	  System.out.println("you win.");
	              userWin++;
	          } else {
	        	  System.out.println("computer wins.");
	              computerWin++; 
	          }
	      }
	      System.out.println("User wins: " + userWin);
	      System.out.println("Computer wins: " + computerWin);
	      System.out.println("Draw: " + draw);

	}

}
