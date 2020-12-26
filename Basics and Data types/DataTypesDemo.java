/*
Scope of variable -

1. Local variables (Method local) aren't initialized with default values. We need to explicitly provide the initialization value.
2. Class variables
3. Instance variables
*/

public class DataTypesDemo{
	public static void main(String args[]){
		byte byteVar = 45;	//size - 1 byte (-127 to 128)
		//byte bigByteVar = 131;	//invalid
		short shortVar = 1091;
		int intVar = 997654;
		long longVar = 999999923l;
		float floatVar = 87123.45f;
		double doubleVar = 92865329865.12;
		boolean boolVar = false;
		
		//ASCII - 8 bits (256), UNICODE - 16 bits(65536)
		char charVar = 49;	//unicode
		char charVar1 = 'A';
		
		System.out.println(byteVar);
		System.out.println("Big Byte Var : " + bigByteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);
		System.out.println(boolVar);
		System.out.println(charVar);
		System.out.println(charVar1);

	}	
}
