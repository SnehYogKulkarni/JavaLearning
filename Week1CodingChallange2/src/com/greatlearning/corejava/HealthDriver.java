/*
 Description
Write an algorithm to implement access modifier functionality. 
Create two separate classes Health & HealthDriver inside  com.greatlearning.corejava; package 

Declare variables age(int), weight(float) & bmi(float) inside class Health as protected.

Display all the variable in class HealthDriver

 

After writing the algorithm, write suitable code, run the program, and check the output.

 

Algorithm

Step 1: Start

. . .

. . .

. . .

Step n: Stop
  
 */
package com.greatlearning.corejava;

public class HealthDriver {

	
	public static void main(String args[])
	{
		Health health = new Health();
		
		health.getInput();
		System.out.println();
		health.putOutput();
	}
}

