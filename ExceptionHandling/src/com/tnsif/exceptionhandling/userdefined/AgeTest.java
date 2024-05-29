//program to demonstrate user defined exception

package com.tnsif.exceptionhandling.userdefined;

public class AgeTest {
	public  void validate(int age) throws InvalidAgeException {

		if (age < 18)
			//throw new InvalidAgeException("Invalid Age, You are not eligible to vote");
			throw new InvalidAgeException();
		else
			System.out.println("Welcome to vote");
	}
}
