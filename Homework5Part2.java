//Sa'veon Hicks
/// CISC 1115 MY11 HW 5 Redone Version Part 2
//// May 3

//Your Java program will be reading input from a file name strInput.txt. Each record contains
//String firstname
//String lastName
//String strSalary (which will be converted to a double if it’s valid – see below)
//char status
//String cityState (city and state and combine together but separated by a comma)

//Sample input:
//Ira Rudowsky 87654.32 F Brooklyn,NY
//Jane Doe 987609.87 F NY,NY
//Mickey Mantle 345678.30 D Orlando,FL
//Fran Young 10456.82 G Boston,MA
//Richard Clark 67890.32 D Washington,DC
//Jack Smith 23489A.82 D Houston,TX
//Serena Williams 1295609.87 D Denver,CO

//Read from the file one record at a time and process as follows: 
//1.	Any record whose status code is neither D or F should be written to the screen indicating the error. The next record should be read in.
//2.	If the status code is D or F, validate the salary that it contains only digits and one decimal point 3 positions from the right (indicating cents). 
//a.	If the salary is invalid, print the entire record to the screen, indicating the error (char at position x is not a digit or period is missing or period is in the wrong position). 
//b.	If the salary is valid, convert it to a double.
//c.	If the status code is D, compute the bonus (double) as 12.5% of salary and 18% if the status code is F.
//3.	Separate the cityState into two individual Strings named city and state. Use the position of the comma to help extract the city portion before the comma and the state after the comma (use indexOf to find the comma and substring to extract the two parts)
//4.	Each record that has a status of D should be written to a file named strOutputD and those record with status of F should be written to a file named strOutputF.
//a.	For both files, each record printed should include firstName, lastName, status, salary, bonus, city and state (without the comma)
//5.	When all records have been read in, print to the screen the number of D, F and incorrect records processed. 
//6.	Submit your code, the output on the screen and the output in the two files.
package io.github.vikeshpandey.cisc1115hw;

public class Homework5Part2 {

	public static void main(String[] args) {
		

	}

}
