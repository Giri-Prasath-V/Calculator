package com;

class Calculator
{
	public void add(int a, int b)
	{
		System.out.println("Addition : "+(a+b));
		
	}
	public void sub(int a, int b)
	{
		System.out.println("Subtract : "+(a-b));
		
	}
	public void mul(int a, int b)
	{
		System.out.println("Multiply : "+(a * b));
		
	}
	public void div(int a, int b)
	{
		System.out.println("Division : "+(a / b));
		
	}
}
	
public class CalculatorApp {

	public static void main(String[] args) {
		
			
			System.out.println("Calculator Operations......");
			 
			Calculator c1 = new Calculator();
			c1.add(10, 20);
			c1.sub(20, 10);
			c1.mul(10, 20);
			c1.div(10, 2);
			

		

	}

}
