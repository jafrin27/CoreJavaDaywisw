package com.destination.septbatch.day25;

public class feedback 
{
	    public static void main(String[] args) 
	    {
	        String message = "very good";
	        printMessageInStars(message);
	    }

	    static void printMessageInStars(String message) {
	        for (int i = 0; i < 5; i++) { // Each letter has 5 rows
	            for (char ch : message.toCharArray()) {
	                if (ch == 'v') {
	                    if (i == 0) System.out.print("  *  ");
	                    else if (i == 1) System.out.print(" * * ");
	                    else if (i == 2) System.out.print("*   *");
	                    else System.out.print("     ");
	                } else if (ch == 'e') {
	                    if (i == 0) System.out.print("*****");
	                    else if (i == 1) System.out.print("*    ");
	                    else if (i == 2) System.out.print("*****");
	                    else if (i == 3) System.out.print("*    ");
	                    else System.out.print("*****");
	                } else if (ch == 'r') {
	                    if (i == 0) System.out.print("*****");
	                    else if (i == 1) System.out.print("*   *");
	                    else if (i == 2) System.out.print("*****");
	                    else if (i == 3) System.out.print("* *  ");
	                    else System.out.print("*  * ");
	                } else if (ch == 'y') {
	                    if (i == 0) System.out.print("*   *");
	                    else if (i == 1) System.out.print(" * * ");
	                    else if (i == 2) System.out.print("  *  ");
	                    else System.out.print("     ");
	                } else if (ch == 'g') {
	                    if (i == 0) System.out.print("  *** ");
	                    else if (i == 1) System.out.print(" *    ");
	                    else if (i == 2) System.out.print("*  ***");
	                    else if (i == 3) System.out.print("     *");
	                    else System.out.print("  *** ");
	                } else if (ch == 'o') {
	                    if (i == 0) System.out.print("  *  ");
	                    else if (i == 1) System.out.print(" * * ");
	                    else if (i == 2) System.out.print("*   *");
	                    else if (i == 3) System.out.print(" * * ");
	                    else System.out.print("  *  ");
	                } else if (ch == 'd') {
	                    if (i == 0) System.out.print("***** ");
	                    else if (i == 1) System.out.print("*   * ");
	                    else if (i == 2) System.out.print("*   * ");
	                    else if (i == 3) System.out.print("*   * ");
	                    else System.out.print("***** ");
	                } else if (ch == ' ') {
	                    System.out.print("      "); // Space between words
	                }
	                System.out.print("   "); // Space between letters
	            }
	            System.out.println();
	        }
	    }
	}



