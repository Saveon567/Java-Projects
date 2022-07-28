package io.github.vikeshpandey.cisc1115hw;

public class Lab5BPt2 {

	public static boolean checkSSN(String social) {
		 boolean valid = false;
	        // 9 digits and 2 hyphens. First three characters, 5 and 6, and 8, 9,
	        // 10, 11 are digits
	 
	        // Check that the length is valid
	        if (social.length() == 11) {
	            valid = true;
	        } else {
	            valid = false;
	        }
	 
	        // Check that the characters are valid
	        // Valid as digits
	        char index0 = social.charAt(0);
	        char index1 = social.charAt(1);
	        char index2 = social.charAt(2);
	        char index4 = social.charAt(4);
	        char index5 = social.charAt(5);
	        char index7 = social.charAt(7);
	        char index8 = social.charAt(8);
	        char index9 = social.charAt(9);
	        char index10 = social.charAt(10);
	        // Valid as hyphen
	        char index3 = social.charAt(3);
	        char index6 = social.charAt(6);
	 
	        if (Character.isDigit(index0) && Character.isDigit(index1)
	                && Character.isDigit(index2) && Character.isDigit(index4)
	                && Character.isDigit(index5) && Character.isDigit(index7)
	                && Character.isDigit(index8) && Character.isDigit(index9)
	                && Character.isDigit(index10)) {
	            valid = true;
	        } 
	        else
	            valid = false;
	 
	        if (index3 == '-' && index6 == '-') {
	                valid = true;
	        }
	        else
	            valid = false;
	        return valid;	
	}

}
