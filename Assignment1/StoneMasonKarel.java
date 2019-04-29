/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass repairs columns that are 
 * missing stones from their columns
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run(){
		while (frontIsClear()){
			repairColumn();
			moveToNextColumn();
			}
		repairColumn();	
	}	
	
/*
*checks for missing beeper in a column
*puts beeper if none present 
*/
	
	private void repairColumn(){
		turnLeft();
		while (frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
			}
			move();	
			if (noBeepersPresent()){
				putBeeper();
			}
		}
		turnAround();
		moveToWall();
		turnLeft();
	}
	
//while front is clear karel will move forward one space 

	private void moveToWall(){
		while (frontIsClear()){
			move();
		}
	}
	
//moves forward 4 spaces only
	 
	private void moveToNextColumn(){
		for (int i = 0; i<4; i++)
			move();
	}	
}
