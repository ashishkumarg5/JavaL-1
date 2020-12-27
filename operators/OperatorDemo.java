public class OperatorDemo{
	public static void main(String args[]){
		//new allocate memory
		int[] intArr = new int[5];
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		
		System.out.println(intArr[3]);
		
		int i = 10;
		
		//Post increment : i++ => i = i+1
		System.out.println(i++);
		System.out.println(i);
		System.out.println(i--);
		System.out.println(i);
		
		System.out.println("------------------");
		
		int x = 10;
		int y = 15;
		System.out.println(x++ + y++);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("------------------");
		
		int j = 10;
		System.out.println(++j);
		System.out.println(j);
		System.out.println(--j);
		System.out.println(j);
		
		int p = 10;
		int q = 15;
		
		System.out.println(p++ + ++q + --q); //40
		System.out.println("p = " + p);
		System.out.println("q = " + q);
		
	}	
}
