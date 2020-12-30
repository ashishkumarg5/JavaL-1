public class ForLoopDemo{
	
	public static void main(String args[]){
		
		int[] intArr = new int[10];
		
		int y = 10;
		y = 70;
		
		
		for(int i = 0 ; i<10 ; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 0 ; i<10 ; i++){
			intArr[i] = i + 5;	//5 6 7 8 9 10 11 12 13 14
		}
		
		//Enhanced for loop -- List, Array
		for(int x : intArr){
			x = 2*x;
			System.out.println(x);
		}
		
		//continue -- skip an iteration
		for(int i = 0 ; i<10 ; i++){
			if(i == 3 || i==7)
				continue;
				
			System.out.println("--------BEGIN---------");
			System.out.println(i);
			System.out.println(i * 2);
			System.out.println("--------END------");
		}
		
		//break -- terminate the loop
		for(int i = 0 ; i<10 ; i++){
			if(i == 5)
				break;
	
			System.out.println("** " + i + " **");
		}
		
	}	
}
