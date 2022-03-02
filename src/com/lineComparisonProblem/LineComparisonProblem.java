package com.lineComparisonProblem;

import java.util.Scanner;

public class LineComparisonProblem {

	public static void main(String[] args) {

		System.out.println("Welcome to Line comparison Problem :)");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the co-ordiates for point 1 x1 and x2");
		float x1 = sc.nextFloat();
		float x2 = sc.nextFloat();

		System.out.println("Please enter the co-ordinates for point y1 and y2");
		float y1 = sc.nextFloat();
		float y2 = sc.nextFloat();

		double LengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("The Length of the line is : " + LengthOfLine);

		sc.close();
	}

}
