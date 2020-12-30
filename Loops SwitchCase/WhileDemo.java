public class WhileDemo{
	
	public static void main(String args[]){
		
		int i = 99;
		
		while(i<10){
			System.out.println(i++);
		}
		
		do{
			System.out.println(i++);
		}while(i<10);
	}
}
