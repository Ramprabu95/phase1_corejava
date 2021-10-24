package phase1.arrays;

import java.util.Scanner;


public class RangeFinder 
{
	/*Here take two inputs from the user (L,H)
	 * Array A = [8,90,10,14,30,20,13]
	 * Then find the elements between these two values.
	 * Find the sum of all the elements between the rnage
	 * Exception to be thrown if the ranges are out of bounds*/
	@SuppressWarnings("serial")
	public static void main(String args[]) throws Arrexception
	{
		int A[] = {18,90,10,14,30,20,13};
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the lower value in the range");
		int L = myobj.nextInt();
		System.out.println("Enter the higher value in the range");
		int R = myobj.nextInt();
		
		if(L<0 || R<0)
		{
			throw new Arrexception("Negative integer entered");
		}
		if(L>6 || R>6)
			throw new Arrexception("Array index out of limit");
		if(L>R)
			throw new Arrexception("The lower index is greater than upper index");
		int sum = 0;
		for (int a = L;a<=R; a++)
		{
			sum = sum+A[a];
		}
		System.out.println("Sum is:"+sum);
	}
	
}


class Arrexception extends Exception{
	Arrexception(String exp)
	{
		super(exp);
	}
}
