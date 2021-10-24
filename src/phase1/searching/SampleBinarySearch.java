package phase1.searching;

import java.util.Scanner;

public class SampleBinarySearch {

	static int binarySearch(int A[], int start, int end, int value)
	{
		int index = -1;
		int mid = (start+end)/2;
		if(start == end)
			return index;
		if(value > A[mid])
		{
			start = mid+1;
			index = binarySearch(A, start, end, value);
		}
		else if(value < A[mid])
		{
			end = mid-1;
			index = binarySearch(A, start, end, value);
		}
		else {
			index = mid;
		}
		
		return index;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number of integers in the array");
		Scanner scanner = new Scanner(System.in);
		int len_arr = scanner.nextInt();
		int[] arr = new int[len_arr];
		System.out.println("Enter the elements in the array in ascending order");
		for (int i = 0; i<len_arr; i++)
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int num_ser = scanner.nextInt();
		int return_found = binarySearch(arr,0,len_arr-1,num_ser);
		if(return_found == -1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found"+return_found+1);
		}
	}
}
