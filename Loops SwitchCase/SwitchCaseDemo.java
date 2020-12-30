public class SwitchCaseDemo{
	
	public static void main(String args[]){
		String accountType = "Salary";
		int x = 100;
		int y = 200;
		int z = 0;
		
		switch(accountType){
			case "Saving":
				System.out.println("This is saving account");
				break;
			case "Current":
				System.out.println("This is Current account");
				System.out.println("This is Current account - 2");
				break;
			case "PPF":
				System.out.println("This is PPF account");
				break;
			case "Deposit":
				System.out.println("This is Deposit account");
				break;
			case "Loan":
				System.out.println("This is Loan account");
				break;
			default:
				System.out.println("This is Other account");
		}
	
		
		z = (x == 500) ? 5 : ((y==200) ? 1 : 2);
		
		System.out.println(z);

		
		
	}	
}
