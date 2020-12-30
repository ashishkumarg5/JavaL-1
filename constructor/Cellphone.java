//POJO - Plain Old Java Object, Bean class
public class Cellphone{
		private String brand = "ABC";
		private int ramSize;
		private boolean isSmartPhone;
		
		//Empty constructor
		//this keyword -- current object
		public Cellphone(){
			this.brand = "Raw Phone";
			this.ramSize = 1;
			this.isSmartPhone = false;
			
			System.out.println(this.brand + " " + this.ramSize + " " + this.isSmartPhone);
		}
		
		public Cellphone(String brand){
			this.brand = brand;
			ramSize = 1;
			isSmartPhone = false;
			
			System.out.println(this.brand + " " + this.ramSize + " " + this.isSmartPhone);
		}
		
		public Cellphone(String brand, int ramSize){
			this.brand = brand;
			this.ramSize = ramSize;
			isSmartPhone = false;
			
			System.out.println(this.brand + " " + this.ramSize + " " + this.isSmartPhone);
		}
		
		public Cellphone(String brand, int ramSize, boolean isSmartPhone){
			this.brand = brand;
			this.ramSize = ramSize;
			this.isSmartPhone = isSmartPhone;
			
			System.out.println(this.brand + " " + this.ramSize + " " + this.isSmartPhone);
		}
		
		public String getBrand(){
			return brand;
			
		}
		
		public void setBrand(String newBrand){
			brand = newBrand;
		}
		
		public int ramSize(){
			return ramSize;
		}
		
		public void ramSize(int newRamSize){
			ramSize = newRamSize;
		}
		
		public boolean isSmartPhone(){
			return isSmartPhone;
		}
		
		public void setBrand(boolean isNewSmartPhone){
			isSmartPhone = isNewSmartPhone;
		}
}
