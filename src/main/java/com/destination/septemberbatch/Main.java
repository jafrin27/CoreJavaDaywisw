package com.destination.septemberbatch;
import java.util.*;
public class ReplaceVowels {
    public static String replaceVowelsWithSpecialChar(String input, char specialChar) {
        char[] chars = input.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            char ch = Character.toLowerCase(chars[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                chars[i] = specialChar;
            }
        }
        
        return new String(chars);
    }
	public static void main(String[] args) {
		 String test = "Hello World";
	        char specialChar = '*';
	        
	        String result = replaceVowelsWithSpecialChar(test, specialChar);
	        System.out.println("Original string: " + test);
	        System.out.println("Modified string: " + result);
	}

	}

