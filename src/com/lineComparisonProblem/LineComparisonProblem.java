package com.lineComparisonProblem;

import java.util.Scanner;

public class LineComparisonProblem {

	static float x1, x2, y1, y2, L1, L2;

	public static void main(String[] args) {

		System.out.println("Welcome to Line comparison Problem :)");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the co-ordiates for point 1 x1 and x2");
		x1 = sc.nextFloat();
		x2 = sc.nextFloat();

		System.out.println("Please enter the co-ordinates for point y1 and y2");
		y1 = sc.nextFloat();
		y2 = sc.nextFloat();

		double LengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("The Length of the line is : " + LengthOfLine);

		double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1));
		double lengthOfLine2 = Math.sqrt((y2 - y1) * (y2 - y1));

		if (lengthOfLine1 == lengthOfLine2) {
			System.out.println("Length of Line 1 is equal  to Length of line 2 and the value is : " + lengthOfLine1);

		} else {
			//System.out.println("Length of Line 1 is :" + lengthOfLine1);
			//System.out.println("Length of Line 2 is :" + lengthOfLine2);
			System.out.println("Length of Line1 is not equalt to length of Line2");
		}

		sc.close();
	}

}
