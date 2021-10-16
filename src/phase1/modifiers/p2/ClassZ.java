package phase1.modifiers.p2;

import phase1.modifiers.p1.ClassM;
import phase1.modifiers.p1.ClassN;
import phase1.modifiers.p1.ClassP;

public class ClassZ {
	
	public static void main (String[] args)
	{
		new ClassY().use();
		ClassM obj = new ClassM();
		obj.function1();
		//obj.function2();
		
		ClassN obj1 = new ClassN();
		obj1.function1();
	//	obj1.function2();
		ClassX obj2 = new ClassX();
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		System.out.println(obj2.d);
		ClassP obj3 = new ClassP();
		obj3.function1();
	}

}
