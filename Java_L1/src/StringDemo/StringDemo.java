package StringDemo;

public class StringDemo {
	public static void main(String ...args) {
		int x = 928363971;
		String y = "123456";
		String str = String.valueOf(x);

		char[] myArr = y.toCharArray();
		String[] newArr = y.split("");
		
		System.out.println(myArr[0]);
		System.out.println(newArr[0]);
		
		//Wrapper classes - Integer, Float, Double, Long
		int convertedStr = Integer.parseInt(y);
		
		int finalSum = 0;
		
		//Looping a string
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			String s = String.valueOf(c);
			int charDigit = Integer.parseInt(s);
			
			finalSum = finalSum + charDigit;
		}
		
		System.out.println(finalSum);
	
	}
}
