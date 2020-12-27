public class BitwiseDemo{
	public static void main(String args[]){
		byte i = 127;	//01111111	(-128 to 127)
		byte j = 7;	//00000111
		
		System.out.println(~i);	//10000000
		System.out.println(j<<2);	//00011100	
		System.out.println(i<<2);	//00000010 - 508 (to be checked)
		
		
		byte p = 2;		//0000 0010
		byte q = 64;	//0100 0000	
		
		System.out.println(p>>2);	//00000001
		System.out.println(q>>2);	//00100000	
		
		byte x = 1; //00000001
		System.out.println(x>>>1);	//00001000
		
		byte m = 2;
		byte n = 4;
		
		/*
			0000 0010
			0000 0100
		*/
		System.out.println(m & n);
		System.out.println(m | n);
		System.out.println(m ^ n);
		
	}	
}


