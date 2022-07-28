//Write a complete Java program, including comments, to do the following:  Your program will compute the monthly payment (monPayment - double) on a mortgage of amount principal (integer), with interest rate intRate (double) for numYears (integer) number of years. 
  
//The formula is written as follows:
//principal*(intRate/12)*(1+(intRate/12))numYears*12
//monPayment = ((1+(intRate/12))numYears*12 )-1
//For example if principal=$100,000, intRate=.07 and numYears=30 years then the monthly payment is $665. Check that your code yields the same number before you go any further.
//Use the pow function to raise a number to a power.  Math.pow(10,5) means 10 to the 5th power. To raise a*b to the power of c*d use Math.pow(a*b, c*d). 
//1. The program should start by printing a header giving your name, class/section and assignment number. Use a loop to print underscores ( _ ) as a horizontal line to add clarity to the report (see sample output below).
//2. The program will compute the monthly payment of loans starting at $100,000 up to an including $1,000,000 (in increments of $100,000) at 7 different interest rates (starting at .07 up to and including .1 in increments of .005). The outer loop will run from 100000 to 1000000 and the inner loop from .07 to .1 and the formula for computing the monthly payment will be part of the inner loop
//3. Use a printf statement for the column header, allowing 3 decimal places for the interest rate. The total field size for intRate should match what you use for the monthly payment (in the section below)
//4. Use printf statements for: (a) the principal having no decimal places and max size of 7 positions and (b) monthly payment containing 2 decimal places and up to 4 positions to the left of the decimal place. Align all numbers to the right and align the monthly payments with the interest rate header above it.
//The final result should look as follows. Your numbers and alignment should match exactly what appears below. Also, when you copy the output, the font should be Courier New or any other fixed font so that the columns will line up properly.  Be sure to comment your program.

//Sa'veon Hicks | CISC 1115-MY11  | Homework 4A 
package io.github.vikeshpandey.cisc1115hw;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) 
	{
		int id;
		int count=0;
		double hours;
		double rate;
		double tax;
		double salary;
		double totalSalary=0; 
		double totalTax = 0;
		
	    Scanner input = new Scanner (System.in);
	    System.out.println("Enter ID");
	    id = input.nextInt();
	    
		    while(id > 0){
		        System.out.println("Enter The Rate");
		        rate = input.nextDouble();
		    	
		        System.out.println("Enter The Hours");
		        hours = input.nextDouble();
		     
		        salary = hours*rate;
		        if(salary<300)
		            tax = salary*0.03;
		        else if(salary<=350)
		            tax = salary*0.04;
		        else 
		            tax=salary*0.05;

		        totalSalary = totalSalary+ salary;
		        totalTax = totalTax + tax;
		        count++;
		        System.out.printf("\n%5s%6s%6s%8s%6s%8s","id","hours","rate","salary","tax","total");
		        System.out.printf("\n%5d%6.2f%6.2f%8.2f%6.2f%8.2f",id,hours,rate,salary,tax,salary+tax);
		        System.out.println("\nEnter ID");
		        id = input.nextInt();
		    }
		    if (count> 0){
		        System.out.println("Number of employees "+count);
		        System.out.printf("Total salary is %8.2f Average salary is %8.2f\n",totalSalary,totalSalary/count);
		        System.out.printf("Total tax is %5.2f Average tax is %5.2f\n",totalTax,totalTax/count);

		    }
		    else System.out.println("No ");
		 		
		
		}
	}


