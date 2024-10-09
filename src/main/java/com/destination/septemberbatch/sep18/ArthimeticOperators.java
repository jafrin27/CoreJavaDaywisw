package com.destination.septemberbatch.sep18;
class ArthimeticExample
{
	void add(int a,int b)
	{
		int res1=a+b;
	System.out.println("Addition Result is :"+(res1));
	System.out.println("==========");
	}
	void sub(int a,int b)
	{
		int res2=a-b;
	System.out.println("subtraction Result is :"+(res2));
	System.out.println("==========");
	}
	void Mul(int a,int b)
	{
		int res3=a*b;
	System.out.println("Multiplication Result is :"+(res3));
	System.out.println("==========");
	}
	void Div(int a,int b)
	{
		int res4=a/b;
	System.out.println("Division Result is :"+(res4));
	System.out.println("==========");
	}
	void mod(int a,int b)
	{
		int res5=a%b;
	System.out.println("Modulas Result is :"+(res5));
	System.out.println("==========");
	}
	
	
}
public class ArthimeticOperators 
{

	public static void main(String[] args) 
	{
		System.out.println("Arthimetic Operations");
		System.out.println("====================");
		int a = 100;
		int b = 50;
		ArthimeticExample ae = new ArthimeticExample();
		ae.add(a, b);
		ae.sub(a, b);
		ae.Mul(a, b);
		ae.Div(a, b);
		ae.mod(a, b);
		
	}

}
