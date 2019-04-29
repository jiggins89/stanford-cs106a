package chapter3;

/* File:	ThePhantomTollbooth.java
 * This program calculates the sum of the phantom tollbooth
 * using Java's precendence for calculation
 */

import acm.program.*;

public class ThePhantomTollbooth extends ConsoleProgram{

	public void run (){
		double x = (4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5);	
		println ("This program calculates the sum of the phantom tollbooth using Java's precendence for calculation");
		println ("4+9-2*16+1/3*6-67+8*2-3+26-1/34+3/7+2-5="+x);
	}
}