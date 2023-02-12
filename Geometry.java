//Sa'Veon Hicks
//Homework 1
//Due:

//Code the following problem. Comment the code properly, indent and use blank lines to make it easy to read. Upload the code and output. The easiest way is to cut and paste the code and output into a document and upload the document. Make sure to include your name, Homework #1 and due date in a comment at the beginning of the program. For example:
// Your Name  Homework #1   Due Feb 14, 2020 // Your comment explaining what the program does

//Verify your code by checking your answer against results computed by hand or with a calculator. Remember, just because a program prints something doesn't mean it's the correct answer

//PART A
//Your program will calculate the surface area and volume of a sphere. The formulas are:
//1. 2.
//3. 4.
//5.
//6.

//Surface Area of a Sphere: A = 4 π r2. Volume of a Sphere: V = (4 ⁄ 3) π r3

//Declare a variable of type double named PI and assign it the value 3.14159

//Your program will ask to input, via the keyboard, the radius of the sphere. Assign the value to a variable named radius of type double

//Compute the surface area of the sphere using the formula
//double area = 4*PI*radius*radius;

//Compute the volume of the sphere using the formula
//double volume = (4/3)*PI*radius*radius*radius;

//Read in a value of 1 for the radius and print the results in the following way
//using the values assigned to the variables area, volume and radius

//The volume of a sphere with radius 1.0 is 4.188786666666666 and the surface area is 12.56636

//Run the program a second time and read in a value of 12.75 for the radius. Print the results in a similar way as above
//Hand in the source code and the output of the two times you ran the program

package io.github.vikeshpandey.currency;

//Java.Util. Package Declared
import java.util.*;

//The Class Is Named After The Homework Assignment
public class Geometry {
	//Main Method Declared
	public static void main(String[] args) {
		
		//Variables Declared
		//Double PI Assigned To The Value 3.14159
		double PI = 3.14159;
        double radius;
        
        //Scanner Declared
        //Asking The User To Input, Via The Keyboard, The Radius Of The Sphere.
        System.out.println("Enter the radius of the sphere: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        
        //Formula:Compute the surface area of the sphere
        double area = 4 * PI * radius * radius;
        
        //Formula:Compute the volume of the sphere        
        double volume = (4 / 3) * PI * radius * radius * radius;
        
        //Result
        System.out.println("The volume of a sphere with radius " + radius + " is " + volume + " and the surface area is " + area);
        

	}

}
