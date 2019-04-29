/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		println("This program calculates the length of"
				+ " the hypotanuse of a triangle using "
				+ "pythagoras theorem.");
		int a = readInt("enter a: ");
		int b = readInt("enter b: ");
		double c = Math.sqrt((a * a) + (b * b));
		println("C= " + c);
	}
}
