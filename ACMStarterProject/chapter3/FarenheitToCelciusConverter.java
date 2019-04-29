package chapter3;

/* This program calculates the area of 
 * a circle by inputting the radius 
 */

import acm.program.*;

public class FarenheitToCelciusConverter extends ConsoleProgram{
	
	public void run(){
		println ("This program converts me farenheit to celcius.");
		println ("How's things?");
		double F = readDouble ("Enter temperature in farenheit: ");
		double C0 = FIVE_DIVIDED_BY_NINE * (F-32);
		
		//* This part truncates the end off C0
		int C = (int) C0;
		
		println ("Temperature in celcius: " + C);
	}
	
	private static final double FIVE_DIVIDED_BY_NINE = 0.556;
}