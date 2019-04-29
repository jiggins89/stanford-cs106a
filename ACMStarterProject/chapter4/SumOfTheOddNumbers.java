package chapter4;

/*	This program reads in a integer N and calculates 
 * 	the sum of the first N odd numbers. 
 */

import acm.program.*;

public class SumOfTheOddNumbers extends ConsoleProgram{
	
	private static int TOTAL = 0;
	
	public void run(){
		int n = readInt ("Input numvber: ");
		
		for (int i = 0; i < n; i++){
			if (i%2 == 1) {
				TOTAL += i;
				
			}
		}
	println ("Total of th first "+TOTAL+" odd numbers: ");
	}	
}
