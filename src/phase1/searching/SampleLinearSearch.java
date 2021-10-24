package phase1.searching;
import java.util.Scanner;

public class SampleLinearSearch {
	
	public static void main(String args[])
	{
		System.out.println("Enter the number of integers in the array");
		Scanner scanner = new Scanner(System.in);
		int len_arr = scanner.nextInt();
		int[] arr = new int[len_arr];
		
		for (int i = 0; i<len_arr; i++)
		{
			arr[i] = scanner.nextInt();
		}
		int num_ser = scanner.nextInt();
		for (int i = 0; i<len_arr; i++)
		{
			if(arr[i] == num_ser)
			{
				System.out.print("Element found");
			}
		}
				
	}

}
