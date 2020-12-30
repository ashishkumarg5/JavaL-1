public class ConstructorDemo{
	public static void main(String args[]){
		Cellphone samsung = new Cellphone();
		Cellphone apple = new Cellphone("iPhone");
		Cellphone redmi = new Cellphone("note 4",4);
		Cellphone xiomi = new Cellphone("xyz",2,true);
		
		apple = null;
	}	
}
