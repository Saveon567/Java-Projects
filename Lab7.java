//This is very similar to the "mapping" example we went over in class.
//Fred wants to analyze his spending habits of the past few years and has gathered information on the checks he has written from 2014 – 2018. The data is in a file in the form  YYYY XXXXXX.XX where YYYY represents the year and XXXXXX.XX represents the dollar amount of the check. Because it took a while to gather the information, the data is not in year order. See the Input Data at the end of the assignment.
//After reading in the data, he wants to print a report by year of the number of checks written, the total amount spent and the average amount of the check. Also, an overall total of the five years appears after the individual data of each year. Using
//one array to store the running total of the check amounts by year,
//an array to hold the number of checks written by year
//write the Java code to read and store the data and then do the necessary computations to produce a report in the format below. Use printf to display the dollar amounts with two decimal place and right adjust all output. You can set an int variable baseYear to 2014 and subtract it from the actual year to get the correct subscript in each array.
//Sample report
//Year
//# Checks
//Total Spent
//Average Check
//2014
//25
//3452.23
//198.02
//.
//.
//.
//.
//.
//.
//.
//.
//.
//.
//.
//.
//2018
//33
//1097.87
//125.67
//Overall Total
//254
//15478.98
//167.65 
//The numbers appearing in the sample report above are not related to the actual input data to follow. 
//Input Data
//2017 876.20
//2014 345.67
//2014 100.00
//2016 345.89
//2017 45.34
//2015 89.23
//2016 1000.00
//2017 239.09
//2018 67.89
//2018 198.00
//2015 145.45
//2018 180.00
//2015 505.23
//2014 78.65
//2014 42.98
//2014 370.00
 
//Sa'veon Hicks
//CISC 1115 MY11 Lab 7 
//April 2
 
package io.github.vikeshpandey.cisc1115hw;


//Imports Inbound
import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Lab7 {
	
	//Privates Inbound
	private static int[] checkIssued={0,0,0,0,0};
	
	private static double[] totalAmount={0,0,0,0,0};
	
	private static final int BASE_YEAR=2014; 
	
	private static final String INPUT_FILE="D:\\inputdata";

	public static void main(String[] args) {
		

		try {

			populateData();

			} catch (FileNotFoundException e) {

			System.out.println(INPUT_FILE+" program . Program will close now.");

			System.exit(1);
	   }
		    reportSpending();
		    
	}
	public static void populateData() throws FileNotFoundException {
		
		Scanner fileInput = new Scanner(new File(INPUT_FILE));

		while(fileInput.hasNext()){

		String[] lineTokens = fileInput.nextLine().split("\\s+");

		if(lineTokens.length==2){

		int year = Integer.parseInt(lineTokens[0].trim());

		double amount = Double.parseDouble(lineTokens[1].trim());

		checkIssued[year-BASE_YEAR]+=1;

		totalAmount[year-BASE_YEAR]+=amount;
		
		}
		
		}
		
	    }
	
		public static void reportSpending(){
			
			System.out.println(String.format("%-13s%-15s%-15s%-15s","Year","# Checks","Total Spent","Average Check"));

			System.out.println(String.format("%-15d%-15d$%-15.2f$%-15.2f",2014,checkIssued[0],totalAmount[0],totalAmount[0]/checkIssued[0]));

			System.out.println(String.format("%-15d%-15d$%-15.2f$%-15.2f",2015,checkIssued[1],totalAmount[1],totalAmount[1]/checkIssued[1]));

			System.out.println(String.format("%-15d%-15d$%-15.2f$%-15.2f",2016,checkIssued[2],totalAmount[2],totalAmount[2]/checkIssued[2]));

			System.out.println(String.format("%-15d%-15d$%-15.2f$%-15.2f",2017,checkIssued[3],totalAmount[3],totalAmount[3]/checkIssued[3]));

			System.out.println(String.format("%-15d%-15d$%-15.2f$%-15.2f",2018,checkIssued[4],totalAmount[4],totalAmount[4]/checkIssued[4]));
			
			int totalChecks = checkIssued[0]+checkIssued[1]+checkIssued[2]+checkIssued[3]+checkIssued[4];

			double totalSpent = totalAmount[0]+totalAmount[1]+totalAmount[2]+totalAmount[3]+totalAmount[4];

			System.out.println(String.format("%-15s%-15d$%-15.2f$%-15.2f","Overall Total",totalChecks,totalSpent,totalSpent/totalChecks));


  }
}
