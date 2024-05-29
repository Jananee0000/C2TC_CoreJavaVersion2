//program to demonstrate try catch block

package com.tnsif.exceptionhandling.trycatch;

public class TryCatchExample {
	public static void divide(int x, int y) 
	 { 
		System.out.println("I am in method");
		 float f=12/0.0f;
		  System.out.println(f);
	  
	  try 
	  { 
		  int z;
		  z = x/y;
	    System.out.println("I am in try block"); 
	      //exception occurred 
	    System.out.println("Result of z: " +z);  // this message will not be printed
	  } 
	  catch(ArithmeticException np)  // catch block to handle the exception
	  { 
	    System.err.println("I am in catch block" +np.getMessage()); 
	  }
	  
 }
}
