/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		println("This program counts the number of steps"
				+ " required for a number to be reduced down to"
				+ " one using the hailstone method.");
		int n = readInt("Input number: ");

		int totalSteps = 0;

		while (n != 1) {
			if (n % 2 == 1) {
				int n1 = (3 * n) + 1;
				println(n + " is odd, so I make 3n+1: " + n1);
				n = n1;
			} else {
				int n1 = (n / 2);
				println(n + " is even, so i take half: " + n1);
				n = n1;
			}
			totalSteps++;
		}
		println("This process took " + totalSteps + " steps " + "to reach 1.");
	}
}
