package phase1.oopsconcepts;


public class oopsAssignment1 {
	
public static void main(String[] args)
{
	Vehicle v1 = new W2();
	Vehicle v2 = new W3();
	Vehicle v3 = new W4();
	Vehicle v4 = new W8();
	
	v1.run();
	v1.stop();
	v2.run();
	v2.stop();
	v3.run();
	v3.stop();
	v4.run();
	v4.stop();
	v1.fuel(0);
	v1.fuel('p', 0);
	v1.fuel(0, "pp");;
}
	
}


abstract class Vehicle {
	Vehicle()
	{
		speed = 0;
		distance = 0;
	}
	Vehicle(int speed, long distance)
	{
		this.speed = speed;
		this.distance = distance;
	}
	abstract void run();
	abstract void stop();
	int speed;
	long distance;
	public void fuel(int a)
	{
		System.out.println(a);
	}
	public void fuel(float a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void fuel(char a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}

class W2 extends Vehicle{
	
	W2()
	{
		speed = 2;
		distance = (long)2;
		num_of_tyre = 2;
	}
	
	int speed;
	long distance;
	int num_of_tyre;

	@Override
	void run()
	{
		System.out.println("This is run method in 2W class");
		display();
	}
	@Override
	void stop()
	{
		System.out.println("This is the stop method in 2W class");
	}
	void display()
	{
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(num_of_tyre);
		System.out.println(super.speed);
		System.out.println(super.distance);
		
	}
}

class W3 extends Vehicle{
	
	W3()
	{
		speed = 3;
		distance = (long)3;
		num_of_tyre = 3;
	}
	
	int speed;
	long distance;
	int num_of_tyre;

	@Override
	void run()
	{
		System.out.println("This is run method in 3W class");
		display();
	}
	@Override
	void stop()
	{
		System.out.println("This is the stop method in 3W class");
	}
	void display()
	{
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(num_of_tyre);
		System.out.println(super.speed);
		System.out.println(super.distance);
		
	}
}

class W4 extends Vehicle{
	
	W4()
	{
		speed = 4;
		distance = (long)4;
		num_of_tyre = 4;
	}
	
	int speed;
	long distance;
	int num_of_tyre;

	@Override
	void run()
	{
		System.out.println("This is run method in 4W class");
		display();
	}
	@Override
	void stop()
	{
		System.out.println("This is the stop method in 4W class");
	}
	void display()
	{
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(num_of_tyre);
		System.out.println(super.speed);
		System.out.println(super.distance);
		
	}
}

class W8 extends Vehicle{
	
	W8()
	{
		speed = 8;
		distance = (long)8;
		num_of_tyre = 8;
	}
	
	int speed;
	long distance;
	int num_of_tyre;

	@Override
	void run()
	{
		System.out.println("This is run method in 8W class");
		display();
	}
	@Override
	void stop()
	{
		System.out.println("This is the stop method in 8W class");
	}
	void display()
	{
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(num_of_tyre);
		System.out.println(super.speed);
		System.out.println(super.distance);
		
	}
}


