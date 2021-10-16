package phase1.inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("bark");
	}
}
class BabyDog extends Dog
{
	void babybark()
	{
		System.out.println("Baby bark");
	}
}
public class MultiLevel {
	
	public static void main(String[] args)
	{
		BabyDog p = new BabyDog();
		p.babybark();
		p.bark();
		p.eat();
	}

}
