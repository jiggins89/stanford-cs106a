package chapter3;

/* This program calculates the area of 
 * a circle by inputting the radius 
 */

import acm.program.*;

public class CircleAreaCalculator extends ConsoleProgram{
	
	public void run(){
		println ("This program calculates the area of a circle.");
		double radius = readDouble("Enter radius: ");
		double area = PI*radius*radius;
		println ("Circle area= " +area);
	}
	
	private static final double PI = 3.14159265359;
	
}