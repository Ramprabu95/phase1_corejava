package phase1.modifiers.p2;
import phase1.modifiers.p1.*;
public class ClassY extends ClassN{
	public static void use()
	{
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
		
		
		
	}
	
	
	

}