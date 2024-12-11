package com.destination.septemberbatch;
import java.util.*;
class ArrayOps
{
	long arr[][][];
	long arr1[];
	long total_revenue;
	long total_investment;
	long prev_profit;
	int lang;
	int cat;
	int mov;
	Scanner sc = new Scanner (System.in);
	
	void initialization()
	{
		System.out.println("Enter the total investment for the FY 2023-24 by Sanjana:");
		total_investment = sc.nextLong();
		System.out.println("Enter the profit for the FY 2022-23 for Sanjana:");
		prev_profit = sc.nextLong();
		System.out.println("==================================");
		System.out.println("FY 2023-24 data collection");
		System.out.println("Enter the language count: ");
		lang = sc.nextInt();
		System.out.println("Enter the category count: ");
		cat = sc.nextInt();
		System.out.println("Enter the movie count : ");
		mov = sc.nextInt();
		arr = new long[lang][cat][mov];
		arr1 = new long[lang];
		System.out.println("Array is created....");
	}
	void collectMovieRevenue()
	{
		long temp=0;
		System.out.println("Collecting the revenue made by each movie: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Colecting data for language no: "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("collecting data for category no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the revenue made by movie no: "+(k+1));
					arr[i][j][k] = sc.nextLong();
					temp=temp+arr[i][j][k];
					total_revenue=total_revenue + arr[i][j][k];
				}
			}
			arr1[i] = temp;
			temp = 0;
		}
		System.out.println("=============================================");
	}
	void displayRevenue()
	{
		System.out.println("Displaying the revenue made by each movie : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Displaying data for language no: "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Displaying data for category no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("The revenue made by movie no: "+(k+1)+" is "+arr[i][j][k]);
					
				}
			}
		}
		System.out.println("=============================================");
		System.out.println("Displaying the revenue made by each movie : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("The revenue made by language no: "+(i+1)+" is= "+arr1[i]);
		}
		System.out.println("======================================");
		
		System.out.println("The overall revenue made in FY 2023-24cis = "+total_revenue);
	}
	void checkProfitLoss()
	{
		long profit=0;
		long loss;
		if(total_revenue>total_investment)
		{
			System.out.println("Sanjana is on the profit side of the investment");
			profit = total_revenue-total_investment;
			System.out.println("Comparing the profit of previous year with current year");
			if(profit>prev_profit) 
			{
				System.out.println("Sanjana has made a profit of "+(profit-prev_profit)+"during 2023-24");
			}
			else 
			{
				System.out.println("Sanjana has made a less profit of "+(prev_profit-profit)+"during 2023-24");
			}
		}
		else 
		{
		
			System.out.println("Sanjana jas made a less profit of "+(prev_profit-profit)+"during 2023-24");
			loss = total_investment-total_revenue;
		}
		System.out.println("============================");
		
}
	
}
class SanjanaCode 
{

	public static void main(String[] args) 
		{
		ArrayOps ao = new ArrayOps();
		ao.initialization();
		ao.collectMovieRevenue();
		ao.displayRevenue();
		ao.checkProfitLoss();
		}
		

}

