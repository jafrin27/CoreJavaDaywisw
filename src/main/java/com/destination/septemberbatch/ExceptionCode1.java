package com.destination.septemberbatch;
import java.util.Scanner;
public class ExceptionCode1 {

//*public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the numerator");
		//int num = sc.nextInt();//critical statement
		//System.out.println("Enter the denominator");
		//int den = sc.nextInt();//critical statement
		
		//int res = num/den;//critical statement
		//System.out.println(res);

//	}*/ This code will give an ArthimeticException if we provide input for num=10,dem=0...which is (infinity)
	// so to over come this we use Excdption handlers try block catch blocks
// The above code is without exception handlers
	// but the below code is with Exception Handlers(TRY and catch blocks)
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int num = sc.nextInt();//critical statement
			System.out.println("Enter the denominator");
			int dem = sc.nextInt();//critical statement
			int res=num/dem;//critical statement
			System.out.println(res);
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Exception Handeled");
		}
	}
}
