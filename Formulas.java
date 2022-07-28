


//Sa'veon Hicks 	Homework #1   Due Feb 14th, 2022



// This program calculates the surface area and volume of a sphere.
// Formulas 
// Surface Area of a Sphere: A = 4 π r2.
// Volume of a Sphere: V = (4 ⁄ 3) π r3

//REDONE VERSION
package io.github.vikeshpandey.cisc1115hw;


import java.util.Scanner;
public class Formulas {
	public static void main(String[] args) 
		{
		//Declarations
		double PI = 3.14159, area ;
		Scanner input = new Scanner(System.in);
		double r ;
		double volume;
		
		//Part A Radius = 1
		System.out.println("Welcome to My Formulas Program ");
		System.out.println("Enter the radius of the sphere:" );	
	    r = input.nextDouble();
		area = 4.0*Math.PI * (r*r);
		volume = 4.0/3*Math.PI * (r*r*r);
		
		
		System.out.println("radius = " );	
		System.out.println("volume = " + volume);	
		System.out.println("The surface area of the sphere is:" + area);
		
		
		
			
		
		
		
		
	} 
	
}
        
	
	
