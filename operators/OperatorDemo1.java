public class OperatorDemo1{
	
	public static void main(String args[]){
		int i = 5;
		int j = 7;
		
		if(!(i == 5)){
			System.out.println("true");
		}else{
			System.out.println("false " + "Condition");
		}
		
		Beverage b1 = new Beverage();
		Pizza p1 = new Pizza();
		
		if(b1 instanceof Pepsi){
			System.out.println("Beverage object");
		}else{
			System.out.println("false");
		}
		
		if((i == 5) || (j == 7)){
			System.out.println("i equals 5 and j equals 7");
		}else{
			System.out.println("false");
		}
		

		i += 1;
		System.out.println(i);
		i -= 2;
		System.out.println(i);
	}
}

class Beverage{
	String name;
	String taste;
	int price;
}

class Pepsi extends Beverage{
	String companyName;
}

class Pizza {
	String name;
	String brand;
	int price;
}
