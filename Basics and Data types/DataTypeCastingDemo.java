/* Type conversion or type casting -
	1. Widening or automatic type conversion
		byte -> short -> int -> long -> float -> double
*/

public class DataTypeCastingDemo{
	public static void main(String args[]){
		byte byteVar = 45;	//size - 1 byte (-127 to 128)
		//byte bigByteVar = 131;	//invalid
		short shortVar = 1091;
		int intVar = 997654;
		long longVar = 999999923l;
		float floatVar = 87123.45f;
		double doubleVar = 92865329865.12;
		boolean boolVar = false;
		char charVar = 'A';	
		
		//Automatic type casting
		doubleVar = floatVar;
		floatVar = longVar;
		longVar = intVar;
		intVar = shortVar;
		shortVar = byteVar;
		int newVar = charVar;
				
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);
		System.out.println(boolVar);
		System.out.println(charVar);
		System.out.println("newVar:" + newVar);
	}	
}
