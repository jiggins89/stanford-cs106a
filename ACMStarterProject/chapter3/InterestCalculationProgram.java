package chapter3;

/*
 * InterestCalculatingProgram.java
 * -------------------------------
 * This program calculates the amount of interest on a sum of money
 * over the course of a year. This program does not allow for any 
 * deposits or withdrawals
 */

import acm.program.*;

public class InterestCalculationProgram extends ConsoleProgram{
	
	public void run(){
		println ("This program calculates the amount of " +
				"interest you could save in one year");
		double StartingBalance = readDouble ("Enter starting balance:");
		double InterestRate = readDouble ("EnterInterestRate:");
		double BalanceAfterYearOne = (StartingBalance/100) * InterestRate 
			   							+ StartingBalance;
		double BalanceAfterYearTwo = (BalanceAfterYearOne/100) * InterestRate 
										+ BalanceAfterYearOne;
		
		println ("Balance after year one = " + BalanceAfterYearOne);
		println ("Balance after year two = " + BalanceAfterYearTwo);
	}
	
}