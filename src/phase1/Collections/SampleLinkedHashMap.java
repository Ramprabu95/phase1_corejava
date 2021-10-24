package phase1.Collections;
import java.util.*;
public class SampleLinkedHashMap {
	
	public static void main(String args[])
	{
		Map<Integer, String>  fruits= new LinkedHashMap<Integer, String>();
		fruits.put(1, "banana");
		fruits.put(2, "apple");
		fruits.put(10, "pears");
		fruits.put(6, "mango");
		fruits.put(4, "cherry");
		
		System.out.println("Contents of the linked hash map"+ fruits);
		System.out.println("Does the map have a banana? Answer :"+ fruits.containsValue("banana"));
		System.out.println("Size of the map is :"+fruits.size());
		System.out.println("Clearing the map");
		fruits.clear();
		System.out.println("New size is : "+ fruits.size());
	}
	

}
