//program to demonstrate finally block

package com.tnsif.exceptionhandlin.finallyblock;

public class FinallyBlockExOne {
	public static void divide(int a, int b) {
		int c;
		try {
			
			System.out.println("I am in try block");
			c = a / b;

			System.out.println("Result: " + c);
			

		} catch (ArithmeticException ae) {

			System.out.println("I am in catch block");
			System.exit(0);

		} finally {

			System.out.println("I am in finally block");

		}
		System.out.println("Statement after finally block");

	}
}
