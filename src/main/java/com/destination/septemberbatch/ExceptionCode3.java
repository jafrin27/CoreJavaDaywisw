package com.destination.septemberbatch;
import java.util.*;
public class ExceptionCode3 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = sc.nextInt();//critical statement----->InputMistMatchException
		System.out.println("Enter the denominatior");
		int dem = sc.nextInt();//critical statement----->InputMistMatchException
		int res=num/dem;//critical statement----->ArithmeticException
		System.out.println(res);
		System.out.println("=====================================");
		System.out.println("Array operations started==============");
		System.out.println("Enter array size");
		int size = sc.nextInt();//critical statement----->InputMistMatchException
		int arr[] = new int[size];//critical statement----->NegativeArraySizeException
		System.out.println("Enter the position number to add the data");
		int pos = sc.nextInt();//critical statement----->InputMistMatchException
		System.out.println("Enter the value to be added");
		int val = sc.nextInt();//critical statement----->InputMistMatchException
		arr[pos] = val;//critical statement----->ArrayIndexOutOfBoundsException
		System.out.println("Data is added");
		System.out.println("Arithemetic operation completed");
		System.out.println("===================================");
		sc.close();
		

		}
		//Specific catch blocks
		catch (ArithmeticException e1){
			System.out.println("Arithmetic exception hanled");
		}
		catch (NegativeArraySizeException e2){
			System.out.println("NegativeArraySizeException hanled");
		}
		catch (ArrayIndexOutOfBoundsException e3){
			System.out.println("ArrayIndexOutOfBoundsException hanled");
		}
		
		catch (InputMismatchException e4){
			System.out.println("InputMismatchException hanled");
		}
		
		//for multi catch
		
	/*	catch(NegativeArraySizeException |ArrayIndexOutOfBoundsException e5)
		{
			System.out.println("NegativeArraySizeException or ArrayIndexOutOfBounds Exception handled");
		}*/
		
		//generic catch block/universal
		catch (Exception e){
			System.out.println("Exception handled");
		}

	}
	

}
