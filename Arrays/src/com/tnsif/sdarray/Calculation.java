package com.tnsif.sdarray;

import java.util.Scanner;

public class Calculation {
	// Create one-dimensional array with size n.
    int[] marks = new int[5];
   
   public  void calculate() {
	   System.out.println("Enter your marks obtained in subjects:"); 
	// Store elements into the array using for loop.
	   
	   Scanner sc = new Scanner(System.in);
	   for(int i = 0; i < 5; i++) {
		marks[i] = sc.nextInt();
		
		
	   }
		// Find the total marks obtained in subjects.
		   int total = 0;
		   for(int i = 0; i < 5; i++) {
			 total += marks[i]; // Or, total = total + marks[i]. 
		   }
		// Display the total marks on the console.
		     System.out.println("Total marks: " +total);
		     
		     //Find the percentage.
		     float percentage = (float)total/5; // Casting.
		     System.out.println("Percentage: " +percentage+ "%");
		     sc.close();

		 }
	
   }
      

