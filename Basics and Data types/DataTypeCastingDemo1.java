/* Type conversion or type casting -
	2. Narrowing or explicit type conversion/casting
		double -> float -> long -> int -> short -> byte
*/

public class DataTypeCastingDemo1{
	public static void main(String args[]){
		byte byteVar = 45;
		short shortVar = 1091;	//65536
		int intVar = 997654;
		long longVar = 999999923l;
		float floatVar = 87123.45f;
		double doubleVar = 92865329865.12;
		boolean boolVar = false;
		char charVar = 'A';	
		
		//Explicit type casting
		byteVar = (byte)shortVar;
		shortVar = (short)intVar;
		intVar = (int)longVar;
		longVar = (long)floatVar;
		floatVar = (float)doubleVar;
		
		System.out.println("----------Explicity Type Conversion--------------");
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);	
	}	
}
