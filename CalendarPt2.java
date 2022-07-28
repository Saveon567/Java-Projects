//Sa'veon Hicks
//Professor Ira Rudowsky
//CISC 1115 MY11
//May 3rd 2022

//Write a program that reads in the following data, all entered on one line with at least one space separating them:
//a)	an integer representing a month
//b)	an integer representing the day of the month 
//c)	an integer representing a year
//1.	Check that the month is between 1 and 12. If it’s not, print an error message and end the program.
//2.	Day cannot be 0 or less nor can it be more than 31 for all months. Print an error message if these conditions occur and end the program. If day is in the range of 0 and 31, you will still need to check other conditions as noted below in 4.
//3.	Year cannot be less than 1. Print an error message if that occurs and end the program.

package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;

public class CalendarPt2 {

	public static void main(String[] args) {
		
		//Scanner Inbound
		Scanner input = new Scanner(System.in);
		
		//Introduction To My Program
		System.out.println("Welcome To My CISC 1115 Homework 3");
		System.out.println("Please Enter The Date (Month,Day,Year)");
		
		//Variables Deployed
		int months;
		months = input.nextInt();
		
		int day;
		day = input.nextInt();
		
		int year;
		year = input.nextInt();
		
		//If Else Statement Inbound
		if(months < 1 || months > 13)
			System.out.println("Invalid Month");
		
		else if(day < 1 || day > 31)
			System.out.println("Invalid Day");
		
		else if(year < 1)
			System.out.println("Invalid Year");
		
		else if((months == 4 || months == 6 || months == 9 || months == 11) && (day > 30))
			System.out.print("Invalid Date");	
		
		else if(months == 2){
		boolean leapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		
		if(leapYear && day > 29)
			System.out.println("February can't have no more than 29 days");
		
		else if(!leapYear && day > 28)
			System.out.println("February can't have no more than 28 days");
		else
			System.out.println(months + " " + day + " " + year + "is a valid date" );
		
		}
	}

}
