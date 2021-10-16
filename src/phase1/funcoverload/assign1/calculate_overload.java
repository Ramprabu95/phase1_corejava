package phase1.funcoverload.assign1;

public class calculate_overload {

	public int calculate(int a, int b)
	{
		int c = a+b;
		return (c);
	}
	
	public float calulate(float rad)
	{
		return (22/7*rad*rad);
	}
	public int calulate(float len, float wid)
	{
		return ((int)(len*wid));
	}
	public static void main(String[] args)
	{
		calculate_overload obj = new calculate_overload();
		System.out.println(obj.calculate(2, 3));
		System.out.println(obj.calulate((float) 2.54));
		System.out.println(obj.calulate((float)1.5, (float)2.3));
		
	}
}
