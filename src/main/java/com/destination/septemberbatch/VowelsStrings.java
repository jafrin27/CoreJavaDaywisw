package com.destination.septemberbatch;
import java.util.*;
class VowelOps{
	int total_vowel;
	int total_consonent;
	int non_alpha;
	int total_capital_vowel;
	int total_lower_case_vowel;
	public void countAllVowels(String str) {
		str = str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				total_vowel++;
			}
			else {
				total_consonent++;
			}
			}
			else {
				non_alpha++;
			}
		}
		System.out.println("The total Vowel Count is :" + total_vowel);
		System.out.println("The total Consonent Count is :"+total_consonent);
		System.out.println("Non-Alphabets count is :"+non_alpha);
		System.out.println("===========================================");
	}
	public void capitalVowels(String str) {
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				total_capital_vowel++;
			}
		}
		System.out.println("The total capital Vowels count is :"+total_capital_vowel);
		System.out.println("================================");
	}
	public void lowerCaseVowels(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				total_lower_case_vowel++;
			}
		}
		System.out.println("The total capital Vowels count is "+total_lower_case_vowel);
		System.out.println("=========================");
	}
	public void replaceVowels(String str) {
		String str_tmp="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
					||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				str_tmp= str_tmp+'$';
			}
			else {
				str_tmp = str_tmp+str.charAt(i);
			}
		}
		str = str_tmp;
		System.out.println("The replacednstring is :"+str);
		System.out.println("===============================================");
	}
public void replaceUpperCaseVowels(String str) {
	String str_tmp="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
		{
			str_tmp= str_tmp+'$';
		}
		else {
			str_tmp = str_tmp+str.charAt(i);
		}
	}
	str = str_tmp;
	System.out.println("The replacednstring is :"+str);
	System.out.println("===============================================");
	
}
public void replaceLowerCaseVowels(String str) {
	String str_tmp="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			str_tmp= str_tmp+'$';
		}
		else {
			str_tmp = str_tmp+str.charAt(i);
		}
	}
	str = str_tmp;
	System.out.println("The replacednstring is :"+str);
	System.out.println("===============================================");
}
}
class VowelsStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		VowelOps vo = new VowelOps();
		vo.countAllVowels(str);
		vo.capitalVowels(str);
		vo.lowerCaseVowels(str);
		vo.replaceVowels(str);
		vo.replaceUpperCaseVowels(str);
		vo.replaceLowerCaseVowels(str);
		sc.close();

	}

}
