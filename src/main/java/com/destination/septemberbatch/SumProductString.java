package com.destination.septemberbatch;
import java.util.*;

class VowelsAtEvenPositions {
    public static boolean areVowelsAtEvenPositions(String input) 
    {
        input = input.toLowerCase();
        for (int i = 1; i < input.length(); i += 2) 
        {
            char ch = input.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                return false; // If a non-vowel is found at an even position, return false
            }
        }
        return true; // All even positions have vowels
    }
public class SumProductString {

	public static void main(String[] args) {
		
	        String test = "bacefiozu";
	        
	        if (areVowelsAtEvenPositions(test)) {
	            System.out.println("Vowels are present at all even positions.");
	        } else {
	            System.out.println("Vowels are not present at all even positions.");
	        }
	    }
	

	}

}
