package phase1.oopsconcepts;

public class oopsAssignment2 {
	public static void main(String[] args)
	{
		MNC mnc = new Hello();
		mnc.function1();
		mnc.function2();
		mnc.function3();
		
		
	}

}

abstract class MNC{
	
	MNC(){
		
	}
	abstract void function1();
	abstract void function2();
	void function3()
	{
		System.out.println("This is a function in MNC class");
	}
}

abstract class Infosys extends MNC{
	
	abstract void function4();
}

class Hello extends Infosys{
	
	@Override
	void function1() {
		System.out.println("This is function1");
		function4();
		function5();
	}
	@Override
	void function2() {
		System.out.println("This is function2");
	}
	@Override
	void function4() {
		System.out.println("This is function4");
	}
	void function5() {
		System.out.println("This is function5");
	}
}