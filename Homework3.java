//Sa'Veon Hicks 
//CISC 1115 Homework #3

//Create a program that reads in the following data, all entered on one line with at least one space separating them:
//1. an integer representing a month
//2. an integer representing the day of the month
//3. an integer representing a year

//1. Check that the month is between 1 and 12. If it's not, print an error message and end the program.

//1. Day cannot be 0 or less nor can it be more than 31 for all months. Print an error message if these conditions occur and end the program. If day is in the range of 0 and 31, you will still need to check other conditions as noted below in 4.

//1. Year cannot be less than 1. Print an error message if that occurs and end the program.

//If any one of these three conditions occurs, only one error message should print and no further code should be executed. If everything is good so far, then continue as below:

//Check that day is correct for the month. Remember the poem
//"30 days hath September, April, June and November, 
// All the rest have 31 except February which has 28 but in a leap year has 29"

//For all months, except February, you can check if the date is valid by the poem above.

//If the month has more days than allowed, print a message saying month  number NN can not have XXX days (e.g., if the input is 6 31 2018 the message should say month 6 cannot have 31 days)

//If the month is February, you'll need to check if the year is a leap year and then decide if the date is correct.

//We reviewed in class the code to determine a leap year. A year is a leap year if 
//(1) it's divisible by 400 OR 
//(2) the year is divisible by 4 AND not divisible by 100.    

//So, if it's a leap year any day up to and including 29 is valid, otherwise 28 is the largest date in February. If February has too many days, e.g., the input is 2 29 2001, print an error message stating 
//2001 is not a leap year, Feb can have only 28 days

//1. At any point that you determine that a date is valid, print a message in the format
//5 18 2017 is a valid date

//1. Your code should print only one message if a date is valid.

//2. If it's invalid, print only one error message. It a date has more than one error for example, the input is 6 45 -1234, it doesn't matter which error you pick first as long as you indicate only one error.

//THESE TEST CASES MUST BE INCLUDED IN YOUR OUTPUT:
//6 30 2017
//6 31 2017
//-3 12 2019
//2 29 2000
//2 30 2000
//2 -12 2019
//9 31 1998
//2 29 2001
//6 32 -109
//11 32 2017
//2 28 2001
//2 28 1900
//2 29 1900
 
//There are many ways to approach this problem. I recommend coding the input statements and steps 1-3 first and making sure they work properly. 

//Then move on to step 4. 
//If the month is NOT February, then there's no need to check for a leap year.  Just check if the month is Sept, April, June or Nov in which case it should have no more than 30. You already checked that no month has more than 31 in step 2 so there's no need to check again.

//If the month is February, check if it's a leap year in which case 29 is the max; not a leap year 28 is the max. At any point in the code, if a date is invalid print a message to that effect and end the program. If all the tests have passed, then the date is valid.  You should test your code for determining a leap year separately to make sure it works before you include it in the full solution.

//As you code the program, test as you complete a new step. For example, test that the month, day and year read in correctly. Add to that the code that checks if the month is between 1 and 12. If that works, test if the day is between 1 and 31. If that works, test if the year is 1 or greater. Don't write the entire program and then test it; that makes debugging much more difficult. Test one piece and add to it if it works, etc., etc.

package io.github.vikeshpandey.currency;

//Scanner Declared
import java.util.Scanner;

//The Class Is Named After The Homework Assignment
public class Homework3 {

	public static void main(String[] args) {
		
		//Scanner Deployed Inside The Class
		Scanner input = new Scanner(System.in);
		
		//Variables Declared
		int month , day, year;
		
		//Input & Output Declared
		System.out.print(" Please Enter the month, day, and year");
		month = input.nextInt();
		day = input.nextInt();
		year = input.nextInt();
		
		//Verifying if the month is between 1 and 12
		if (month < 1 || month > 12) {
			System.out.println("Error !: The Month must be between 1 and 12.");
			System.exit(0);
		}
		
		//Verifying if the day is not 0 or negative, nor more than 31.
		if (day <= 0 || day > 31) {
			System.out.println("Error !: The Day cannot be 0 or negative, no more than 31.");
			System.out.print(0);
		}
		//Verifying if the year is not less than 1.
		if (year < 1) {
			System.out.println("Error !: The Year cannot be less than 1.");
			System.exit(0);
		}
		//Verifying if the day is correct for the month.
		switch(month) {
			case 2: // February
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))  {
				if (day > 29) {
					 System.out.println(year + " is a leap year, The month of February can only have 29 days.");
					 System.exit(0);
				}
				} else {
					if (day > 28) {
						  System.out.println(year + " not a leap year, The month of February can only have 28 days.");
						  System.exit(0);
					}
				}
				break;
				
				// April
				case 4: 
				
				// June	
				case 6: 
				
				// September	
				case 9: 
				
				// November	
	            case 11: 
	            if (day > 30) {
	            System.out.println("Month " + month + " cannot have " + day + " days.");
	            System.exit(0);      
	            }
	            break;
	            default:
	                break;
			}
		
		 // Print the valid date
		System.out.println(month + " " + day + " " + year + " valid date.");
		
	}
}
