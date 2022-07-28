//CISC 1115-MY11 Lab 2



//Professor Ira Rudowsky
//Feb 28th 2022

//Write a program that reads in the following data, all entered on one line with at least one space separating them:
//a)	an integer representing a month
//b)	an integer representing the day of the month 
//c)	an integer representing a year
//1.	Check that the month is between 1 and 12. If it’s not, print an error message and end the program.
//2.	Day cannot be 0 or less nor can it be more than 31 for all months. Print an error message if these conditions occur and end the program. If day is in the range of 0 and 31, you will still need to check other conditions as noted below in 4.
//3.	Year cannot be less than 1. Print an error message if that occurs and end the program.

package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calendar {

	public static void main(String[] args) {
	
	//Declarations
	int months, day, year;	
	String Month;
	Scanner input = new Scanner(System.in);
	
	//Inputs & Outputs
	System.out.println("Please Enter The Month Of The Year");
	months = input.nextInt();
	
	System.out.println("Please Enter The Day Of The Year");
	day = input.nextInt();
	
	System.out.println("Please Enter The Year ");
	year = input.nextInt();
	
	//Identifying If Inputs Are Valid
	if(1<day && months<=12 && 1<=day && day<=31 && year>=1 )
	{
		if(months==4 || months==6 || months==9 || months == 11){
			if(day==31) {
			System.out.println("Invalid number of days ");
			
	
			}
		}	
		else if (months == 2)
		{
			if((year%4 == 0 &&  year%400 ==0 || year%400!= 0)) {
				if(day>=30) {
				System.out.println("Feb can not have 30 or more days");	
				
				}
			}
			else {
			if(day>=29) {
				System.out.println("No leap year can have only 28 days ");
			}
			System.out.println("This date is valid" );
		}//else
	}
		} // If 1<day
	else {
		if(1>months || months>12) System.out.println("Invalid Month ");
		else	if(year < 1 || day>31) System.out.println("Invalid Day ");
	}	  
}
}