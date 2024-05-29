//program to demonstrate user defined exception

package com.tnsif.exceptionhandling.userdefined;

import java.util.Scanner;

public class AgeTestDemo {
	public static void main(String[] args) {
		AgeTest at = new AgeTest();
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

		try {
			at.validate(age); // function which rise the exception
		} catch (InvalidAgeException e) {
			System.err.println("Caught an Exception: \n " + e.getMessage());
		}
		sc.close();
	}

	
}
