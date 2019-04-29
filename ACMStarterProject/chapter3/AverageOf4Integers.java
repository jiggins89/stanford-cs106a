package chapter3;

/*
 * This program reads the user input of four integers and
 * finds the average of them
 */

import acm.program.*;

public class AverageOf4Integers extends ConsoleProgram{
	
	private static final int NVALUE = 4;
	
	public void run() {
		println ("This program calculates the average of "+NVALUE+" numbers");
		int total = 0;
		for (int i =0; i < NVALUE; i++){
			int n = readInt ("Input number: ");
			total += n;
		}
		total=total/NVALUE;
		println ("The average of the "+NVALUE+" numbers = "+total);
	}
}