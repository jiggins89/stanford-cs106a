/*
 * File: DrawSnowman.java
 * -----------------------
 * This program draws a simple diagram of a snowman
 * It places the snowman in a particular position as 
 * defined by a coordinates.
 */

import acm.graphics.*;
import acm.program.*;

public class DrawSnowman extends GraphicsProgram {
	public void run() {
		// Head
		add (new GOval(250, 100, 100, 100));
		// Torso
		add (new GOval(200, 200, 200, 200));
		// Base
		add (new GOval(150, 400, 300, 300));
		// add the eyes of the Snowman 
		add (new GOval(275, 125, 10, 10));
		add (new GOval(315, 125, 10, 10));	
		// add the nose
		add (new GLabel ("V"),298,160);
		// add the mouth
		add (new GOval(290,170,20,20));
		// addbuttons
		add (new GRect(290,230,20,20));
		add (new GRect(290,280,20,20));
		add (new GRect(290,330,20,20));
	}
	
}