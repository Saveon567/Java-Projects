//Sa'veon Hicks CISC 1115 Lab #2

//CISC 1115-MY11
//Professor Ira Rudowsky
//Feb 9th 2022

//This program begin by printing, as part of the output, in addition to the comment at the beginning of my code, a header for the lab (or homework) that looks like the following:
// ------------------------------------------------------------------
// --------
// Sa'veon Hicks
// Feb 9th
// CISC 1115 MY11
// Lab2
// -------------------------------------------------------------------
// -------

//Write a program that will read an integer from the keyboard, which represents a dollar and cents amount, such as 732567 and prints out:
//732567 is 7 thousand 3 hundred 2 tens 5 dollars and 67 cents

//Input of 12354 would print
//12354 is 0 thousand 1 hundred 2 tens 3 dollars and 54 cents

//Or, for input of 10000 the program will print
//10000 is 0 thousand 1 hundred 0 tens 0 dollars and 0 cents

//Input of 1254 would print
//1254 is 0 thousand 0 hundred 1 tens 2 dollars and 54 cents

//Another example,
//054 is 0 thousand 0 hundred 0 tens 0 dollars and 54 cents

//One way to do this is to use integer division and the mod operator (%) as we discussed in the lecture but, if you have another way, go for it.
// One set of code should work for any amount read in as a double. Assume the input amount is never greater than 9999999
//Run a number of examples like those above to test your code.

package io.github.vikeshpandey.currency;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		

        //Part 1
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-------");
        System.out.println("Sa'veon Hicks");
        System.out.println("Feb 9th");
        System.out.println("CISC 1115 MY11");
        System.out.println("Lab2");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-------");

        //Part 2
        Scanner sc = new Scanner(System.in);
        
        int thousand = 732567;
        int hundred  = 12354;
        int ten = 10000;
        int dollars = 1254;
        int cents = 054;
        int change;
       
        System.out.print("Enter a number: ");
        System.out.println("The number entered ny the user is");
        change = sc.nextInt();
        
        thousand = change / 100000;
        int thousand_rem = change % 100000;

        hundred = thousand_rem / 10000;
        int hundred_rem = thousand_rem % 10000;

        ten = hundred_rem / 1000;
        int ten_rem = hundred_rem % 1000;

        dollars = ten_rem / 100;
        int dollars_rem = ten_rem % 100;
        
        cents = dollars_rem; 

        System.out.println(change + " is " + thousand + "thousand" + hundred + "hundred" + ten + "tens" + "dollars" + dollars + cents + "cents" );
        
            //Result
            System.out.println("732567 is 7 thousand 3 hundred 2 tens 5 dollars and 67 cents" + thousand);
            System.out.println("12354 is 0 thousand 1 hundred 2 tens 3 dollars and 54 cents");
            System.out.println("10000 is 0 thousand 1 hundred 0 tens 0 dollars and 0 cents");
            System.out.println("1254 is 0 thousand 0 hundred 1 tens 2 dollars and 54 cents");
            System.out.println("054 is 0 thousand 0 hundred 0 tens 0 dollars and 54 cents");
            
            sc.close();

	}

}
