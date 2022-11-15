/*
 Write an algorithm to implement access modifier functionality. 
Create two separate classes Customer & CustomerDriver inside  com.greatlearning.corejava; package 

Create various variables in class Customer of different access modifiers such as (private, public, protected) and initialize them with some values

Try accessing and printing them in CustomerDriver class.

 

After writing the algorithm, write suitable code, run the program, and check the output.
 */

package com.greatlearning.javacore;

import java.util.Scanner;

public class Customer {

	public String fullName;
	protected int age;
	protected String city;
	
	private String phoneNo;
	
	
	public Customer ()
	{
		fullName = "Snehal Kulkarni";
				
		age = 40;
		
		city = "Pune";
		
		phoneNo = "9822352292";
			
	}
	
	public void putOutput()
	{
		
	}
	

}
