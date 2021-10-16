package phase1.core.java;

public class DataTypeProgram {

	public static void main(String[] args) {
		//------------TYPECAST BETWEEN INT AND LONG----------//
		int i = 100;
		long l = i; // automatic type conversion from int to long
		System.out.println("long value "+ l);
		
		int o = (int) l; // explicit type cast from long to int
		System.out.println("int value"+ o);
		
		char t = (char) i;
		System.out.println("char value"+ t);
		//-----------TYPECAST BETWEEN DOUBLE AND FLOAT-------//
		double d  = 19067566565868.0079698542145214511;
		float r = (float) d;
		System.out.println("float value"+ r);
		System.out.println("double value"+ d);
		//---------TYPECAST FROM DOUBLE-->LONG-->INT in series----//
		double d2 = 190675665842102.125452125125542354;
		long l2 = (long) d2;
		int i2 = (int) l2;
		System.out.println("Double value"+ d2);
		System.out.println("Long value" + l2);
		System.out.println("Int value"+i2);
		//----------TYPECAST BETWEEN LONG AND FLOAT---------//
		float f = l;
		System.out.println("float value"+f);
		byte b;
		int ii = 257;
		double dd = 323.142;
		System.out.println("Conversion of int to byte.");
		b = (byte)ii;
		System.out.println("ii = "+ ii + "b = "+ b);
		System.out.println("\n Conversion of double to byte");
		b = (byte) dd;
		System.out.println("dd = "+dd+"b = "+b);

	}

}
