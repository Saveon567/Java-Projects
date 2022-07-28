//Sa'veon Hicks



/// CISC 1115 MY11 HW 5
//// April 4th
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
			Scanner fileReader = new Scanner(new File("strInput.txt."));
			FileWriter fileWriterD = new FileWriter("strOutputD.txt.");
			FileWriter fileWriterF = new FileWriter("strOutputF.txt.");
			
			int incorrectrecords = 0;
			int drecords = 0;
			int frecords = 0;
			while(fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] tokens = line.split("\\s+");
				if (tokens.length == 5) {
				String firstName = tokens[0];
				String lastName = tokens[1];
				String strSalary = tokens[2];
				char status = tokens[3].charAt(0);
				String CityState = tokens[4];
				
				if(status != 'D' && status != 'F') {
				System.out.println("Neither D/F" + line);
				incorrectrecords++;
				}
				else {
				int correctposition = strSalary.length() - 3;
				boolean isInvalid = false;
				for(int index = 0; index < strSalary.length(); index++) {
					if(index == correctposition) {
						if(strSalary.charAt(index)!= '.') {
							System.out.println("Character In Position" + (index+1) + "Not period. Period missing salary. Records" + line);
						
							isInvalid = true;
							break;
							}
						}
					else if (strSalary.charAt(index) == '.') {
						System.out.println("Character In Position" + (index+1) + " period placed in wrong position for salary category. records" + line);
						
						isInvalid = true;
						break;
					}
					else if
					(Character.isDigit(strSalary.charAt(index)) == false) {
						System.out.println("Character In Position" );
					
						try { { 
						}} catch(IOException e) {{{{{
							
						}}}}} finally{ {{;
						
						}
				}
		}}}}{
			}
}
				}
				}
	{
			}
{
	{
}
		
	{}}{{{{}}
	{}}
	{{{}{}