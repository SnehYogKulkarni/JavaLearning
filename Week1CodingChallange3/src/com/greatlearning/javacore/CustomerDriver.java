/*
 Write an algorithm to implement access modifier functionality. 
Create two separate classes Customer & CustomerDriver inside  com.greatlearning.corejava; package 

Create various variables in class Customer of different access modifiers such as (private, public, protected) and initialize them with some values

Try accessing and printing them in CustomerDriver class.

 

After writing the algorithm, write suitable code, run the program, and check the output.
 */

package com.greatlearning.javacore;

public class CustomerDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		System.out.println(" Output ---------");
		System.out.println(" Name of Customer :: " + customer.fullName);
		System.out.println(" Age of Customer  :: "+ customer.age);
		System.out.println(" City of Customer :: " + customer.city);
		// System.out.println(" Phone NUmber of Customer  :: "+ customer.phoneNo);    ---------------> This will give compilation error


	}

}
