//Sa'Veon Hicks
//CISC 1115 TR11 
//Homework Lab 4



//Using a loop of your choice, read information from the console about employees in a company. Each employee has an ID (integer) and number of hours worked that week (double) and hourly pay rate (double)
//After you read in an employee’s information, you will calculate the salary for that week by multiplying the number of hours worked by the hourly rate. Number of hours and hourly rate should be real numbers with one or two decimal places.
//Print a statement clearly indicating the employee ID, number of hours worked, hourly rate and the total salary for that week.
//Use a counter variable to keep track of how many employees were processed.
//Continue reading information for all employees, processing and printing the information as above until the ID less than or equal to 0. When the ID is 0 or less, you should not be entering hours worked or hourly rate. This means you should read ID separately and continue reading the rest of the data per employee only if ID is > 1.
//When the loop is done, print the total number of employees processed by the program and the total salary of all employees.
//Now add to your program printf statements so that the hours worked and salary will print with two decimal places. Create fixed columns for each piece of data (ID, hors worked, hourly rate and total salary). Numbers should be right adjusted so the dollars and cents line up. Run the program again with the same data and see what the output looks like now. Print the program and the output.
//Add an if-else statement in your program to compute tax on the salary. If the salary is less than $300, the tax rate is .03, if salary is between $300 and $350 the tax rate is .04; otherwise the tax rate is .05. Compute the tax by multiplying the salary by the tax rate. Add the tax as another column of your output table. Print the program and the output.
//Use these values as input to cover all three tax groups
//ID  Hours  Hourly rate
//187  12.5          15.8
//972  15.25         21.2
//201  18.9         20.25
//OUTPUT EXAMPLE NOT USING SAMPLE DATA ABOVE
//Enter id, 0 or less to stop 123
//Enter hours and rate 18.75 22.5
// 
//   id hours  rate  salary   tax   total
//  123 18.75 22.50  421.88 21.09  442.97
//Enter id, 0 or less to stop 987
//Enter hours and rate  20.50 13.25
// 
//   id hours  rate  salary   tax   total
//  987 20.50 13.25  271.63  8.15  279.77
//Enter id, 0 or less to stop 456
//Enter hours and rate  12 8.75
// 
//  id hours  rate  salary   tax   total
//  456 12.00  8.75  105.00  3.15  108.15
//Enter id, 0 or less to stop
//0
//Number of employees 3
//Total salary is   798.50 Average salary is   266.17
//Total tax is 32.39 Average tax is 10.80
 
package io.github.vikeshpandey.currency;

////Imported Scanner Class
import java.util.Scanner;

//Class Name
public class Lab4 {
	//Main Method
	public static void main(String[] args) {
		
		 //Scanner Declared Inside Main Method 
		 Scanner scanner = new Scanner(System.in);
		 
		 //Variables Declared - totalSalary, totalTax, & Count
		 double totalSalary = 0;
	     double totalTax = 0;
	     int count = 0;
	     
	     //Reading in the employee’s information
	     //Asking The Employee To Enter His/Her ID
	     System.out.print("Please Enter Your ID Number");
	     int id = scanner.nextInt();
	     
	     //Asking The Employee To Enter The Number Of Hours They Worked & Their Hourly Rate
	     System.out.print("Please Enter The Number Of Hours You Worked And Your Hourly Rate ");
	     
	     //Reading In The Employees Hours & Hourly Rate
	     double hours = scanner.nextDouble();
         double rate = scanner.nextDouble();
         
         //Calculating Salary
         double salary = hours * rate;
         
         //Calculating Tax Rate Based On Salary
         double tax;
         if (salary < 300) {
        	 tax = .03;
         } else if (salary == 300 && salary <= 350) {
        	  tax = .04;
         } else {
        	 tax = .05;
         }
         //Calculating Tax Amount
         double tax_amount = salary * tax;
         
         //Calculating Total Salary 
         double total = salary + tax_amount;
         
         //Presenting Employee Information
         System.out.printf("\n%5s %5s %5s %6s %5s %6s\n", "id", "hours", "rate", "salary", "tax", "total");
         System.out.printf("%5s %5.2f %5.2f %6.2f %5.2f %6.2f\n", id, hours, rate, salary, tax_amount, total);
         
         //Updating The Number Of Employees In The Workplace
         count++;
         
         //Updating The Employees Salary Total & Their Tax Amount
         totalSalary += salary;
         totalTax += tax_amount;
         
         //Asking The User To Enter Another Employee ID
         System.out.print("Please Enter Your ID Number ");
         
         //Reading in the id of the next employee
         id = scanner.nextInt();
         
         //Calculating Average Salary And Tax Amount
         double averageSalary = totalSalary / count;
         double averageTax = totalTax / count;
         
         //Presenting The Total Number Of Employees, Salary, & Tax
         System.out.printf("Number of employees %d\n", count);
         System.out.printf("Total salary is %8.2f Average salary is %8.2f\n", totalSalary, averageSalary);
         System.out.printf("Total tax is %.2f Average tax is %.2f\n", totalTax, averageTax);

    }      	 
}

