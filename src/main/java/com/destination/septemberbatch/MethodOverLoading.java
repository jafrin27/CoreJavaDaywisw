package com.destination.septemberbatch;

import java.util.*;

class Calculator {
	int add(int a, int b) {
		return a + b;
	}

	float add(int a, float b) {
		return a + b;
	}

	float add(float a, int b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(double a, int b) {
		return a + b;
	}

	double add(double a, float b, int c) {
		return a + b + c;
	}

	double add(int a, float b, double c) {
		return a + b + c;
	}

}

public class MethodOverLoading {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.add(20, 10));
		System.out.println(c.add(10.7f, 30.6f));
		System.out.println(c.add(30.56, 59.86));
		System.out.println(c.add(45.789, 34.67f, 10));
		System.out.println(c.add(20, 76.54f, 10.6786));

	}

}
