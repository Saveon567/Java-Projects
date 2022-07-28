//Sa'veon Hicks 
//CISC 1115-MY11
//Professor Ira Rudowsky
//April 11th, 2022
package io.github.vikeshpandey.cisc1115hw;
import java.util.Scanner;;
public class Lab5BPart5 {

	public static void main(String[] args) {
		
	System.out.println("Welcome To CISC 1115 Lab5B Part 2");
	Scanner input = new Scanner(System.in);
	
	char dashes = '-';
	String social = "";
	int s = 0;
	while(s<1) {
	System.out.println("Please Enter Your Social ###-##-####");
	social = input.next();
	
	while(social.length()>1){
	if(!Character.isDigit(social.charAt(0))){
	System.out.println("0  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(1))) {
	System.out.println("1  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(2))) {
	System.out.println("2  NOT A Digit");
	}
	else if (social.charAt(3)!=dashes){
	System.out.println("3  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(4))) {
	System.out.println("4  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(5))) {
	System.out.println("5  NOT A Digit");
	}
	else if (social.charAt(6)!=dashes){
	System.out.println("6  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(7))) {
	System.out.println("7  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(8))) {
	System.out.println("8  NOT A Digit");
	}
	else if (!Character.isDigit(social.charAt(9))) {
	System.out.println("9  NOT A Digit");
	}
	else if ((!Character.isDigit(social.charAt(10)))&&(!Character.isLetter(social.charAt(10)))){
	System.out.println("10 NOT A Digit/Letter");
	}
	else if (social.length()>11){
	System.out.println("Social # Is Very Lengthy");
	}
	else
	System.out.println("Social # Is Appropriate " + social);
	break;
	}
	if (social.length()<=1) {
		break;
	
	}
}}
}	