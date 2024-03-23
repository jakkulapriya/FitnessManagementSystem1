package com.FMS;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
	public static void mainoperations()
	{
		System.out.println("1.User details");
		System.out.println("2.Workout details");
		System.out.println("3.Nutrition details");
		System.out.println("4.Progress details");
		System.out.println("5.Feedback details");
		
		
		int choice = sc.nextInt();
		switch(choice)
		        {
		case 1:
			AllOperations.Useroperations();
			System.out.println("=====================");
			break;
		
		
	   case 2:
		   AllOperations.workoutOperations();
		   System.out.println("=====================");
		   break;
		   
	   
	   case 3:
		   AllOperations.nutritionOperations();
		   System.out.println("=====================");
		   break;  
		   
	   case 4:
		   AllOperations.progressOperations();
		   System.out.println("=====================");
		   break;
		   
	   case 5:
		   AllOperations.feedbackOperations();
		   System.out.println("=====================");
		   break;
		   	   
	}
	}
    public static void main( String[] args )
    {
        mainoperations();
    }
}
