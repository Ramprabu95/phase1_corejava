package phase1.threading;
class Operations{
	void factorial(int a) {
		synchronized(this) {
			int product = 1;
			for(int b = a; b>0;b--)
			{
				product = product*b;
			}
			System.out.println("Factorial is"+product);
		}
		
	}
	void sum (int a, int b) {
		synchronized(this) {
			int sum = a+b;
			System.out.println("Sum is"+sum);
		}
	}
	
}

class Factorial extends Thread{
	Operations t;
	int number;
	Factorial(Operations t, int number)
	{
		this.t = t;
		this.number = number;
	}
	public void run() {
		System.out.println("Into the run method of factorial");
		t.factorial(number);
	}
}

class Sumfinding extends Thread{
	Operations t;
	int number1;
	int number2;
	Sumfinding(Operations t,  int number1, int number2)
	{
		this.t = t;
		this.number1 = number1;
		this.number2 = number2;
	}
	public void run() {
		System.out.println("Into the run method of sumfinding");
		t.sum(number2, number1);
	}
}
public class ThreadingAssignment1 {

	public static void main(String[] args) {
		
		Operations obj = new Operations();
		Factorial t1 = new Factorial(obj, 4);
		Factorial t2 = new Factorial(obj, 6);
		Sumfinding t3 = new Sumfinding(obj,4, 5);
		Sumfinding t4 = new Sumfinding(obj, 100, 200);
		t2.start();
		t4.start();
		t1.start();
		t3.start();
		
	}
}
