//program to demonstrate user defined exception

package com.tnsif.exceptionhandling.userdefined;
//extends Exception class
public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		//super("Invalid Age");
	}

	InvalidAgeException(String message) {
		//super(message);
	}

}
