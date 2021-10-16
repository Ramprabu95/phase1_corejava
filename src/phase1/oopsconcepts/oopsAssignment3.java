package phase1.oopsconcepts;

abstract class pen{
	abstract void write();
	abstract void refill();
	
}

class fountainpen extends pen{
	public void Nib()
	{
		System.out.println("This is the Nib function in the fountainpen class");
	}
	@Override
	void write()
	{
		System.out.println("This is write function in fountainpen class");
	}
	
	@Override
	void refill()
	{
		System.out.println("This is the refill function in the fountainpen class");
	}

}

class monkey{
	void jump()
	{
		System.out.println("This is the jump function in the monkey class");
	}
	void bite()
	{
		System.out.println("This is the bite function in the monkey class");
	}


}

interface animal{
	void eat();
	void sleep();
}

class human extends monkey implements animal{
	public void eat()
	{
		System.out.println("This is the eat function in the human class");
	}
	
	public void sleep()
	{
		System.out.println("This is the sleep function in the human class");
	}
}
public class oopsAssignment3 {
	public static void main(String[] args)
	{
		pen obj1 = new fountainpen();
		obj1.write();
		obj1.refill();
		human obj2 = new human();
		obj2.bite();
		obj2.eat();
		obj2.jump();
		obj2.sleep();
	}
	
	
	
	

}
