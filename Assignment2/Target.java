/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	private static final int inch = 72;

	public void run() {

		// find centre of the window
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		// calculate radii of circles
		double circleR1 = inch;
		double circleR2 = inch * .65;
		double circleR3 = inch * .30;

		// generate the 3 ovals
		GOval circle1 = new GOval((x - circleR1), (y - circleR1), circleR1 * 2,
				circleR1 * 2);
		circle1.setFilled(true);
		circle1.setFillColor(Color.RED);
		add(circle1);

		GOval circle2 = new GOval((x - circleR2), (y - circleR2), circleR2 * 2,
				circleR2 * 2);
		circle2.setFilled(true);
		circle2.setFillColor(Color.WHITE);
		add(circle2);

		GOval circle3 = new GOval((x - circleR3), (y - circleR3), circleR3 * 2,
				circleR3 * 2);
		circle3.setFilled(true);
		circle3.setFillColor(Color.RED);
		add(circle3);
	}
}
