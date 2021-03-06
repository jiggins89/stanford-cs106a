/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5995814078277545505L;
	
	private static final int SENTINEL = 0;

	public void run() {
		println("This program finds the range from a list "
				+ "of inputed numbers.");
		int value = readInt("Input value: ");
		int large = value;
		int small = value;

		while (true) {
			value = readInt("Input value: ");
			if (value == SENTINEL)
				break;
			if (value < small)
				small = value;
			if (value > large)
				large = value;
		}
		println("smallest= " + small);
		println("largest= " + large);
	}
}
