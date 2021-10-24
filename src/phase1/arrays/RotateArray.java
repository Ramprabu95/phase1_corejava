package phase1.arrays;

public class RotateArray {
	
	
	
	public static void main(String args[])
	{
		int[] A = {90,43,32,2,88};
		int len_A = A.length;
		int temp = 0;
		int[] B = new int[len_A];
		for(int a = 0; a<len_A; a++)
		{
			if(a+3<len_A)
			{
				B[a+3] = A[a];
			}
			else
			{
				B[a-len_A+3] = A[a];
			}
		}
		
	}

}
