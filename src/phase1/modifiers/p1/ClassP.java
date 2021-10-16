package phase1.modifiers.p1;

public class ClassP {
	
	public static void main(String[] args)
	{
		ClassM obj1 = new ClassM();
		obj1.function1();
		obj1.function2();
		obj1.function3();
		//System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		ClassN obj2 = new ClassN();
		obj2.function1();
		obj2.function2();
		obj2.function3();
		System.out.println(obj2.i1);
		System.out.println(obj2.j1);
		System.out.println(obj2.k1);		
		
	}

	public void function1() {
		System.out.println("This is a public function in class n");
	}
	protected void function2() {
		System.out.println("This is a protected function in class n");
	}
	void function3() {
		System.out.println("This is a default function in class n");
	}
	private void function4() {
		System.out.println("This is a private function in class n");
	}
}
