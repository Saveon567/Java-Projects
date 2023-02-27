//Sa'Veon Hicks
//CISC 1115 TR11
//Homework #7 Part 3 

//The optional part involves palying the computer against itself and seeing the results. Based on the rules of the game, what you expect the outcome to be? Do you get different results when you run the game 1,000, 10,000 and 100,000 times?
package io.github.vikeshpandey.currency;

//Imported Scanner Class 
import java.util.Scanner;

//Imported Random Class
import java.util.Random;

//Class Name
public class RockPaperScissorsPart3 {
	
	//Main Method
	public static void main(String[] args) {
		
		//Scanner Declared
		Scanner sc = new Scanner(System.in);
		
		//Random Class Declared
	    Random random = new Random();
	    
	    //Variables
	    int userWin = 0;
	      int computerWin = 0;
	      int draw = 0;
	      
	      for (int i = 0; i < 10; i++) {
	    	  
	    	  System.out.print("Enter 0, 1 or 2 : (0) rock (1) scissor (2) paper >> ");
	    	  int userChoice = sc.nextInt();
	    	  
	    	  int computerChoice = random.nextInt(3);
	    	  
	    	  System.out.print("The computer is ");
	    	  if (computerChoice == 0) {
	    		  System.out.print("rock, ");	    	
	    	  }  else if (computerChoice == 1) {
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
	    	  } else if ((userChoice == 0 && computerChoice == 1)
	    	  || (userChoice == 1 && computerChoice == 2) || 
	    	  (userChoice == 2 && computerChoice == 0)) {
	    		  System.out.println("you win.");
	              userWin++; 
	    	  } else {
	    		  System.out.println("computer wins.");
	              computerWin++;
	    	  }		  
	      }
	      System.out.println();
	      System.out.println("After 10 games:");
	      System.out.println("User wins: " + userWin);
	      System.out.println("Computer wins: " + computerWin);
	      System.out.println("Draw: " + draw);

	}

}
