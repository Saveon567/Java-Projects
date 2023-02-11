//Sa'Veon Hicks
//CISC 1115 TR11
//Homework #7 Part 2

//Part II. (optional, but fun)
//Run the game with the program generating random numbers for both the "user" and "computer". 
//(a) Loop 100 times and print the number of games won by each "player" and the number of draws. Don't print any prompts or individual game results; just the summary statistics.
//(b) Run the game 1,000 times and print the summary statistics
//(c) Run the game 10,000 times and print the summary statistics. 
//You can do this in one program with nested loop: outer one looping from 2 to 4, inner one looping on 102, 103 and 104


package io.github.vikeshpandey.currency;

//Imported Random Class
import java.util.Random;

//Class Name
public class Homework7Part2 {
	//Main Method
	public static void main(String[] args) {
		  
		
		  //Random Class Declared Inside Main
	      Random random = new Random();
	   
	      //(a) Loop 100 times and print the number of games won by each "player" and the number of draws. Don't print any prompts or individual game results; just the summary statistics.
	      //(b) Run the game 1,000 times and print the summary statistics
	      //(c) Run the game 10,000 times and print the summary statistics.	
	      //You can do this in one program with nested loop: outer one looping from 2 to 4, inner one looping on 102, 103 and 104
	      for (int j = 2; j <= 4; j++) {
	          int games = (int) Math.pow(10, j);
	      
	      //Declaring Variables - userWin, computerWin, draw
	      int userWin = 0;
	      int computerWin = 0;
	      int draw = 0; 
	      
	      for (int i = 0; i < games; i++) {
	    	  int userChoice = random.nextInt(3);
	          int computerChoice = random.nextInt(3); 
	          
	          if (userChoice == computerChoice) {
	        	  draw++;  
	          }  else if ((userChoice == 0 && 
	          computerChoice == 1) || (userChoice == 1 && computerChoice == 2) || (userChoice == 2 &&	
	          computerChoice == 0)) {
	        	  userWin++;
	          } else {
	        	  computerWin++;
	          }
	      }
	      //Output Results
	      //After playing the game 10 times, the program will print the following results showing the number of wins for each player and number of draws.
	      System.out.println("After " + games + " games:");
	      System.out.println("User wins: " + userWin);
	      System.out.println("Computer wins: " + computerWin);
	      System.out.println("Draw: " + draw);
	      System.out.println();    
	   }
	}	      
}
