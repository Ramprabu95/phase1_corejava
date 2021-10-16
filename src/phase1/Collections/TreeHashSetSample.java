package phase1.Collections;
import java.util.*;

public class TreeHashSetSample {
	
	public static void main(String[] args)
	{
		TreeSet<String> hs=new TreeSet<String>();
		
		hs.add("d");
		hs.add("c");
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("i");
		hs.add("l");
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains this 'u' element  " + hs.contains("u"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("remove the element "+hs.remove("i"));
		
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());
	    
	    TreeSet hs1=new TreeSet();
		
		hs1.add(10000L);
		hs1.add(100L);
		hs1.add("b");
		hs1.add("a");
		hs1.add("c");
		hs1.add("i");
		hs1.add("l");
				
		System.out.println("Hashset is "+hs1);
		System.out.println("Size of Hashset is "+ hs1.size());
		
		System.out.println("Does hashset contains this 'u' element  " + hs1.contains("b"));		
		System.out.println("is hashset empty  " + hs1.isEmpty());
		System.out.println("remove the element "+hs1.remove("i"));
		
		
	    hs1.clear();
	    System.out.println("get class  " +hs1.getClass());
		
	    System.out.println("is hashset empty  " +hs1.isEmpty());

	}

}
