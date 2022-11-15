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

Solution :: 

Algorithm


 */
package com.greatlearning.corejava;
import java.util.*;


public class Health {

	protected int age;
	protected float weight;
	protected float bmi;
	
	protected void getInput()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Age  :: ");
		this.age = sc.nextInt();
		
		System.out.println(" Enter weight  :: ");
		this.weight = sc.nextFloat();
		
		System.out.println(" Enter bmi  :: ");
		this.bmi = sc.nextFloat();
	}
	
	
	protected void putOutput() {
		
		System.out.println(" Age  :: " + this.age);
		
		System.out.println(" Weight  :: " + this.weight);
		
		System.out.println(" BMI  :: " + this.bmi);
	}
}
