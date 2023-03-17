/**
   Document: Calculator.
   Created on: Mar. 17, 2023.
   Author: Engineer. Howard Fernando Del Angel Leija.
**/

package com.technoglobal.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
	    System.out.println("1. Addition");
	    System.out.println("2. Substraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Divition");
	    System.out.println("0. Exit");
	    System.out.println("\n");
	    
	int num1;
	int num2;
	
	String operation;
		
	Scanner input = new Scanner(System.in);
	    System.out.println("please enter the first number: ");
	    num1 = input.nextInt();
	    
	    System.out.println("please enter the second number: ");
	    num2 = input.nextInt();
	    
	    Scanner op =  new Scanner(System.in);
	    
	    System.out.println("please enter the operaton");
	    operation = op.next();
	    
	    if(operation == "+");
	    {
		    System.out.println("your answer is: " + (num1 + num2));
	    }
	    if(operation == "-");
	    {
		    System.out.println("your answer is: " + (num1 - num2));
	    }
	    if(operation == "*");
	    {
		    System.out.println("your answer is: " + (num1 * num2));
	    }
	    if(operation == "/");
	    {
		    System.out.println("your answer is: " + (num1 / num2));
	    }
    }
}