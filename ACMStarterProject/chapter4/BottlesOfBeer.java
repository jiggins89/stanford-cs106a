package chapter4;

/*
 *	This program generates the lyrics of the kids 
 * 	song "99 Bottles of Beer" 
 */

import acm.program.*;

public class BottlesOfBeer extends ConsoleProgram{
	
	private static int BEER = 99;
	
	public void run(){
		while (BEER > 0){
			println (BEER+" bottles of beer on the wall, "+
					BEER+" bottles of beer,"+
					" You take one down, pass it around");
			BEER--;
			println (BEER+" bottles of beer on the wall.");
		}
		
		println ("That's all the beer we got folks");
	}
}




