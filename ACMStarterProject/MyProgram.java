/* MyProgram.java
 * --------------
 * this program multiplies two doubles  
 * and then divides them in half
 * that is all i have to say on this matter
 */

import acm.program.*;

public class MyProgram extends ConsoleProgram {
	public void run() {
		double b = readDouble("Enter b: ");
		double h = readDouble("Enter h: ");
		double a = (b * h) / 2;
		println("a = " + a);
	}
}
