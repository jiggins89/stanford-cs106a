package chapter3;
/*
 * File: KgToLbConverter.java
 * ------------------------------------
 * This program reads weight in kilogrammes
 * and converts it to pounds and ounces.
 */

import acm.program.*;

public class KgToLbConverter extends ConsoleProgram{
	
	public void run(){
		println ("This Program converts Kilograms to Pounds and Ounces.");
		double kg = readInt("Enter weight in Kg:");
		double lbs = (kg * POUNDS_IN_A_KILOGRAMME);
		/*This part takes the remainder after the decimal 
		 *place to convert to to lbs by declaring lbs as a 
		 *integer and subtracting it from the double lbs.
		 */
		int lbsInt = (int) (kg * POUNDS_IN_A_KILOGRAMME);
		double ozs = (lbs - lbsInt) * OUNCES_IN_A_POUND;
		println ((int)kg+"kg = "+lbsInt+"lbs "+(int)ozs+"oz");
	}
	private static final double POUNDS_IN_A_KILOGRAMME = 2.2; 
	private static final double OUNCES_IN_A_POUND = 16; 
}