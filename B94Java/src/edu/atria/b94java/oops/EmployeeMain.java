package edu.atria.b94java.oops;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation of scanner class
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the employee details..."); int id=sc.nextInt();
		 * String name=sc.next(); double salary=sc.nextDouble(); String
		 * designation=sc.next();
		 */

		/*
		 * eOne.setId(id); eOne.setName(name); eOne.setSalary(salary);
		 * eOne.setDesignation(designation);
		 * 
		 * System.out.println("printing the employee id: "+eOne.getId());
		 * System.out.println("printing the employee name: "+eOne.getName());
		 * System.out.println("printing the employee salary: "+eOne.getSalary());
		 * System.out.println("printing the employee designation: "+eOne.getDesignation(
		 * ));
		 */

		// calling default constructor
		// className objName = new className();
		/*
		 * Employee eOne = new Employee(); System.out.println(eOne);
		 */

		// calling parameterized constructor
		Employee eTwo = new Employee(101, "Rahul", 56000.00, "Developer");
		System.out.println(eTwo);

	}

}
