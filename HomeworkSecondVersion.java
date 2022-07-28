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

//Sa'veon Hicks
//CISC 1115 MY11 Homework 5 Part 2
//April 25th

package io.github.vikeshpandey.cisc1115hw;


import  java.util.*;
import  java.io.*;
public class HomeworkSecondVersion {

		public static void main(String[] args) throws FileNotFoundException,IOException {
			
			//Introduction
	        System.out.println("Welcome To CISC 1115 Homework #5");
	        System.out.println("Fran Young 10456.82 G Boston,MA --> Neither D/F");
	        System.out.println("Jack Smith 23489A.82 D Houston,TX --> Doesn't Contain Every Number");

	        //Declarations
	        File file = new File("/Users/saveonhicks$/Desktop/strInput.txt.");
	        Scanner input = new Scanner(file);
	        String foutput = "/Users/saveonhicks$/Desktop/strOutputF.txt";
	        String doutput = "/Users/saveonhicks$/Desktop/strOutputD.txt.";
	        PrintWriter pwF = new PrintWriter(foutput);
	        PrintWriter pwD = new PrintWriter(doutput);
	        int calculated = 0;
	        int calculatef = 0;
	        int calculateIncrement = 0;

	        while(input.hasNext()) {
	            String line = input.nextLine();
	            String[] arr = line.split("\\s");
	            if (!arr[3].equals("D") && !arr[3].equals("F")) {
	                System.out.println("Neither D/F" + line);
	                calculateIncrement++;
	            }
	            //Boolean Inbound
	            boolean valid = true;
	            String number = arr[2];
	            for (int i = 0; i < number.length(); i++)
	                if (!Character.isDigit(number.charAt(i)) && number.charAt(i) != '.') {
	                    System.out.println(line + "Doesn't Contain Every Number");
	                    valid = false;
	                    calculateIncrement++;
	                }
	            String post = number.substring(number.indexOf(".") + 1);
	            if (post.length() > 2) {
	                System.out.println(line + "Wrong Decimal");
	                valid = false;
	                calculateIncrement++;
	            }
	            String cityState = arr[4];
	            int punctuation = cityState.indexOf(",");
	            String city = cityState.substring(0, punctuation);
	            String state = cityState.substring(punctuation + 1);
	            String correctline = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + city + " " + state;

	            if (arr[3].equals("D") && valid) {
	                pwD.write(correctline);
	                pwD.flush();
	                calculated++;
	            } else if (arr[3].equals("F") && valid) {
	                pwD.write(correctline);
	                pwD.flush();
	                calculatef++;

	                //Conclusion
	                System.out.println("D Total: " + calculated);
	                System.out.println("F Total: " + calculatef);
	                System.out.println("Error Total" + calculated++);

	                pwF.close();
	                pwD.close();
	                input.close();
	            }
	        }

	}

}
