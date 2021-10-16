package phas1.strings.ass1;

public class comparing {
	
	public static void main(String[] args)
	{
		String t= "Delhi";   
		String o = "Mumbai"; 
		String k= "delhi";   
		String y= new String ("Mumbai");   
		String l= new String ("delhi");  
		String p = new String("Hello"); 
	    System.out.println(o == l);
	    System.out.println(o.equals(l));
	    System.out.println(y == p);
	    System.out.println(y.equals(p));
	    System.out.println(t == o);
	    System.out.println(t.equals(o));
	    System.out.println(k == y);
	    System.out.println(k.equals(y));
	    System.out.println(p == y);
	    System.out.println(o.equals(y));
	    
	   
	}

}
