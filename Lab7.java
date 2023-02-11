//Sa'Veon Hicks
//CISC 1115 TR11
//Lab #7 

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
// 
//The numbers appearing in the sample report above are not related to the actual input data to follow.
// 
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
 

package io.github.vikeshpandey.currency;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

//Class Name
public class Lab7 {
	//Main Method
	public static void main(String[] args) {
		
		//Declaring Variables
		
		//Integer -baseYear, numChecks, totalChecks
		
		//Double - totalEachYear, totalSpent
		
		//String - fileName,
		int baseYear = 2014;
		
		int[] numChecks = new int[5];
		
		double[] totalEachYear = new double[5];
		
		String fileName = "InputData.txt";
		
		//Declaring File
		File file = new File(fileName);
		
		try {
			Scanner reader = new Scanner(file);
			
			while(reader.hasNext()) {
				int year = reader.nextInt();
				int yearIndex = year - baseYear;
				
				numChecks[yearIndex]++;
				double spending = reader.nextDouble();
				totalEachYear[yearIndex] += spending;	
			}
			//Closing Reader
			reader.close();
			
		    } catch (FileNotFoundException e) {
		    	System.out.println(fileName + " cannot be found");
		    }
		    
		int totalChecks = 0;
		double totalSpent = 0;
		
		System.out.printf("%-15s%-10s%-15s%s\n", "Year", "# Checks", "Total Spent", "Average Check");
		for(int i = 0; i < numChecks.length; i++) {
			double averageEachYear = totalEachYear[i] / numChecks[i];
			System.out.printf("%-10d%13d%13.2f%17.2f\n", baseYear + i, numChecks[i], totalEachYear[i], averageEachYear);
			totalChecks += numChecks[i];
			totalSpent += totalEachYear[i];
		}
		
		double totalAverage = totalSpent / totalChecks;
		System.out.printf("%-10s%10d%13.2f%17.2f", "Overall Total", totalChecks, totalSpent, totalAverage);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
