package phase1.oopsconcepts;

abstract class telephone
{
	abstract void lift();
	abstract void disconnected();
}

class smarttelephone extends telephone
{
	@Override
	void lift()
	{
		System.out.println("This is the lift function in smarttelephone class");
	}
	@Override
	void disconnected()
	{
		System.out.println("This is the disconnected function in smarttelephone class");
	}
}

public class oopsAssignment4 {
	
	public static void main(String[] args)
	{
		telephone obj1 = new smarttelephone();
		obj1.lift();
		obj1.disconnected();
	}

}
