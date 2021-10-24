package phase1.exceptionHandling;

import java.util.Scanner;


public class assignment2 {

	static int add (int num1, int num2)
	{
	
		return num1+num2;
		
	}
	public static void main(String args[])
	{
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1 :");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number :");
		int num2 = scanner.nextInt();
		try {
			result = add(num1,num2);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.print(false);
		}
	}
}
