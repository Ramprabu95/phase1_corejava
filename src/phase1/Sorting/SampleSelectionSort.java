package phase1.Sorting;

import java.util.Scanner;

public class SampleSelectionSort {

	static void selectionSort(int A[])
	{
		int l = A.length;
		System.out.println("The input array is");
		for (int a = 0; a < l; a++)
		{
			System.out.print(A[a]+" ");
		}
		System.out.println();
		for (int a = 0; a < l; a++)
		{
			int small = A[a];
			int index = a;
			for(int b = a; b<l ; b++)
			{
				if(A[b]<small)
				{
					small = A[b];
					index= b;
				}
			}
			int temp = A[index];
			A[index] = A[a];
			A[a] = temp;
		}
		System.out.println("The output array is");
		for (int a = 0; a < l; a++)
		{
			System.out.print(A[a]+ " ");
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number of integers in the array");
		Scanner scanner = new Scanner(System.in);
		int len_arr = scanner.nextInt();
		int[] arr = new int[len_arr];
		System.out.println("Enter the elements in the array to be sorted");
		for (int i = 0; i<len_arr; i++)
		{
			arr[i] = scanner.nextInt();
		}
		selectionSort(arr);
	}
	
}
