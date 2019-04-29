package chapter4;

/* 	This program writes out the lyrics of the song
 *	"This Old Man".
 */

import acm.program.*;

public class ThisOldMan extends ConsoleProgram{
	
	public void run(){
		
		for (int i = 1; i < 11; i++){	
			println ("This old man, he played "+i+",");
				switch (i){
				case 1: println ("He played knick-knack on my bum,"); break;
				case 2: println ("He played knick-knack on my shoe,"); break;
				case 3: println ("He played knick-knack on my knee,"); break;
				case 4: println ("He played knick-knack on my door,"); break;
				case 5: println ("He played knick-knack on my hive,"); break;
				case 6: println ("He played knick-knack on my sticks,"); break;
				case 7: println ("He played knick-knack on my up to heaven,"); break;
				case 8: println ("He played knick-knack on my pate,"); break;
				case 9: println ("He played knick-knack on my spine,"); break;
				case 10: println ("He played knick-knack on my shin,"); break;
				}	
			println	("With a knick-knack, paddy-whack,");
			println ("Give your dog a bone,");
			println	("This old man came rolling home.");
			println ();
			}
	}
		
}
