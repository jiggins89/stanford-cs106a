package chapter3;
/*
 * File: ImperialToMEtricConverter.java
 * ------------------------------------
 * This program reads a user input of feet and inches
 * and converts them to centimetres 
 */

import acm.program.*;

public class ImperialToMetricConverter extends ConsoleProgram{
	
	public void run(){
		println ("This Program converts feet and inches to centimetres.");
		double feet = readDouble ("Enter feet:");
		double inches = readDouble ("Enter inches:");
		double cm = (feet*CM_PER_FOOT)+(inches*CM_PER_INCHES);
		println (feet + "ft " + inches + "in = " + cm + "cm");
	}
	
	private static final double CM_PER_FOOT = 30.48;
	
	private static final double CM_PER_INCHES = 2.54;
}