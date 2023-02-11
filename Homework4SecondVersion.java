//Sa'Veon Hicks
//CISC 1115 TR11 
//Homework 4 Second Version

//Write a complete Java program, including comments, to do the following:  Your program will compute the monthly payment (monPayment - double) on a mortgage of amount principal (integer), with interest rate intRate (double) for numYears (integer) number of years.   
//The formula is written as follows:
//
// principal*(intRate/12)*(1+(intRate/12))numYears*12
//monPayment =    _________________________________________
//				              ((1+(intRate/12))numYears*12 )-1
//
//For example if principal=$100,000, intRate=.07 and numYears=30 years then the monthly payment is $665. Check that your code yields the same number before you go any further.
//
//Use the pow function to raise a number to a power.  Math.pow(10,5) means 10 to the 5th power. To raise a*b to the power of c*d use Math.pow(a*b, c*d). 
//
//1. The program should start by printing a header giving your name, class/section and assignment number. Use a loop to print underscores ( _ ) as a horizontal line to add clarity to the report (see sample output below).
//
//2. The program will compute the monthly payment of loans starting at $100,000 up to an including $1,000,000 (in increments of $100,000) at 7 different interest rates (starting at .07 up to and including .1 in increments of .005). The outer loop will run from 100000 to 1000000 and the inner loop from .07 to .1 and the formula for computing the monthly payment will be part of the inner loop
//
//3. Use a printf statement for the column header, allowing 3 decimal places for the interest rate. The total field size for intRate should match what you use for the monthly payment (in the section below)
//
//4. Use printf statements for: (a) the principal having no decimal places and max size of 7 positions and (b) monthly payment containing 2 decimal places and up to 4 positions to the left of the decimal place. Align all numbers to the right and align the monthly payments with the interest rate header above it.
//
//The final result should look as follows. Your numbers and alignment should match exactly what appears below. Also, when you copy the output, the font should be Courier New or any other fixed font so that the columns will line up properly.  Be sure to comment your program.
//
//_______________________________________________________________________________
//<YOUR NAME>                  CISC 1115 TR11              		Homework 4A
//_______________________________________________________________________________
//Principal                       Interest Rate
//             0.070    0.075    0.080    0.085    0.090    0.095    0.100
//_______________________________________________________________________________
//
//   100000   665.30   699.21   733.76   768.91   804.62   840.85   877.57
//   200000  1330.60  1398.43  1467.53  1537.83  1609.24  1681.71  1755.14
//   300000  1995.90  2097.64  2201.29  2306.74  2413.86  2522.56  2632.72
//   	.					.				.
//   	.					.				.
//   	.					.				.
//   	.					.				.
//   800000  5322.41  5593.71  5870.12  6151.31  6436.97  6726.83  7020.58
//   900000  5987.71  6292.92  6603.88  6920.23  7241.59  7567.69  7898.15
//  1000000  6653.01  6992.14  7337.65  7689.14  8046.22  8408.54  8775.72
//_______________________________________________________________________________


package io.github.vikeshpandey.currency;

public class Homework4SecondVersion {
	
	//Declared variables
    private static int principal;
	private static double intRate;
	private static double monPayment;
	private static int numYears = 30;

	//Main Method
	public static void main(String[] args) {
		
		  //Heading Of The Program
		  System.out.println("Sa'Veon Hicks                  CISC 1115 TR11                       Homework 4A\n");
		  
		  //For Loop 1 - Prints Underscores For The Header Horizontally
		  for (int i = 0; i < 81; i++) {
			  System.out.print("_"); 
		  }
		  System.out.println();
		  
		  //Output Message - Prints Column Headings
		  //For Loop 2 - Prints Column Headings
		  System.out.print("Principal            ");
		  for (intRate = 0.07; intRate <= 0.1; intRate += 0.005) {
			  System.out.printf("%10.3f", intRate);
		  }
		  System.out.println();
		  
		  //For Loop 3 - Prints Underscores For The Header
		  for (int i = 0; i < 81; i++) {
			  System.out.print("_");
		  }
		  System.out.println();
		  
		  //For Loop 4 - Calculates & Prints Monthly Payments
		  for (principal = 100000; principal <= 1000000; principal += 100000) {
			  System.out.printf("%7d", principal);
			  for (intRate = 0.07; intRate <= 0.1; intRate += 0.005) {
				  monPayment = (principal * intRate / 12) * Math.pow((1 + (intRate / 12)), (numYears * 12)) / Math.pow((1 + (intRate / 12)),(numYears * 12) - 1) ;
				  System.out.printf("%10.2f", monPayment);
			  }
			  System.out.println();
		  }
		  //For Loop 5- Prints Underscores For Footer
		  for (int i = 0; i < 81; i++) {
			  System.out.print("_"); 
		  }
		  System.out.println();
	}

}
