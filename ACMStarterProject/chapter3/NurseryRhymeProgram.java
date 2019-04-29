package chapter3;

/* This program calculates the number wives, sacks,
 * cats and kits that are met by a man walking to 
 * St.Ives going in the opposite direction 
 */

import acm.program.*;

public class NurseryRhymeProgram extends ConsoleProgram{
	
	public void run(){
		
		int wives 	= 7;
		int sacks 	= 7*wives;
		int cats 	= 7*sacks;
		int kits	= 7*cats;
		int total	= kits+cats+sacks+wives;
		println ("The total number in the party is " +total);
	}	
}